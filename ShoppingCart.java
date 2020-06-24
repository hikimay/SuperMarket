
import java.util.Map;
import java.util.HashMap;

class ShoppingCart{
  // ショッピングカートは商品IDと商品数を保持する。商品名ではないことに注意。

  private Map<String, Integer> shoppingCart;
  
  public ShoppingCart(){
    this.shoppingCart = new HashMap<String, Integer>();
  }
  
  public void addItemIntoCart(String itemIndex, int itemQuantity){
    this.shoppingCart.put(itemIndex, itemQuantity);
  }

  public Map<String,Integer> getShoppingCart(){
    return this.shoppingCart;
  }

  @Override
  public String toString(){
    String tmp = "";
    for(String key : this.shoppingCart.keySet()){
      tmp = tmp + key + " : " + this.shoppingCart.get(key) + "\n";
    }
    return tmp;
  }

  
}
