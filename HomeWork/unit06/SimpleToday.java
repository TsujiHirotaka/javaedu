import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleToday {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
        System.out.println(sdf.format(new Date()));
    }
}
//Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED