import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Customer クラス
 *
 * @author  辻裕央 ←あなたの氏名を入力してください
 */
public class Customer {

    /** 顧客番号 */
    private String customerID;
    /** 顧客氏名 */
    private String name;
    /** 顧客住所 */
    private String address;
    /** 登録日 */
    private String date;
    /** 購入品 */
    private String item;

    /**
     * コンストラクター
     *
     * @param customerID 顧客番号
     * @param name 顧客氏名
     * @param address 顧客住所
     * @param item 購入品
     */
    public Customer(String customerID, String name, String address, String item) {

        this.customerID = customerID;
        this.name = name;
        this.address = address;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd");
        this.date = LocalDate.now().format(df);
        this.item = item;
    }

    /**
     * 顧客データを横一列に表示するメソッド
     */
    public void printCustomer() {

        System.out.print(this.customerID);
        System.out.print("  ");
        System.out.print(this.name);
        System.out.print("  ");
        System.out.print(this.address);
        System.out.print("  ");
        System.out.print(this.date);
        System.out.print("  ");
        System.out.println(this.item);
    }

    /**
     * メンバ変数customerIDを設定するメソッド
     *
     * @param customerID 顧客番号
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * メンバ変数nameを設定するメソッド
     *
     * @param name 顧客氏名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * メンバ変数addressを設定するメソッド
     *
     * @param address 顧客住所
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * メンバ変数itemを設定するメソッド
     *
     * @param item 購入品
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * メンバ変数customerIDを取り出すメソッド
     *
     * @return String customerID 顧客番号
     */
    public String getCustomerID() {
        return this.customerID;
    }

    /**
     * メンバ変数nameを取り出すメソッド
     *
     * @return String name 顧客氏名
     */
    public String getName() {
        return this.name;
    }

    /**
     * メンバ変数addressを取り出すメソッド
     *
     * @return String address 顧客住所
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * メンバ変数itemを取り出すメソッド
     *
     * @return String item 購入品
     */
    public String getItem() {
        return this.item;
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
