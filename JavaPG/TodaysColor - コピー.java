public class TodaysColor {
	public static void main(String[] args) {

		int myNameCode = 0;
		int todayNameCode = 0;
		int colorID = 0;
		int month = 0;
		int day = 0;
	 	char[] myName = {'��','��','�B'};
		final String[] COLOR = {"��", "��", "�u���[", "��", "��", "�z���C�g", "��", "����", "��"};
		String strMyName = "";



	
		//���O�̘A��

		for (char val : myName) {
			strMyName = strMyName + val;
		}

		//�l�[���R�[�h�̘A��
		for (char val : myName) {
			myNameCode = myNameCode + val;
		}


		//���̓`�F�b�N�ƍ����̃l�[���R�[�h
		try{
			todayNameCode = myNameCode + Integer.parseInt(args[0]) * 7 + Integer.parseInt(args[1]) * 13;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ɠ�����͂��Ă��������B");
			return;
		} catch(NumberFormatException e) {
			System.out.println("���Ɠ��𐔎��œ��͂��Ă��������B");
			return;
		} finally {

		}

		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);


		//���̒l�`�F�b�N
		if (month > 12 | month < 1 ){
			System.out.println("���Ɠ��̒l������������܂���B�������l����͂��Ă��������B");
			return;
		}
		//���̒l�`�F�b�N
		if (day > 31 | day < 1 ){
			System.out.println("���Ɠ��̒l������������܂���B�������l����͂��Ă��������B");
			return;
		}

		System.out.print("���̖��O��" + strMyName + "�ł��B");

		System.out.print("�����̃l�[���R�[�h��" + todayNameCode + "�ł��B");


		colorID = todayNameCode % 9;
		System.out.println("���b�L�[�J���[��" + COLOR[colorID] + "�ł��B");


	//	System.out.println("�ŏ��̈����� " + args[0] + " �ł��B");
	//	System.out.println("2 �Ԗڂ̈����� " + args[1] + " �ł��B");
	//	for (int i = 0; i < myName.length; i++) {
	//		System.out.print(myName[i]);
	//	}
	//	System.out.println(myName[0]);
	//	System.out.println(myName[1]);
	//	System.out.println(myName[2]);
	}
}
