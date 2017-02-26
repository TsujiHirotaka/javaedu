import java.util.Calendar;

public class Today {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("今日は" + year + "年" + month + "月" + date + "日です。");
        System.out.println("今は" + hour + "時" + minute + "分" + second + "秒です。");
    }
}
//Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED