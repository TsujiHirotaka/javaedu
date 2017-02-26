import java.security.MessageDigest;

public class Digest1 {

    public static void main(String[] args) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte dat = 65;
        md.update(dat);
        byte[] dg = md.digest();

        for (int i = 0; i < dg.length; i++) {
            System.out.printf("%02x ", dg[i]);
        }
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED