
package br.com.tenorio.stephano.model;

import java.util.List;

public class Comment {

    private String id;
    private String idMemberCreator;
    private Data data;
    private String type;
    private String date;
    private Limits limits;
    private Display display;
    private List<Entity> entities = null;
    private MemberCreator_ memberCreator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMemberCreator() {
        return idMemberCreator;
    }

    public void setIdMemberCreator(String idMemberCreator) {
        this.idMemberCreator = idMemberCreator;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public MemberCreator_ getMemberCreator() {
        return memberCreator;
    }

    public void setMemberCreator(MemberCreator_ memberCreator) {
        this.memberCreator = memberCreator;
    }

}
