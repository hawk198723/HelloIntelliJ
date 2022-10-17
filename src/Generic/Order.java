package Generic;

public class Order <T>{
    String oderName;
    int orderId;
    T orderT;

    public Order(){}

    public Order(String oderName, int orderId, T orderT){
        this.oderName = oderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oderName='" + oderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
