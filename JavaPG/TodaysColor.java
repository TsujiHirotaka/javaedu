public class TodaysColor {
	public static void main(String[] args) {

		int myNameCode = 0;
		int todayNameCode = 0;
		int colorID = 0;
	 	char[] myName = {'��','��','�B'};
		final String[] COLOR = {"��", "��", "�u���[", "��", "��", "�z���C�g", "��", "����", "��"};
		String strMyName = "�җT��";

		try{
			todayNameCode = myNameCode + Integer.parseInt(args[0]) * 7 + Integer.parseInt(args[1]) * 13;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ɠ�����͂��Ă�������");
			return;
		} finally {

		}

		System.out.println("���̖��O��" + strMyName + "�ł��B");

		for (char val : myName) {
			myNameCode = myNameCode + val;
		}






		System.out.println("�����̃l�[���R�[�h��" + todayNameCode + "�ł��B");


		colorID = myNameCode % 9;
		System.out.println("���b�L�[�J���[��" + COLOR[colorID] + "�ł��B");


		System.out.println("�ŏ��̈����� " + args[0] + " �ł��B");
		System.out.println("2 �Ԗڂ̈����� " + args[1] + " �ł��B");



	//	for (int i = 0; i < myName.length; i++) {
	//		System.out.print(myName[i]);
	//	}
	//	System.out.println(myName[0]);
	//	System.out.println(myName[1]);
	//	System.out.println(myName[2]);
	}
}
