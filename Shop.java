import java.util.Map;
import java.util.HashMap;

public class Shop{
  private SupermarketAllItem supermarketAllItem;
  public Shop(){
    supermarketAllItem = new SupermarketAllItem();
  }

  public int sumPrice(ShoppingCart shoppingCart){
    Map<String,Integer> myShoppingCart = shoppingCart.getShoppingCart();
    int totalPriceOfCart = 0;

    for(String key : myShoppingCart.keySet()){
      totalPriceOfCart += supermarketAllItem.getSupermarketAllItem().get(key).getItemPrice() * myShoppingCart.get(key);
    }

    return totalPriceOfCart;
  }
  
}