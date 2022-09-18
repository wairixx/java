import shops.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Wife wife = new Wife();
    ArrayList<Product> neededProduct = wife.createListOfProducts();
    Husband husband = new Husband();
    husband.getListOfProductFromWife(neededProduct);

    wife.printToConsole(husband.getAllProductsFromShops());

    wife.printToConsole(husband.getProductsWeCanBuy());

    }
}