
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true){
      System.out.print("choose action >> ");
      int i = sc.nextInt();
      switch(i){
        case 0:return;
        case 222:testForPair2();break;
      }
    }
  }

	// pair(2)用のテスト
  public static void testForPair2(){
    try{
			Shop shop = new Shop();
			ShoppingCart shoppingCart = new ShoppingCart();
			shoppingCart.addItemIntoCart("1", 3);
			//System.out.println(shop.subTotalPrice(shoppingCart));
			shoppingCart.subTotalPrice();
			System.out.println(shoppingCart.beforeDiscount);
			System.out.println("----------------------");
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }


  // public static void testPrintAll(){
  //   SupermarketAllItem supermarketAllItem = new SupermarketAllItem();
  //   supermarketAllItem.printAllItem();
  //   System.out.println("----------------------");
  // }

  // public static void testAddCart(){
  //   try{
  //   ShoppingCart shoppingCart = new ShoppingCart();
  //   shoppingCart.addItemIntoCart("1", -1);
  //   System.out.println(shoppingCart);
  //   System.out.println("----------------------");
  //   }catch(Exception e){
  //     e.getMessage();
  //   }
  // }

  // public static void testTotalPrice(){
  //   Shop shop = new Shop();
  //   ShoppingCart shoppingCart = new ShoppingCart();
  //   shoppingCart.addItemIntoCart("1", 3);
  //   //System.out.println(shop.subTotalPrice(shoppingCart));
  //   System.out.println(shop.totalPrice(shoppingCart));
  //   System.out.println("----------------------");
  // }
 
  // public static void testRemove(){
  //   ShoppingCart shoppingCart = new ShoppingCart();
  //   shoppingCart.addItemIntoCart("1", 3);
  //   System.out.println(shoppingCart);
  //   shoppingCart.removeItemFromCart("1");
  //   System.out.println(shoppingCart);
  //   shoppingCart.removeItemFromCart("1");
  //   System.out.println("----------------------");
  // }

}

