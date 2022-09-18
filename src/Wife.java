import shops.Product;

import java.util.ArrayList;

public class Wife {
    Product milk =  new Product("Milk");
    Product meat =  new Product("Meat");
    Product butter =  new Product("Butter");
    Product fish =  new Product("Fish");
    Product sonyTV =  new Product("Sony TV");
    Product lenovo =  new Product("Lenovo");
    Product apples =  new Product("Apples");

    public ArrayList<Product> createListOfProducts(){
       ArrayList<Product> neededProducts = new ArrayList<>();
        neededProducts.add(milk);
        neededProducts.add(fish);
        neededProducts.add(sonyTV);
        neededProducts.add(butter);
        neededProducts.add(lenovo);
        neededProducts.add(apples);
        neededProducts.add(meat);
       return neededProducts;
    }
    public void printToConsole(ArrayList<Product> products){
        for (Product product: products){
            System.out.println(product);
        }
    }
   // public void giveMeListOfAllProductsFromShops(Husband husband){
    // ArrayList<Product> products = husband.getAllProductsFromShops();
    //    System.out.println(products);
   // }

    public void giveMeListOfProductsWeCanBuy(Husband husband){


    }

}
