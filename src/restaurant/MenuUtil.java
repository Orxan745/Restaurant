package OOP.restaurant;

import java.util.Scanner;

public class MenuUtil {

    public static void addFood() {
        Scanner scanner = new Scanner(System.in);
        Food food = new Food();
        System.out.print("Name: ");
        String foodName = scanner.nextLine();
        System.out.print("Price: ");
        double foodPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Category: ");
        String foodCategory = scanner.nextLine();

        food.setFoodName(foodName);
        food.setPrice(foodPrice);
        food.setCategory(foodCategory);

        Restaurant.addNewFood(food);
    }

    public static void removeFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of food you want to remove: ");
        String foodName = scanner.nextLine();

        Restaurant.removeFood(foodName);
    }

    public static void searchFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of food you want to search: ");
        String foodName = scanner.nextLine();

        Restaurant.searchFood(foodName);
    }

    public static void createTable() {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();
        System.out.print("Table name: ");
        String tableName = scanner.nextLine();
        table.setTableName(tableName);

        TableUtil.createNewTable(table);
    }

    public static void removeTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter table you want to remove: ");
        String tableName = scanner.nextLine();

        TableUtil.removeTable(tableName);
    }

    public static void addOrderToTable(Table table) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.print("Order: ");
        String foodName = scanner.nextLine();

        order.setOrder(foodName);

        table.addNewOrder(order);
    }

    public static void removeOrderFromTable(Table table) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the order you want to remove: ");
        String orderName = scanner.nextLine();

        table.removeOrder(orderName);
    }

    public static void getTotalIncome() {
        double totalIncome = TableUtil.getTotalIncome();
        System.out.println("Total income: "+totalIncome);
    }
}
