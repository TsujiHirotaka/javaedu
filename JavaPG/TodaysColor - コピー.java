public class TodaysColor {
	public static void main(String[] args) {

		int myNameCode = 0;
		int todayNameCode = 0;
		int colorID = 0;
		int month = 0;
		int day = 0;
	 	char[] myName = {'石','川','唯'};
		final String[] COLOR = {"白", "黒", "ブルー", "緑", "黄", "ホワイト", "赤", "純白", "紫"};
		String strMyName = "";



	
		//名前の連結

		for (char val : myName) {
			strMyName = strMyName + val;
		}

		//ネームコードの連結
		for (char val : myName) {
			myNameCode = myNameCode + val;
		}


		//入力チェックと今日のネームコード
		try{
			todayNameCode = myNameCode + Integer.parseInt(args[0]) * 7 + Integer.parseInt(args[1]) * 13;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("月と日を入力してください。");
			return;
		} catch(NumberFormatException e) {
			System.out.println("月と日を数字で入力してください。");
			return;
		} finally {

		}

		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);


		//月の値チェック
		if (month > 12 | month < 1 ){
			System.out.println("月と日の値が正しくありません。正しい値を入力してください。");
			return;
		}
		//日の値チェック
		if (day > 31 | day < 1 ){
			System.out.println("月と日の値が正しくありません。正しい値を入力してください。");
			return;
		}

		System.out.print("私の名前は" + strMyName + "です。");

		System.out.print("今日のネームコードは" + todayNameCode + "です。");


		colorID = todayNameCode % 9;
		System.out.println("ラッキーカラーは" + COLOR[colorID] + "です。");


	//	System.out.println("最初の引数は " + args[0] + " です。");
	//	System.out.println("2 番目の引数は " + args[1] + " です。");
	//	for (int i = 0; i < myName.length; i++) {
	//		System.out.print(myName[i]);
	//	}
	//	System.out.println(myName[0]);
	//	System.out.println(myName[1]);
	//	System.out.println(myName[2]);
	}
}
