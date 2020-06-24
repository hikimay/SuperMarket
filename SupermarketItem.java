/*
  商品のクラス
*/
class SupermarketItem {
  private String itemName;
  private int itemPrice;

  // コンストラクタ
  SupermarketItem (String itemName, int itemPrice) {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }

  // 商品名のgetter
  public String getItemName() {
    return itemName;
  }

  // 値段のgetter
  public int getItemPrice() {
    return itemPrice;
  }

  @Override
  public String toString() {
    return "[" + this.getItemName() + ":" + this.getItemPrice() + "]";
  }
}
