package van.bai4;

public class OrderInfo {
    private String symbol;
    private float price;
    private int quantity;
    private float matchPrice;
    private String status;

    public OrderInfo(){

    }
    public OrderInfo(String symbol, float price, int quantity, float matchPrice, String status) {
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
        this.matchPrice = matchPrice;
        this.status = status;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getMatchPrice() {
        return matchPrice;
    }

    public void setMatchPrice(float matchPrice) {
        this.matchPrice = matchPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
