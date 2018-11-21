package br.com.tenorio.stephano.service;

import org.apache.commons.lang3.SerializationUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import br.com.tenorio.stephano.base.BaseRest;
import br.com.tenorio.stephano.entity.Demand;
import br.com.tenorio.stephano.model.LastCommentScua;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScuaService extends BaseRest {

	private static final Logger log = LoggerFactory.getLogger(ScuaService.class);
	
	private List<String> cookies;
	private String acceptLanguage;
	private String accept;
	private Integer actionDateColumn;
	private Integer commentColumn;
	private String connection;
	private String contentType;
	private String dnt;
	private String host;
	private String imageX;
	private String imageY;
	private String language;
	private String login;
	private Integer newStatusColumn;
	private String redirect;
	private String referer;
	private String senha;
	private String tipoAcao;
	private String upgradeInsecureRequests;
	private String urlDemandScua;
	private String urlScua;
	private String userAgent;
	private Integer userColumn;

	@Autowired
	public ScuaService(Environment env) {
		acceptLanguage = env.getProperty("ACCEPT_LANGUAGE");
		accept = env.getProperty("ACCEPT");
		actionDateColumn = Integer.parseInt(env.getProperty("ACTION_DATE_COLUMN"));
		commentColumn = Integer.parseInt(env.getProperty("COMMENT_COLUMN"));
		connection = env.getProperty("CONNECTION");
		contentType = env.getProperty("CONTENT_TYPE");
		dnt = env.getProperty("DNT");
		host = env.getProperty("HOST");
		imageX = env.getProperty("IMAGE.X");
		imageY = env.getProperty("IMAGE.Y");
		language = env.getProperty("LANGUAGE");
		login = env.getProperty("LOGIN");
		newStatusColumn = Integer.parseInt(env.getProperty("NEW_STATUS_COLUMN"));
		redirect = env.getProperty("REDIRECT");
		referer = env.getProperty("REFERER");
		senha = env.getProperty("PASSWORD");
		tipoAcao = env.getProperty("TYPE_ACTION");
		upgradeInsecureRequests = env.getProperty("UPGRADE_INSECURE_REQUESTS");
		urlDemandScua = env.getProperty("URL_DEMAND_SCUA");
		urlScua = env.getProperty("URL_SCUA");
		userAgent = env.getProperty("USER_AGENT");
		userColumn = Integer.parseInt(env.getProperty("USER_COLUMN"));
		cookies = getCookies();
	}

	public Demand getLastCommentScua(Demand demand) {
		Demand newDemand = SerializationUtils.clone(demand);
		LastCommentScua lastCommentScua = findLastCommentOnScua(newDemand.getId());
		newDemand.setLastCommentScua(lastCommentScua.getComment());
		newDemand.setDateLastCommentScua(lastCommentScua.getActionDate());
		newDemand.setStatusScua(lastCommentScua.getNewStatus());
		newDemand.setUser(lastCommentScua.getUser());
		return newDemand;
	}

	private LastCommentScua findLastCommentOnScua(String demandId) {
		Document document = Jsoup.parse(getResponseScua(demandId));
		return convertElementsToLastCommentScua(document.select("tr.bgClaro"));
	}

	public String getResponseScua(String demandId) {
		HttpHeaders headers = new HttpHeaders();
		headers.addAll("Cookie", this.cookies);
		setHeaders(headers);
		return (String) getResponse(urlDemandScua + demandId, String.class);
	}

	private String getChild(Elements children, int column) {
		return children.get(column).toString().replaceAll("(?s)<[^>]*>(\\s*<[^>]*>)*", " ").replace("&nbsp;", "").trim();
	}

	private LastCommentScua convertElementsToLastCommentScua(Elements elements) {
		LastCommentScua lastCommentScua = new LastCommentScua();
		Element element = elements.first();
		if (element != null) {
			Elements children = element.children();
			lastCommentScua.setActionDate(getChild(children, actionDateColumn));
			lastCommentScua.setUser(getChild(children, userColumn));
			lastCommentScua.setNewStatus(getChild(children, newStatusColumn));
			lastCommentScua.setComment(getChild(children, commentColumn));
		}
		return lastCommentScua;
	}

	public List<String> getCookies() {
		super.setHeaders(getHeaders());
		ResponseEntity<String> response = postResponse(urlScua, getParameters());
		try {
			HttpHeaders headers = response.getHeaders();
//            return headers.getFirst(HttpHeaders.SET_COOKIE).split(" ")[0].replace(";", "");
            return headers.get(HttpHeaders.SET_COOKIE);
		} catch (Exception e) {
			log.error("Erro no login do Scua, erro: '{}', StackTrace: {}", e.getMessage(), e);
		}
		return null;
	}

	private HttpHeaders getHeaders() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Host", host);
		httpHeaders.add("User-Agent", userAgent);
		httpHeaders.add("Accept", accept);
		httpHeaders.add("Accept-Language", acceptLanguage);
		httpHeaders.add("Referer", referer);
		httpHeaders.add("Content-Type", contentType);
		httpHeaders.add("DNT", dnt);
		httpHeaders.add("Connection", connection);
		httpHeaders.add("Upgrade-Insecure-Requests", upgradeInsecureRequests);
		return httpHeaders;
	}

	private MultiValueMap<String, String> getParameters() {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("login", login);
		map.add("senha", senha);
		map.add("language", language);
		map.add("tipo_acao", tipoAcao);
		map.add("redirect", redirect);
		map.add("image.x", imageX);
		map.add("image.y", imageY);
		return map;
	}
}
