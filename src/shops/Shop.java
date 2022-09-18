package shops;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public abstract class Shop {

    public ArrayList<Product> products = new ArrayList<>(){{
        Product milk = new Product("Milk", 60);
        Product butter = new Product("Butter", 70);
        Product apples = new Product("Apples", 35);
        Product fish = new Product("Fish", 80);
        Product sonyTV = new Product("Sony TV", 500);
        Product acerLaptop = new Product("Acer Laptop", 800);
        Product lenovo = new Product("Lenovo", 200);
        Product xiaomi = new Product("Xiaomi", 400);
    }};


    public float buyProduct(){
        return 0;
    }
   public float getProductPrice(String productName){

      return 0;
  }
    public ArrayList<Product> getAllShopProducts() {
        ArrayList<Product> allProducts = new ArrayList<>();
        allProducts.addAll(products);
        return allProducts;
    }
}