package restaurantv2;

public class Food {

    private String foodName;

    private double price;

    private String category;

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public String toString() {
        return "Name: "+getFoodName()+"\n" +
                "Price: "+getPrice()+"\n" +
                "Category: "+getCategory();
    }
}