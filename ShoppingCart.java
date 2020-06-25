
import java.util.Map;
import java.util.HashMap;
import Math;

class ShoppingCart{
  // ショッピングカートは商品IDと商品数を保持する。商品名ではないことに注意。

  private Map<String, Integer> shoppingCart;
	// カート内の商品の総額に関する変数を定義（6/25 10:30)
	public int beforeDiscount; // 割引適用前の税抜きの総額
  private int subTotal; // 割引適用後の税抜きの総額
  private int total; // 税金を含めた場合の総額
  
  public ShoppingCart(){
    this.shoppingCart = new HashMap<String, Integer>();
  }
  
  public void addItemIntoCart(String itemIndex, int itemQuantity) throws InvalidException {
    if(itemQuantity<=0){
      throw new InvalidException("アイテムの追加個数に0未満の値が入力されました。");
    }
    this.shoppingCart.put(itemIndex, itemQuantity);
  }

  public void removeItemFromCart(String itemIndex) {
    try{
      this.shoppingCart.remove(itemIndex);
    }catch(){
      System.out.println("削除しようとしているアイテムは存在しません。"");
    }
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

	// カート内の商品の総額
  public void subTotalPrice(){
    int totalPriceOfCart = 0;

    for(String key : shoppingCart.keySet()){
      //[要修正] getSupermarketAllItem() のメソッド名が被っている
      totalPriceOfCart += Shop.getSupermarketAllItem().getSupermarketAllItem().get(key).getItemPrice() * shoppingCart.get(key);
    }

    beforeDiscount = totalPriceOfCart;
  }


  // ショップクラスに割引メソッドを書く
	// 割引きのルールを決める
	// e.g., 5 / 3 = 1 (一つセットに割引が適用される)
  // 持っているりんごの個数を 3 で割ったときの商を用いる
  public void calcDiscount(){
   int q = shoppingCart.get("1") / 3;
   this.subTotal = this.beforeDiscount - q * 20;
  }
  
  // 商品番号でIF分岐　
  // カートの中身に弁当類と飲み物が入っているかを判定する
  // 弁当・お茶・コーヒーを買っていた場合の処理
  // 弁当と飲み物のセットの個数をカウント
  // 割引は全体の金額から引く
	// カートの中に含まれる指定したカテゴリーの商品の個数を返す
  public int calcCountCategory(int category){
    int count = 0;
    for (String key : shoppingCart.keySet()) {
			// [要修正]
      if (Shop.getSupermarketAllItem().getSupermarketAllItem().get(key).getItemCategory() == category) {
        count += shoppingCart.get(key);
      }
    }
    return count;
  }

	// 割引を適用するメソッド
  public void calcSetDiscount(){
    int countBento = this.calcCountCategory(1);
    int countDrink = this.calcCountCategory(0);
    int minSet = Math.min(countBento, countDrink); //小さい方に合わせる
    this.subTotal = this.beforeDiscount - minSet * 20;
  }

  public void calcTotalPrice() {
    int countCigarette = 0;
    if (shoppingCart.containsKey("6")) {
      countCigarette 
    }

    int itemWithoutCigarette = subTotal - 
  }
}
