/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-14
 * 2.6 �ַ���ʹ�ú͸���
 */

package cn.sdu.edu.sc.java.chapt2;

public class CharSample {

	public static void main(String[] args) {

		/* Unicode 16bit */
		char ch1 = 'a';// �����ű�ʾ������˫����
		// char ch1="a";//�﷨����
		System.out.println("1: ch1 is " + ch1);

		char ch2 = 97;
		System.out.println("2: ch2 is " + ch2);

		byte bNumber = 97;
		char ch3 = (char) bNumber;// ����ǿ������ת��
		System.out.println("3: ch3 is " + ch3);
	
		/* �μ�ת���ַ� */
		ch1 = '\''; // ����ǿ������ת��
		System.out.println("4: ch1 is " + ch1);

		/* \t \n \r �����Ű� */
		System.out.println("5: 1\t 2\t 3\t");
		System.out.println("5: 10\t 20\t 30\t");
		System.out.println("5: 100\t 200\t 300\t");
		
		/* Unicode�������ַ�Ҳ���� */
		char ch4 = '��';
		System.out.println("6: ch4 is " + ch4);

		/*������Ҳʹ�ã�ǿ�Ҳ��Ƽ� */
		char �ַ� = '��';
		System.out.println("7: �ַ� is " + �ַ�);
	}

}
