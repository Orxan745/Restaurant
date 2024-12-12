package restaurant;

import static restaurant.Restaurant.*;

public class Order {

    private String orderName;

    private double orderPrice;

    private String orderCategory;

    public void setOrder(String foodName) {
        for (int i = 0; i < foodsCount; i++) {
            if (foodList[i].getFoodName().equals(foodName)) {
                this.orderName = foodList[i].getFoodName();
                this.orderPrice = foodList[i].getPrice();
                this.orderCategory = foodList[i].getCategory();
                break;
            }
        }
    }

    public String getOrderName() {
        return orderName;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public String getOrderCategory() {
        return orderCategory;
    }
}
