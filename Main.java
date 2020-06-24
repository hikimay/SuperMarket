
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true){
      System.out.print("case 0:exit\ncase 1: try function testPrintAll()\ncase 2: try function testAddCart()\ncase 3: try function testTotalPrice()\ncase 4: try function testRemove()\n");
      System.out.print("choose action >> ");
      int i = sc.nextInt();
      switch(i){
        case 0:return;
        case 1:testPrintAll();break;
        case 2:testAddCart();break;
        case 3:testTotalPrice();break;
        case 4:testRemove();break;
      }
    }
  }


  public static void testPrintAll(){
    SupermarketAllItem supermarketAllItem = new SupermarketAllItem();
    supermarketAllItem.printAllItem();
    System.out.println("----------------------");
  }

  public static void testAddCart(){
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItemIntoCart("1", 3);
    System.out.println(shoppingCart);
    System.out.println("----------------------");
  }

  public static void testTotalPrice(){
    Shop shop = new Shop();
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItemIntoCart("1", 3);
    System.out.println(shop.subTotalPrice(shoppingCart));
    System.out.println(shop.totalPrice(shoppingCart));
    System.out.println("----------------------");
  }
 
  public static void testRemove(){
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItemIntoCart("1", 3);
    System.out.println(shoppingCart);
    shoppingCart.removeItemFromCart("1");
    System.out.println(shoppingCart);
    shoppingCart.removeItemFromCart("1");
    System.out.println("----------------------");
  }

}

