package br.com.tenorio.stephano.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.tenorio.stephano.base.BaseRest;
import br.com.tenorio.stephano.entity.Demand;
import br.com.tenorio.stephano.model.Card;
import br.com.tenorio.stephano.model.Member;

@Service
public class TrelloRestService extends BaseRest {

	private String key;
	private String token;
	private String board;
	private String membersDefault;
	private String requestDefault;

	@Autowired
	public TrelloRestService(Environment env) {
		key = env.getProperty("TRELLO_KEY");
		token = env.getProperty("TRELLO_TOKEN");
		board = env.getProperty("TRELLO_BOARD");
		membersDefault = env.getProperty("MEMBERS_DEFAULT");
		requestDefault = env.getProperty("TRELLO_REQUEST_DEFAULT");
	}

	@SuppressWarnings("unchecked")
	public List<Card> getCards() {
		return new ObjectMapper().convertValue(
				(List<Card>) getResponse(getFormatedRequest("boards/" + getBoard() + "/cards"), new ArrayList<>()),
				new TypeReference<List<Card>>() {
				});
	}

	public Card getCard(String idCard) {
		return (Card) getResponse(getFormatedRequest("cards/" + idCard), Card.class);
	}

	private String getBoard() {
		return board;
	}

	private String getFormatedRequest(String context) {
		StringBuilder sb = new StringBuilder();
		sb.append(requestDefault)
			.append(context)
			.append(sb.toString().contains("?") ? "&" : "?")
			.append("key=")
			.append(key)
			.append("&token=")
			.append(token);
		return sb.toString();
	}
	
	public Member getMember(String idMember) {
		return (Member) getResponse(getFormatedRequest("members/" + idMember),Member.class);
	}

	public void addComment(Demand demand) {
		StringBuilder comment = new StringBuilder();
		comment.append(demand.getUser())
			.append(" alterou o chamado às ")
			.append(demand.getDateLastCommentScuaFormatted())
			.append(" para: '")
			.append(demand.getStatusScua())
			.append("' ");
		if(StringUtils.isNotBlank(demand.getLastCommentScua())) {
			comment.append("com o seguinte comentário: '")
			.append(demand.getLastCommentScua())
			.append("' ");
		}
		comment.append("por favor verificar ")
			.append(membersDefault);
		postResponse(getFormatedRequest("cards/" + demand.getIdTrello() + "/actions/comments?text=" + comment.toString()), String.class);
	}
}
