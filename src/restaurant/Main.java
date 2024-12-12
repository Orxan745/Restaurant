package restaurant;

import java.util.Scanner;

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
                        case 1 -> MenuUtil.addFood();
                        case 2 -> MenuUtil.removeFood();
                        case 3 -> Restaurant.printFoodList();
                        case 4 -> MenuUtil.searchFood();
                        case 5 -> MenuUtil.getTotalIncome();
                    }
                }
            } else if (Account.personalPassword.equals(password)) {
                while (true) {
                    Menu.getPersonalMenu();
                    System.out.print("Please select an option: ");
                    int option = scanner.nextInt();
                    if (TableUtil.tablesCount != 0) {
                        for (int i = 0; i < TableUtil.tablesCount; i++) {
                            if (option == i+1) {
                                Menu.getTableMenu();
                                System.out.print("Please select an option: ");
                                int option1 = scanner.nextInt();
                                if (option1 == 4) {
                                    break;
                                }
                                switch (option1) {
                                    case 1 -> MenuUtil.addOrderToTable(TableUtil.tables[i]);
                                    case 2 -> MenuUtil.removeOrderFromTable(TableUtil.tables[i]);
                                    case 3 -> TableUtil.tables[i].printOrderList();
                                    case 5 -> System.exit(0);
                                }
                            }
                        }
                        if (option == TableUtil.tablesCount+1) {
                            MenuUtil.createTable();
                        }else if (option == TableUtil.tablesCount+2){
                            MenuUtil.removeTable();
                        }
                    }else {
                        switch (option) {
                            case 1 -> MenuUtil.createTable();
                            case 2 -> System.exit(0);
                        }
                    }
                }
            } else {
                System.out.println("Incorrect password!");
                System.exit(0);
            }
        }
    }
}
