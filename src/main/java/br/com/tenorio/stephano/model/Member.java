
package br.com.tenorio.stephano.model;

import java.util.List;

public class Member {

	private String id;
	private String avatarHash;
	private String avatarUrl;
	private String bio;
	private Object bioData;
	private boolean confirmed;
	private String fullName;
	private List<Object> idEnterprisesDeactivated = null;
	private List<Object> idPremOrgsAdmin = null;
	private String initials;
	private String memberType;
	private List<Integer> products = null;
	private String status;
	private String url;
	private String username;
	private String avatarSource;
	private String email;
	private String gravatarHash;
	private List<String> idBoards = null;
	private Object idEnterprise;
	private List<String> idOrganizations = null;
	private List<Object> idEnterprisesAdmin = null;
	private Limits limits;
	private List<String> loginTypes = null;
	private MarketingOptIn marketingOptIn;
	private List<MessagesDismissed> messagesDismissed = null;
	private List<String> oneTimeMessagesDismissed = null;
	private Prefs prefs;
	private List<Object> trophies = null;
	private String uploadedAvatarHash;
	private String uploadedAvatarUrl;
	private List<String> premiumFeatures = null;
	private Object idBoardsPinned;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAvatarHash() {
		return avatarHash;
	}

	public void setAvatarHash(String avatarHash) {
		this.avatarHash = avatarHash;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Object getBioData() {
		return bioData;
	}

	public void setBioData(Object bioData) {
		this.bioData = bioData;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Object> getIdEnterprisesDeactivated() {
		return idEnterprisesDeactivated;
	}

	public void setIdEnterprisesDeactivated(List<Object> idEnterprisesDeactivated) {
		this.idEnterprisesDeactivated = idEnterprisesDeactivated;
	}

	public List<Object> getIdPremOrgsAdmin() {
		return idPremOrgsAdmin;
	}

	public void setIdPremOrgsAdmin(List<Object> idPremOrgsAdmin) {
		this.idPremOrgsAdmin = idPremOrgsAdmin;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public List<Integer> getProducts() {
		return products;
	}

	public void setProducts(List<Integer> products) {
		this.products = products;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatarSource() {
		return avatarSource;
	}

	public void setAvatarSource(String avatarSource) {
		this.avatarSource = avatarSource;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGravatarHash() {
		return gravatarHash;
	}

	public void setGravatarHash(String gravatarHash) {
		this.gravatarHash = gravatarHash;
	}

	public List<String> getIdBoards() {
		return idBoards;
	}

	public void setIdBoards(List<String> idBoards) {
		this.idBoards = idBoards;
	}

	public Object getIdEnterprise() {
		return idEnterprise;
	}

	public void setIdEnterprise(Object idEnterprise) {
		this.idEnterprise = idEnterprise;
	}

	public List<String> getIdOrganizations() {
		return idOrganizations;
	}

	public void setIdOrganizations(List<String> idOrganizations) {
		this.idOrganizations = idOrganizations;
	}

	public List<Object> getIdEnterprisesAdmin() {
		return idEnterprisesAdmin;
	}

	public void setIdEnterprisesAdmin(List<Object> idEnterprisesAdmin) {
		this.idEnterprisesAdmin = idEnterprisesAdmin;
	}

	public Limits getLimits() {
		return limits;
	}

	public void setLimits(Limits limits) {
		this.limits = limits;
	}

	public List<String> getLoginTypes() {
		return loginTypes;
	}

	public void setLoginTypes(List<String> loginTypes) {
		this.loginTypes = loginTypes;
	}

	public MarketingOptIn getMarketingOptIn() {
		return marketingOptIn;
	}

	public void setMarketingOptIn(MarketingOptIn marketingOptIn) {
		this.marketingOptIn = marketingOptIn;
	}

	public List<MessagesDismissed> getMessagesDismissed() {
		return messagesDismissed;
	}

	public void setMessagesDismissed(List<MessagesDismissed> messagesDismissed) {
		this.messagesDismissed = messagesDismissed;
	}

	public List<String> getOneTimeMessagesDismissed() {
		return oneTimeMessagesDismissed;
	}

	public void setOneTimeMessagesDismissed(List<String> oneTimeMessagesDismissed) {
		this.oneTimeMessagesDismissed = oneTimeMessagesDismissed;
	}

	public Prefs getPrefs() {
		return prefs;
	}

	public void setPrefs(Prefs prefs) {
		this.prefs = prefs;
	}

	public List<Object> getTrophies() {
		return trophies;
	}

	public void setTrophies(List<Object> trophies) {
		this.trophies = trophies;
	}

	public String getUploadedAvatarHash() {
		return uploadedAvatarHash;
	}

	public void setUploadedAvatarHash(String uploadedAvatarHash) {
		this.uploadedAvatarHash = uploadedAvatarHash;
	}

	public String getUploadedAvatarUrl() {
		return uploadedAvatarUrl;
	}

	public void setUploadedAvatarUrl(String uploadedAvatarUrl) {
		this.uploadedAvatarUrl = uploadedAvatarUrl;
	}

	public List<String> getPremiumFeatures() {
		return premiumFeatures;
	}

	public void setPremiumFeatures(List<String> premiumFeatures) {
		this.premiumFeatures = premiumFeatures;
	}

	public Object getIdBoardsPinned() {
		return idBoardsPinned;
	}

	public void setIdBoardsPinned(Object idBoardsPinned) {
		this.idBoardsPinned = idBoardsPinned;
	}

}
