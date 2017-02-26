import java.security.MessageDigest;

public class Digest2 {

    public static void main(String[] args) throws Exception {

        Digest2 digest2 = new Digest2();
        byte[] dg = digest2.calcDigest("ABCD");

        for (int i = 0; i < dg.length; i++) {
            System.out.printf("%02x ", dg[i]);
        }
    }

    public byte[] calcDigest(String data) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] dat = data.getBytes();    // 文字列をbyteの配列に変換
        md.update(dat);                  // dat配列からダイジェストを計算する
        return md.digest();              // ハッシュ計算完了
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED