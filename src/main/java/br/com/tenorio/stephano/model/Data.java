
package br.com.tenorio.stephano.model;


public class Data {

    private String text;
    private TextData textData;
    private Card card;
    private Board board;
    private List list;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextData getTextData() {
        return textData;
    }

    public void setTextData(TextData textData) {
        this.textData = textData;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

}
