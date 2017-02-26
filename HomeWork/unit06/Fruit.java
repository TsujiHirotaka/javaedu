/*
 * 果物の名前と単価を管理し価格を出力します。
 * 作成者 富士 通子
 * 版数 1.0
 */
public class Fruit {

    /* 果物の名前を表す変数です。 */
    private String name;
    /* 果物の単価を表す変数です。 */
    private int price;

    /* Fruitオブジェクトを既定値で構築します。 */
    public Fruit() {
    }

    /*
     * 与えられた名前と単価でFruitオブジェクトを構築します。
     * 引数 名前
     * 引数 単価
     */
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /*
     * 単価を返します。
     * 戻り値 単価
     */
    public int getPrice() {
        return price;
    }

    /*
     * 単価をセットします。
     * 非推奨 コンストラクターを使用してください。
     * 引数 単価
     * 参照 Fruit(String name, int price)
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /*
     * 購入個数を受け取り価格を出力します。
     * 引数 購入個数
     */
    public void buy(int quantity) {
        System.out.println(name + "を" + quantity + "個買いました。全部で" + quantity * price + "円です。");
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
