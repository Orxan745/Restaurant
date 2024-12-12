package restaurantv2;

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
        System.out.println("1.Create new order\n" +
                "2.Finish an order\n" +
                "3.Add food to order\n" +
                "4.Remove food from order\n"+
                "5.Search order\n"+
                "6.Exit");
        System.out.println("---------------------------------------");
    }
}
