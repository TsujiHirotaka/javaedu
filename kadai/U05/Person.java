import java.util.HashMap;

/**
 * �l�̐��т��i�[���A���v�_���v�Z����@�\��񋟂���B
 *
 * @author  �җT�� �����Ȃ��̎�������͂��Ă�������
 */
public class Person {

    /** ���� */
    String personName;

    /** ���т��i�[(�Ȗږ�, �_��) */
    HashMap<String, Integer> recordMap;

    /**
     * �����ɗ^����ꂽ���O�����ƂɁA�V����Person�I�u�W�F�N�g�𐶐�����B
     * @param personName ���O
     */
    public Person(String  name) {
        this.personName = name;
    }

    /**
     * ���v�_���v�Z����B
     * @return ���v�_
     */
    public int calcSum() {
        int kokugo = (recordMap.get("����")).intValue();
        int sansu  = (recordMap.get("�Z��")).intValue();
        int rika   = (recordMap.get("����")).intValue();
        int syakai = (recordMap.get("�Љ�")).intValue();
        return kokugo + sansu + rika + syakai;
    }
}
// Copyright 2013-2015 FUJITSU APPLICATIONS LIMITED
