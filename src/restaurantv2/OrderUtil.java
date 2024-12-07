package OOP.restaurantv2;

public class OrderUtil {

    public static Order[] orders = new Order[10];

    public static int ordersCount = 0;

    public static void createNewOrder(Order order) {
        int percentage = (ordersCount / orders.length) * 100;
        if (percentage >= 80) {
            Food[] orders1 = new Food[order.orderList.length*2];
            for (int i = 0; i < ordersCount; i++) {
                orders1[i] = order.orderList[i];
            }
            order.orderList = orders1;
        }
        orders[ordersCount] = order;
        ordersCount++;
    }

    public static void finishOrder(int orderNumber) {
        for (int i = 0; i < ordersCount; i++) {
            if (orders[i].getOrderNumber() == orderNumber) {
                orders[i] = null;
                for (int j = 0; j < ordersCount; j++){
                    orders[i+j] = orders[i+j+1];
                    orders[i+j+1] = null;
                }
            }
            break;
        }
        ordersCount--;
    }

    public static void searchOrder(int orderNumber) {
        for (int i = 0; i < ordersCount; i++) {
            if (orders[i].orderNumber == orderNumber) {
                orders[i].getOrderList();
                System.out.println(orders[i].getTotalPrice());
            }
        }
    }

    public static double getTotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < ordersCount; i++) {
            totalIncome = totalIncome + orders[i].getTotalPrice();
        }
        return totalIncome;
    }
}