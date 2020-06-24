
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    ShoppingCart shoppingCart = new ShoppingCart();
    Shop shop = new Shop();
    shoppingCart.addItemIntoCart("1", 3);
    System.out.println(shop.sumPrice(shoppingCart));
    System.out.println(shoppingCart);
    
  }
}