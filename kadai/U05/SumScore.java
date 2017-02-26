import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * �����Ɗe�Ȗڂ̓_������͂����A���v�l��\������B
 *
 * @author  �җT�� �����Ȃ��̎�������͂��Ă�������
 */
public class SumScore {

    /** �V����SumScore�I�u�W�F�N�g�𐶐�����B */
    public SumScore() {
    }

    /**
     * main���\�b�h
     * @param args �R�}���h���C������(����͎g�p���Ȃ�)
     */
    public static void main(String[] args) {

        //�@�Ȗڐ�
        final int KAMOKUCOUNT = 4;
        //�@�Ȗږ�
        final String[] KAMOKU = {"����","�Z��","����","�Љ�"};

        try (InputStreamReader inStream = new InputStreamReader(System.in);
            BufferedReader bufReader = new BufferedReader(inStream)) {

            int personCount = 0;
            System.out.print("���l���̐��т���͂��܂���(�����œ���): ");
            try {
                String inParam = bufReader.readLine();
                personCount = Integer.parseInt(inParam);
                if (personCount <= 0) {
                    System.out.println("�l����1�ȏ�ɂ��Ă��������B");
                    System.exit(1);
                }
            } catch (NumberFormatException e) {
                System.out.println("�l���͐����Ŏw�肵�Ă��������B");
                System.exit(1);
            }

            // �l��������Person�z��𐶐�����B
            Person[] person = new Person[personCount];
            // �l���������_������͂�����B
            for (int i = 0; i < personCount; i++) {
                System.out.print((i + 1) + "�l�ڂ̖��O: ");
                String inName = bufReader.readLine();
                // ���O��������Person�I�u�W�F�N�g�𐶐�����B
                if (inName == null || inName.equals("")) {
                    System.out.println("���O�̓��͕͂K�{�ł��B");
                    System.exit(1);
                }
                person[i] = new Person(inName);



                // ���т��i�[����HashMap�𐶐�����B
                HashMap<String, Integer> recordMap = new HashMap<String, Integer>(KAMOKUCOUNT);


                // �e�Ȗڂ̓_������͂�����B
                for (int j = 0 ; j < KAMOKUCOUNT ; j++ ){
                	System.out.print(KAMOKU[j] + ":");
                	Integer inParam = Integer.valueOf(bufReader.readLine());
                	if (inParam > 100 || inParam < 0){
                        System.out.println("�_����0�`100�œ��͂��Ă��������B");
                        System.exit(1);
                	}
                    // recordMap�Ɋe�Ȗڂ̓_�����i�[����B
                    recordMap.put(KAMOKU[j], inParam);
                }
                // recordMap ��Person�I�u�W�F�N�g�ɑ������B
                person[i].recordMap = recordMap;
            }

            // ���v�_���v�Z���o�͂���B
            System.out.println();
            System.out.println("====== �� �v �_ �� �� =====");
            for (int i = 0; i < personCount; i++) {
                int sum = person[i].calcSum();
                System.out.println("���O�F" + person[i].personName + ", ���v�F" + sum + "�_");
            }
        } catch (NumberFormatException e) {
            System.out.println("�_���͐����Ŏw�肵�Ă��������B");
            System.exit(1);
	    } catch (IOException e) {
	        System.out.println("�_���̓��͕͂K�{�ł��B");
	        System.exit(1);
	    }
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
