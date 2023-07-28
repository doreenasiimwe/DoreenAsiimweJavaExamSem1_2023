import java.util.ArrayList;

public class Restaurant {
   //Attributes
    private String Itemname;
    private double itemPrices;

    private double ratings;
//collections
    private  static ArrayList<Restaurant>menuItems = new ArrayList<Restaurant>();



    private static ArrayList<Double>itemratings = new ArrayList<Double>();
//constructor

    public Restaurant(String itemname, double itemPrices, double ratings) {
        Itemname = itemname;
        this.itemPrices = itemPrices;
        this.ratings = ratings;
    }
//Getters and Setters
    public String getItemname() {
        return Itemname;
    }

    public double getItemPrices() {
        return itemPrices;
    }

    public double getRatings() {
        return ratings;
    }

    public static ArrayList<Restaurant> getMenuItems() {
        return menuItems;
    }
//Methods to add and remove items
    public static void addItems(Restaurant item){
        menuItems.add(item);
    }
    public static void removeItems(Restaurant item){
        menuItems.remove(item);
    }
    public static ArrayList<Double> getItemratings() {
        return itemratings;
    }
    public static void addRatings(Double rates){
        itemratings.add(rates);
    }
//method to find the average ratings
    public static void getAverageRatings(){
        int sum = 0;
        for (Double rate:itemratings)
            sum+=rate/itemratings.size();







    }
}
