package restaurant;

public class Table {

    private String tableName;

    private double totalPrice;

    public Order[] tableOrders = new Order[10];

    public static int ordersCount = 0;

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < ordersCount; i++) {
            totalPrice = totalPrice + tableOrders[i].getOrderPrice();
        }
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addNewOrder(Order order) {
        int percentage = (ordersCount / tableOrders.length) * 100;
        if (percentage >= 80) {
            Order[] tableOrders1 = new Order[tableOrders.length*2];
            for (int i = 0; i < ordersCount; i++) {
                tableOrders1[i] = tableOrders[i];
            }
            tableOrders = tableOrders1;
        }
        tableOrders[ordersCount] = order;
        ordersCount++;
    }

    public void removeOrder(String orderName) {
        for (int i = ordersCount; i > 0; i--) {
            if (tableOrders[i].getOrderName().equals(orderName)) {
                tableOrders[i] = null;
                for (int j = 0; j < ordersCount; i++) {
                    tableOrders[i+j] = tableOrders[i+j+1];
                    tableOrders[i+j+1] = null;
                }
                break;
            }
        }
        ordersCount--;
    }

    public void printOrderList(){
        System.out.println("---------------------------------------");
        double total = 0;
        for (int i = 0; i < ordersCount; i++) {
            if (tableOrders[i] != null) {
                System.out.println(tableOrders[i].getOrderName()+" "+tableOrders[i].getOrderPrice());
                total = total + tableOrders[i].getOrderPrice();
            }
        }
        System.out.println("Total: "+total);
        System.out.println("---------------------------------------");
    }
}
