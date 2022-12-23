package linhhoang.BTBuoi4;

public class OrderInfo {
    private String symbol;
    private float price;
    private float matchedPrice;
    private int quantity;
    private String status;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getMatchedPrice() {
        return matchedPrice;
    }

    public void setMatchedPrice(float matchedPrice) {
        this.matchedPrice = matchedPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
