package restaurantv2;

import java.util.Scanner;
import static restaurantv2.MenuUtil.*;
import static restaurantv2.Restaurant.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the password: ");
            String password = scanner.next();
            if (Account.adminPassword.equals(password)) {
                while (true) {
                    Menu.getAdminMenu();
                    System.out.print("Please select an option: ");
                    int option = scanner.nextInt();
                    if (option == 6) {
                        break;
                    }
                    switch (option) {
                        case 1 -> addFood();
                        case 2 -> removeFood();
                        case 3 -> printFoodList();
                        case 4 -> searchFood();
                        case 5 -> getTotalIncome();
                    }
                }
            } else if (Account.personalPassword.equals(password)) {
                while (true) {
                    Menu.getPersonalMenu();
                    System.out.print("Please select an option: ");
                    int option = scanner.nextInt();
                    if (option == 6) {
                        break;
                    }
                    switch (option) {
                        case 1 -> createNewOrder();
                        case 2 -> finishOrder();
                        case 3 -> addFoodToOrder();
                        case 4 -> removeFoodFromOrder();
                        case 5 -> searchOrder();
                    }
                }
            } else {
                System.out.println("Incorrect password!");
                System.exit(0);
            }
        }
    }
}
