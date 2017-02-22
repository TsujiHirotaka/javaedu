public class TodaysColor {
	public static void main(String[] args) {

		int myNameCode = 0;
		int todayNameCode = 0;
		int colorID = 0;
	 	char[] myName = {'石','川','唯'};
		final String[] COLOR = {"白", "黒", "ブルー", "緑", "黄", "ホワイト", "赤", "純白", "紫"};
		String strMyName = "辻裕央";

		try{
			todayNameCode = myNameCode + Integer.parseInt(args[0]) * 7 + Integer.parseInt(args[1]) * 13;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("月と日を入力してください");
			return;
		} finally {

		}

		System.out.println("私の名前は" + strMyName + "です。");

		for (char val : myName) {
			myNameCode = myNameCode + val;
		}






		System.out.println("今日のネームコードは" + todayNameCode + "です。");


		colorID = myNameCode % 9;
		System.out.println("ラッキーカラーは" + COLOR[colorID] + "です。");


		System.out.println("最初の引数は " + args[0] + " です。");
		System.out.println("2 番目の引数は " + args[1] + " です。");



	//	for (int i = 0; i < myName.length; i++) {
	//		System.out.print(myName[i]);
	//	}
	//	System.out.println(myName[0]);
	//	System.out.println(myName[1]);
	//	System.out.println(myName[2]);
	}
}
