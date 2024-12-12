package restaurant;

public class Menu {
    public static void getAdminMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1.Add new food to restaurant \n"+
                "2.Remove a food from restaurant \n"+
                "3.Print the list of foods \n"+
                "4.Search a food from restaurant \n"+
                "5.Get total income \n"+
                "6.Exit");
        System.out.println("---------------------------------------");
    }

    public static void getPersonalMenu() {
        System.out.println("---------------------------------------");
        if (TableUtil.tablesCount != 0){
            TableUtil.showAllTables();
            System.out.println((TableUtil.tablesCount+1)+".Add new table \n"+
                    (TableUtil.tablesCount+2)+".Exit");
        }else {
            System.out.println("1.Add new table \n" +
                    "2.Exit");
        }
        System.out.println("---------------------------------------");
    }

    public static void getTableMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1.Add new order to table \n"+
                "2.Remove an order from table \n"+
                "3.See all orders of this table \n"+
                "4.Exit from table \n"+
                "5.Close this table");
        System.out.println("---------------------------------------");
    }
}
