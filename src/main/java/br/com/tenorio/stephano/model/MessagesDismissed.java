
package br.com.tenorio.stephano.model;


public class MessagesDismissed {

    private String name;
    private int count;
    private String lastDismissed;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLastDismissed() {
        return lastDismissed;
    }

    public void setLastDismissed(String lastDismissed) {
        this.lastDismissed = lastDismissed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
