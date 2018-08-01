
package br.com.tenorio.stephano.model;


public class ContextOn {

    private String type;
    private String translationKey;
    private boolean hideIfContext;
    private String idContext;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTranslationKey() {
        return translationKey;
    }

    public void setTranslationKey(String translationKey) {
        this.translationKey = translationKey;
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

}
