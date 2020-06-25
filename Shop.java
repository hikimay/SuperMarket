import java.util.Map;
import java.util.HashMap;

public class Shop{
  private static SupermarketAllItem supermarketAllItem = new SupermarketAllItem();

  public Shop(){
  }
  //タバコの計算
  //TotalPrice＝税金計算メソッド＋全体金額計算メソッド
  public int totalPrice(ShoppingCart shoppingCart){
    return (int)(subTotalPrice(shoppingCart) * 1.1);
  }

  public int subTotalPrice(ShoppingCart shoppingCart){
    Map<String,Integer> myShoppingCart = shoppingCart.getShoppingCart();
    int totalPriceOfCart = 0;

    for(String key : myShoppingCart.keySet()){
      totalPriceOfCart += supermarketAllItem.getSupermarketAllItem().get(key).getItemPrice() * myShoppingCart.get(key);
    }

     return totalPriceOfCart;
  }

  public static SupermarketAllItem getSupermarketAllItem(){
    return supermarketAllItem;
  }

  //ショップクラスに割引メソッドを書く
	//割引きのルールを決める
	// 持っているりんごの個数を 3 で割ったときの商を用いる
	// e.g., 5 / 3 = 1 (一つセットに割引が適用される)
  

  //商品番号でIF分岐　
  // カートの中身に弁当類と飲み物が入っているかを判定する
  //弁当・お茶・コーヒーを買っていた場合の処理
  //弁当と飲み物のセットの個数をカウント
  //割引は全体の金額から引く

  //タバコ
  //
}