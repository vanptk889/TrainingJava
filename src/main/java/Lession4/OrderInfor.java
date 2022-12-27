package Lession4;

public class OrderInfor {
    public  String symbol;
    public float orderPrice;
    public int quantity;
    public float matchPrice;
    public String statusOrder;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
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

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }
}
