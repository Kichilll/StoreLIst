import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<String> drinksInShop() {
        String[] Drinks = {
                "Malt",
                "Coke",
                "Fanta"
        };
        List<String> drinksList = Arrays.asList(Drinks);
        return drinksList;
    };

    public static List<String> vegetables() {
        String[] Veges = {
                "Tomatoes",
                "Carrot",
                "Onion",
                "Pepper"

        };
        List<String> VegetableList = Arrays.asList(Veges);
        return VegetableList;
    };

    public static List<String> CannedProducts() {
        String[] cannedFoods = {
                "Sardines",
                "Tomato paste",
                "Milk"
        };
        List<String> CannedList = Arrays.asList(cannedFoods);
        return CannedList;

    };

    // public static void main(String[] args) {
    //
    // }
}