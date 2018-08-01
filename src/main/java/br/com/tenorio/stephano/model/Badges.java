
package br.com.tenorio.stephano.model;

public class Badges {

	private int votes;
	private AttachmentsByType attachmentsByType;
	private boolean viewingMemberVoted;
	private boolean subscribed;
	private String fogbugz;
	private int checkItems;
	private int checkItemsChecked;
	private int comments;
	private int attachments;
	private boolean description;
	private Object due;
	private boolean dueComplete;

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public AttachmentsByType getAttachmentsByType() {
		return attachmentsByType;
	}

	public void setAttachmentsByType(AttachmentsByType attachmentsByType) {
		this.attachmentsByType = attachmentsByType;
	}

	public boolean isViewingMemberVoted() {
		return viewingMemberVoted;
	}

	public void setViewingMemberVoted(boolean viewingMemberVoted) {
		this.viewingMemberVoted = viewingMemberVoted;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	public String getFogbugz() {
		return fogbugz;
	}

	public void setFogbugz(String fogbugz) {
		this.fogbugz = fogbugz;
	}

	public int getCheckItems() {
		return checkItems;
	}

	public void setCheckItems(int checkItems) {
		this.checkItems = checkItems;
	}

	public int getCheckItemsChecked() {
		return checkItemsChecked;
	}

	public void setCheckItemsChecked(int checkItemsChecked) {
		this.checkItemsChecked = checkItemsChecked;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public int getAttachments() {
		return attachments;
	}

	public void setAttachments(int attachments) {
		this.attachments = attachments;
	}

	public boolean isDescription() {
		return description;
	}

	public void setDescription(boolean description) {
		this.description = description;
	}

	public Object getDue() {
		return due;
	}

	public void setDue(Object due) {
		this.due = due;
	}

	public boolean isDueComplete() {
		return dueComplete;
	}

	public void setDueComplete(boolean dueComplete) {
		this.dueComplete = dueComplete;
	}

}
