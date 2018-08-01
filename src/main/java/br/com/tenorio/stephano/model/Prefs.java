
package br.com.tenorio.stephano.model;


public class Prefs {

    private boolean sendSummaries;
    private int minutesBetweenSummaries;
    private int minutesBeforeDeadlineToNotify;
    private boolean colorBlind;
    private String locale;

    public boolean isSendSummaries() {
        return sendSummaries;
    }

    public void setSendSummaries(boolean sendSummaries) {
        this.sendSummaries = sendSummaries;
    }

    public int getMinutesBetweenSummaries() {
        return minutesBetweenSummaries;
    }

    public void setMinutesBetweenSummaries(int minutesBetweenSummaries) {
        this.minutesBetweenSummaries = minutesBetweenSummaries;
    }

    public int getMinutesBeforeDeadlineToNotify() {
        return minutesBeforeDeadlineToNotify;
    }

    public void setMinutesBeforeDeadlineToNotify(int minutesBeforeDeadlineToNotify) {
        this.minutesBeforeDeadlineToNotify = minutesBeforeDeadlineToNotify;
    }

    public boolean isColorBlind() {
        return colorBlind;
    }

    public void setColorBlind(boolean colorBlind) {
        this.colorBlind = colorBlind;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

}
