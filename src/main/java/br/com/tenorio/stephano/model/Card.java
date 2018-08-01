
package br.com.tenorio.stephano.model;

import java.util.List;

public class Card {

	private String id;
	private Object checkItemStates;
	private boolean closed;
	private String dateLastActivity;
	private String desc;
	private DescData descData;
	private String idBoard;
	private String idList;
	private List<Object> idMembersVoted = null;
	private int idShort;
	private Object idAttachmentCover;
	private List<String> idLabels = null;
	private boolean manualCoverAttachment;
	private String name;
	private float pos;
	private String shortLink;
	private Badges badges;
	private boolean dueComplete;
	private Object due;
	private List<String> idChecklists = null;
	private List<String> idMembers = null;
	private List<Label> labels = null;
	private String shortUrl;
	private boolean subscribed;
	private String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getCheckItemStates() {
		return checkItemStates;
	}

	public void setCheckItemStates(Object checkItemStates) {
		this.checkItemStates = checkItemStates;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public String getDateLastActivity() {
		return dateLastActivity;
	}

	public void setDateLastActivity(String dateLastActivity) {
		this.dateLastActivity = dateLastActivity;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public DescData getDescData() {
		return descData;
	}

	public void setDescData(DescData descData) {
		this.descData = descData;
	}

	public String getIdBoard() {
		return idBoard;
	}

	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}

	public String getIdList() {
		return idList;
	}

	public void setIdList(String idList) {
		this.idList = idList;
	}

	public List<Object> getIdMembersVoted() {
		return idMembersVoted;
	}

	public void setIdMembersVoted(List<Object> idMembersVoted) {
		this.idMembersVoted = idMembersVoted;
	}

	public int getIdShort() {
		return idShort;
	}

	public void setIdShort(int idShort) {
		this.idShort = idShort;
	}

	public Object getIdAttachmentCover() {
		return idAttachmentCover;
	}

	public void setIdAttachmentCover(Object idAttachmentCover) {
		this.idAttachmentCover = idAttachmentCover;
	}

	public List<String> getIdLabels() {
		return idLabels;
	}

	public void setIdLabels(List<String> idLabels) {
		this.idLabels = idLabels;
	}

	public boolean isManualCoverAttachment() {
		return manualCoverAttachment;
	}

	public void setManualCoverAttachment(boolean manualCoverAttachment) {
		this.manualCoverAttachment = manualCoverAttachment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPos() {
		return pos;
	}

	public void setPos(float pos) {
		this.pos = pos;
	}

	public String getShortLink() {
		return shortLink;
	}

	public void setShortLink(String shortLink) {
		this.shortLink = shortLink;
	}

	public Badges getBadges() {
		return badges;
	}

	public void setBadges(Badges badges) {
		this.badges = badges;
	}

	public boolean isDueComplete() {
		return dueComplete;
	}

	public void setDueComplete(boolean dueComplete) {
		this.dueComplete = dueComplete;
	}

	public Object getDue() {
		return due;
	}

	public void setDue(Object due) {
		this.due = due;
	}

	public List<String> getIdChecklists() {
		return idChecklists;
	}

	public void setIdChecklists(List<String> idChecklists) {
		this.idChecklists = idChecklists;
	}

	public List<String> getIdMembers() {
		return idMembers;
	}

	public void setIdMembers(List<String> idMembers) {
		this.idMembers = idMembers;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public boolean isDemandValid() {
		try {
			return name.substring(0, 8).matches("\\d+");
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getIdDemand() {
		return name.substring(0, 8);
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", checkItemStates=" + checkItemStates + ", closed=" + closed + ", dateLastActivity="
				+ dateLastActivity + ", desc=" + desc + ", descData=" + descData + ", idBoard=" + idBoard + ", idList="
				+ idList + ", idMembersVoted=" + idMembersVoted + ", idShort=" + idShort + ", idAttachmentCover="
				+ idAttachmentCover + ", idLabels=" + idLabels + ", manualCoverAttachment=" + manualCoverAttachment
				+ ", name=" + name + ", pos=" + pos + ", shortLink=" + shortLink + ", badges=" + badges
				+ ", dueComplete=" + dueComplete + ", due=" + due + ", idChecklists=" + idChecklists + ", idMembers="
				+ idMembers + ", labels=" + labels + ", shortUrl=" + shortUrl + ", subscribed=" + subscribed + ", url="
				+ url + "]";
	}

}
