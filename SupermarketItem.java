/*
  商品のクラス
*/
class SupermarketItem {
  private String itemName;
  private int itemPrice;
  private int itemCategory; //0->飲み物、1->弁当類、2->果物、3->タバコ、ライター->4

  // コンストラクタ
  SupermarketItem (String itemName, int itemPrice, int itemCategory) {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemCategory = itemCategory;
  }

  // 商品名のgetter
  public String getItemName() {
    return itemName;
  }

  // 値段のgetter
  public int getItemPrice() {
    return itemPrice;
  }

  public int getItemCategory(){
    return itemCategory;
  }

  @Override
  public String toString() {
    return "[" + this.getItemName() + ":" + this.getItemPrice() + "]";
  }
}
