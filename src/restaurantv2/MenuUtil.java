package restaurantv2;

import java.util.Scanner;
import static restaurantv2.OrderUtil.*;
import static restaurantv2.Restaurant.*;

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

        addNewFood(food);
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

    public static void getTotalIncome() {
        double totalIncome = OrderUtil.getTotalIncome();
        System.out.println(totalIncome);
    }

    public static void createNewOrder() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.print("Please enter the order number: ");
        int orderNumber = scanner.nextInt();
        order.setOrderNumber(orderNumber);
        OrderUtil.createNewOrder(order);
    }

    public static void finishOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of order you want to finish: ");
        int orderNumber = scanner.nextInt();
        OrderUtil.finishOrder(orderNumber);
    }

    public static void addFoodToOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter order number: ");
        int orderNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the food name: ");
        String foodName = scanner.nextLine();
        Food food = null;
        for (int i = 0; i < foodsCount; i++) {
            if (foodList[i].getFoodName().equals(foodName)) {
                food = foodList[i];
            }
        }
        for (int i = 0; i < ordersCount; i++) {
            if (orders[i].getOrderNumber() == orderNumber) {
                orders[i].addNewFoodToOrder(food);
            }
        }
        System.out.println("Food successfully added to order!");
    }

    public static void removeFoodFromOrder() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.print("Please enter order number: ");
        int orderNumber = scanner.nextInt();
        System.out.print("Please enter the food name: ");
        String foodName = scanner.nextLine();
        Food food = null;
        for (int i = 0; i < foodsCount; i++) {
            if (foodList[i].getFoodName().equals(foodName)) {
                food = foodList[i];
            }
        }
        for (int i = 0; i < ordersCount; i++) {
            if (orders[i].getOrderNumber() == orderNumber) {
                orders[i].removeFoodFrmOrder(food.getFoodName());
            }
        }
        System.out.println("Food successfully removed from order!");
    }

    public static void searchOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of order you want to finish: ");
        int orderNumber = scanner.nextInt();
        OrderUtil.searchOrder(orderNumber);
    }
}
