import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * KadaiU04 クラス
 *
 * @author  辻裕央 ←あなたの氏名を入力してください
 */
public class KadaiU04 {

    /**
     * メインメソッド
     *
     * @param args コマンドライン引数はなし
     */
    public static void main(String[] args) {

        // 顧客データをセットする
        Customer[] customers = new Customer[] {
            new Customer("0001", "織田信夫", "愛知", "食料"),
            new Customer("0002", "武田晴彦", "", "衣服"),
            new Customer("0003", "上杉景子", "新潟", "雑貨"),
            new Customer("0004", "徳川康男", "", "雑誌"),
            new Customer("0005", "羽柴秀之", "愛知", "家電")
        };

        // 日付の表示形式をDateTimeFormatterに設定
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        // 今日の日付を設定した表示形式で取得
        // LocalDateTime.now().formatの戻り値はString
        String today = LocalDateTime.now().format(df);

        System.out.println("▽▽Ｕ０４提出課題  " + today + "▽▽");
        System.out.println();
        System.out.println("＊＊登録顧客データを全件表示します＊＊");

        for (int i = 0; i < customers.length; i++) {
            customers[i].printCustomer();
        }

        System.out.println();
        System.out.println("＊＊住所が未入力の人を検索します＊＊");

        boolean flag = false;  // 検索結果判定のための変数
        for (int i = 0; i < customers.length; i++) {
            // 住所が未入力な顧客を検索
            if (customers[i].getAddress().length() == 0) {
                // 住所が未入力の顧客情報を表示
                customers[i].printCustomer();
                // 該当者が見つかったため、flagをtrueに変更
                flag = true;
            }
        }

        // 該当者の有無をチェック
        // flagがfalse・・・「該当者はいません」を表示
        // flagがtrue ・・・何も表示しない
        if (!flag) {
            System.out.println("該当者はいません");
        }

        System.out.println();
        System.out.println("＊＊住所が未入力の人のデータを[不明]に更新します＊＊");

        for (int i = 0; i < customers.length; i++) {
            // 住所が未入力な顧客を検索
            if (customers[i].getAddress().length() == 0) {
                System.out.println("[" + customers[i].getCustomerID() + "]"
                    + "の住所は未入力なので[不明]に更新します");
                // 住所が未入力の顧客データの住所を不明に更新する
                customers[i].setAddress("不明");
            }
        }

        System.out.println();
        System.out.println("＊＊販売した商品一覧を表示します＊＊");

        // String 上で文字結合
        // ループ 1 回ごとに String オブジェクトが１つ作られる
        // （次のループでそのオブジェクトを指す変数がなくなり、
        // ゴミになってしまうことに注意すること）
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < customers.length; i++) {
            result.append(customers[i].getItem());
            result.append(",");
        }

        System.out.println(result);
        System.out.println();
        System.out.println("＊＊登録顧客データを全件表示します＊＊");

        for (int i = 0; i < customers.length; i++) {
            customers[i].printCustomer();
        }
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
