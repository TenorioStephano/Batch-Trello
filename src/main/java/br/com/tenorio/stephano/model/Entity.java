
package br.com.tenorio.stephano.model;


public class Entity {

    private String type;
    private String id;
    private String username;
    private String text;
    private boolean hideIfContext;
    private String idContext;
    private String shortLink;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isHideIfContext() {
        return hideIfContext;
    }

    public void setHideIfContext(boolean hideIfContext) {
        this.hideIfContext = hideIfContext;
    }

    public String getIdContext() {
        return idContext;
    }

    public void setIdContext(String idContext) {
        this.idContext = idContext;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

}
