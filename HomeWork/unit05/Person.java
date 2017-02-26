import java.util.HashMap;

/**
 * 個人の成績を格納し、合計点を計算する機能を提供する。
 *
 * @author  辻裕央 ←あなたの氏名を入力してください
 */
public class Person {

    /** 氏名 */
    private String personName;

    /** 成績を格納(科目名, 点数) */
    HashMap<String, Integer> recordMap;

    /**
     * 引数に与えられた名前をもとに、新しいPersonオブジェクトを生成する。
     * @param personName 名前
     */
    public Person(String  name) {
        this.personName = name;
    }

    /** 名前の取得 */
    public String getpersonName() {
        return this.personName;
    }

    /**
     * 合計点を計算する。
     * @return 合計点
     */
    public int calcSum() {
        int kokugo = (recordMap.get("国語")).intValue();
        int sansu  = (recordMap.get("算数")).intValue();
        int rika   = (recordMap.get("理科")).intValue();
        int syakai = (recordMap.get("社会")).intValue();
        return kokugo + sansu + rika + syakai;
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
