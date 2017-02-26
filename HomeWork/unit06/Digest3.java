import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class Digest3 {

    public static void main(String[] args) throws Exception {

        Digest3 digest3 = new Digest3();
        byte[] dg = digest3.calcDigest("test.txt");

        for (int i = 0; i < dg.length; i++) {
            System.out.printf("%02x ", dg[i]);
        }
    }

    public byte[] calcDigest(String filename) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        DigestInputStream dis =
            new DigestInputStream(new FileInputStream(filename), md);
        while (dis.read() != -1); // 単に読むだけ
        dis.close();        // fileはopenしたら必ずcloseする習慣をつける
        return md.digest(); // ハッシュ計算完了
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED