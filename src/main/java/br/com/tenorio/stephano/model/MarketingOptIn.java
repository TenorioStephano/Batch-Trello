
package br.com.tenorio.stephano.model;


public class MarketingOptIn {

    private boolean optedIn;
    private String date;

    public boolean isOptedIn() {
        return optedIn;
    }

    public void setOptedIn(boolean optedIn) {
        this.optedIn = optedIn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
