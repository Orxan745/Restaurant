package restaurantv2;

public class Order {

    public Food[] orderList = new Food[10];

    public int orderNumber;

    private int ordersCount = 0;

    public int getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void addNewFoodToOrder(Food food) {
        int percentage = (ordersCount / orderList.length) * 100;
        if (percentage >= 80) {
            Food[] orders1 = new Food[orderList.length*2];
            for (int i = 0; i < ordersCount; i++) {
                orders1[i] = orderList[i];
            }
            orderList = orders1;
        }
        orderList[ordersCount] = food;
        ordersCount++;
    }

    public void removeFoodFrmOrder(String foodName) {
        for (int i = 0; i < ordersCount; i++) {
            if (orderList[i].getFoodName().equals(foodName)) {
                orderList[i] = null;
                for (int j = 0; j < ordersCount; j++){
                    orderList[i+j] = orderList[i+j+1];
                    orderList[i+j+1] = null;
                }
            }
            break;
        }
        ordersCount--;
    }

    public void getOrderList() {
        for (int i = 0; i < ordersCount; i++) {
            System.out.println((i+1)+"."+orderList[i].getFoodName()+" "+orderList[i].getPrice());
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < ordersCount; i++) {
            totalPrice = totalPrice + orderList[i].getPrice();
        }
        return totalPrice;
    }
}
