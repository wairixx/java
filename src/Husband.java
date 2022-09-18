import shops.Product;
import shops.ProductShop;
import shops.Shop;
import shops.TechnicShop;

import java.util.ArrayList;

public class Husband {

    private ArrayList<Product> productList;

    ArrayList<Shop> shops = new ArrayList<>(){{
        add(new TechnicShop());
        add(new ProductShop());
    }};

    public ArrayList<Product> getAllProductsFromShops(){
        ArrayList<Product> allProductsFromShops = new ArrayList<>();

        for (Shop shop: shops){
            allProductsFromShops.addAll(shop.getAllShopProducts() );
        }
        return allProductsFromShops;
    }

    public void getListOfProductFromWife(ArrayList<Product> productList){
        this.productList = productList;
    }

    public ArrayList<Product> getProductsWeCanBuy(){
        ArrayList<Product> productsWeCanBuy= new ArrayList<>();

        for (Shop shop: shops) {
           ArrayList<Product> copy = shop.getAllShopProducts();
           ArrayList<Product> isNotNeeded = shop.getAllShopProducts();
           isNotNeeded.removeAll(productList);
           copy.removeAll(isNotNeeded);
           productsWeCanBuy.addAll(copy);

        }
        return productsWeCanBuy;
    }
    public void buyProducts(ArrayList<Product> productsWeCanBuy){
        ArrayList<Product> productsToBuy = new ArrayList<>();
        for (Product product: productsWeCanBuy) {

            }
    }

}


