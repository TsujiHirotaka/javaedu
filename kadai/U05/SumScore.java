import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 氏名と各科目の点数を入力させ、合計値を表示する。
 *
 * @author  辻裕央 ←あなたの氏名を入力してください
 */
public class SumScore {

    /** 新しいSumScoreオブジェクトを生成する。 */
    public SumScore() {
    }

    /**
     * mainメソッド
     * @param args コマンドライン引数(今回は使用しない)
     */
    public static void main(String[] args) {

        //　科目数
        final int KAMOKUCOUNT = 4;
        //　科目名
        final String[] KAMOKU = {"国語","算数","理科","社会"};

        try (InputStreamReader inStream = new InputStreamReader(System.in);
            BufferedReader bufReader = new BufferedReader(inStream)) {

            int personCount = 0;
            System.out.print("何人分の成績を入力しますか(数字で入力): ");
            try {
                String inParam = bufReader.readLine();
                personCount = Integer.parseInt(inParam);
                if (personCount <= 0) {
                    System.out.println("人数は1以上にしてください。");
                    System.exit(1);
                }
            } catch (NumberFormatException e) {
                System.out.println("人数は整数で指定してください。");
                System.exit(1);
            }

            // 人数分だけPerson配列を生成する。
            Person[] person = new Person[personCount];
            // 人数分だけ点数を入力させる。
            for (int i = 0; i < personCount; i++) {
                System.out.print((i + 1) + "人目の名前: ");
                String inName = bufReader.readLine();
                // 名前を引数にPersonオブジェクトを生成する。
                if (inName == null || inName.equals("")) {
                    System.out.println("名前の入力は必須です。");
                    System.exit(1);
                }
                person[i] = new Person(inName);



                // 成績を格納するHashMapを生成する。
                HashMap<String, Integer> recordMap = new HashMap<String, Integer>(KAMOKUCOUNT);


                // 各科目の点数を入力させる。
                for (int j = 0 ; j < KAMOKUCOUNT ; j++ ){
                	System.out.print(KAMOKU[j] + ":");
                	Integer inParam = Integer.valueOf(bufReader.readLine());
                	if (inParam > 100 || inParam < 0){
                        System.out.println("点数は0～100で入力してください。");
                        System.exit(1);
                	}
                    // recordMapに各科目の点数を格納する。
                    recordMap.put(KAMOKU[j], inParam);
                }
                // recordMap をPersonオブジェクトに代入する。
                person[i].recordMap = recordMap;
            }

            // 合計点を計算し出力する。
            System.out.println();
            System.out.println("====== 合 計 点 一 覧 =====");
            for (int i = 0; i < personCount; i++) {
                int sum = person[i].calcSum();
                System.out.println("名前：" + person[i].personName + ", 合計：" + sum + "点");
            }
        } catch (NumberFormatException e) {
            System.out.println("点数は整数で指定してください。");
            System.exit(1);
	    } catch (IOException e) {
	        System.out.println("点数の入力は必須です。");
	        System.exit(1);
	    }
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
