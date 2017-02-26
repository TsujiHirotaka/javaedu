public class Add2 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        // 引数が２つ指定されているかどうか判定する
        if (args.length != 2) {
            // 引数が２つ指定されていない場合はエラーメッセージを表示する
            System.out.println("引数を２つ入力してください。");
        } else {
            try {
                // ２つの引数を int に変換する
            	num1 = Integer.parseInt(args[0]);
            	num2 = Integer.parseInt(args[1]);
                // ２つの引数を足して表示する
            	System.out.println("num1 + num2 = " + (num1 + num2));
            } catch (NumberFormatException e) {
                // 引数に数字以外がある場合はエラーメッセージを表示する
                System.out.println("引数が数値ではありません。");
            }
        }
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED