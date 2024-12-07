package OOP.restaurantv2;

public class Restaurant {

    public static Food[] foodList = new Food[10];

    public static int foodsCount = 0;

    public static void addNewFood(Food food) {
        int percentage = (foodsCount / foodList.length) * 100;
        if (percentage >= 80) {
            Food[] foodList1 = new Food[foodList.length*2];
            for (int i = 0; i < foodsCount; i++) {
                foodList1[i] = foodList[i];
            }
            foodList = foodList1;
        }
        foodList[foodsCount] = food;
        foodsCount++;
    }

    public static void removeFood(String foodName) {
        for (int i = 0; i < foodsCount; i++) {
            if (foodList[i].getFoodName().equals(foodName)) {
                foodList[i] = null;
                for (int j = 0; j < foodsCount; j++) {
                    foodList[i+j] = foodList[i+j+1];
                    foodList[i+j+1] = null;
                }
                break;
            }
        }
        foodsCount--;
    }

    public static void printFoodList() {
        System.out.println("---------------------------------------");
        for (int i = 0; i < foodsCount; i++) {
            System.out.println(i+1+"."+foodList[i].getFoodName());
        }
        System.out.println("---------------------------------------");
    }

    public static void searchFood(String foodName) {
        System.out.println("---------------------------------------");
        for (int i = 0; i < foodsCount; i++) {
            if (foodList[i].getFoodName().equals(foodName)) {
                System.out.println(foodList[i]);
                break;
            }
        }
        System.out.println("---------------------------------------");
    }
}
