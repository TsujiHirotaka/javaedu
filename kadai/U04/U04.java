import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * U04 クラス
 *
 * @author  辻裕央 ←あなたの氏名を入力してください
 */
public class U04 {

    /** 読み込みファイルの指定 */
    public static final String INPUT_FILE = "U04.txt";
    /** 繰り返し回数 */
    public static final int REPEAT_COUNT = 9;

    /**
     * メインメソッド
     *
     * @param args コマンドライン引数は使用しない
     */
    public static void main(String[] args) {

        try (FileReader input = new FileReader(INPUT_FILE)) {
            // 読み込むローカル変数
            int inData;

            // 一文字だけ出力する場合はPrintStream.print(char)ではなく
            // PrintWriter.print(char)を使う
            PrintWriter writer = new PrintWriter(System.out);

            inData = input.read();
            while (inData != -1) {
                writer.print((char) inData);
                inData = input.read();
            }
            writer.flush();

        } catch (FileNotFoundException e) {
            // ファイルが存在しない場合の例外処理
            System.out.println("例外が発生しました[ファイル無し]。" + e);
        } catch (IOException e) {
            // 入力エラーが発生した場合の例外処理
            System.out.println("例外が発生しました[入力エラー]。" + e);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("aaaaa@fujitsu.com");
        sb.append(", ");
        sb.append("bbbbb@fujitsu.com");
        sb.append(", ");
        sb.append("ccccc@fujitsu.com");

        System.out.println("●文字結合= " + sb.toString());
        Message message = new Message("単元04の実習問題です");
        String strMessage = message.getMessage();
        System.out.println("●メッセージ内容= " + strMessage);
        System.out.println("●メッセージ日時= " + message.getDate());

        StringBuilder sb2 = new StringBuilder();
        sb2.append("単元04の実習問題です");
        String strMessage2 = sb2.toString();

        // 「strMessage」と「strMessage2」が参照するStringオブジェクトの値が
        // 同じ値かどうかをチェックする。同じ値であれば【同じ値】と出力する。
        // なお、ここでは「strMessage」と「strMessage2」は同じ値となっている。
        if (strMessage.equals(strMessage2)) {
            System.out.println("★判定【同じ値  】→「" + strMessage + "」と「" +  strMessage2 + "」を判定。");
        } else {
            System.out.println("★判定【異なる値】→「" + strMessage + "」と「" +  strMessage2 + "」を判定。");
        }

        String str = "単元0";
        StringBuilder result = new StringBuilder();

        // String 上で結合
        // ループ 1 回ごとに String オブジェクトが１つ作られる
        // （次のループでそのオブジェクトを指す変数がなくなり、
        // ゴミになってしまうことに注意すること）
        for (int i = 0; i < REPEAT_COUNT; i++) {
            result.append(str);
            result.append(i + 1);
            result.append(".");
        }

        System.out.println("●繰り返し出力= " + result);
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
