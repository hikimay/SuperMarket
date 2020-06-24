/* 
  全商品を保持するクラス
*/

import java.util.HashMap;
import java.util.Map;
class SupermarketAllItem {
  // 商品のmapの初期化
  private final Map<String, SupermarketItem> supermarketAllItem = new HashMap<String, SupermarketItem>(){
    {
      put("1", new SupermarketItem("りんご", 100));
      put("2", new SupermarketItem("みかん", 40));
      put("3", new SupermarketItem("ぶどう", 150));
      put("4", new SupermarketItem("のり弁", 350));
      put("5", new SupermarketItem("しゃけ弁", 400));
      put("6", new SupermarketItem("タバコ", 420));
      put("7", new SupermarketItem("メンソールタバコ", 440));
      put("8", new SupermarketItem("ライター", 100));
      put("9", new SupermarketItem("お茶", 80));
      put("10", new SupermarketItem("コーヒー", 100));
    }
  };

  // 全商品の表示
  public void printAllItem() {
    for (String key : supermarketAllItem.keySet()) {
      System.out.println(key + " => " + supermarketAllItem.get(key));
    }
  }

  public Map<String,SupermarketItem> getSupermarketAllItem(){
    return this.supermarketAllItem;
  }
}