/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-14
 * 4.1 �ַ����Ļ���֪ʶ
 */

package cn.sdu.edu.sc.java.chapt4;

public class StringSample {

	public static void main(String[] args) {

		/* String���ǻ�����������,���ǿ�����"+" */
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + str2;// ������"-"
		System.out.println("1: str3 is " + str3);

		int str3_l = str3.length();
		System.out.println("length of str3 is " + str3_l);

		/* ע���0��ʼ��������һ���ַ�Ϊ0 */
		char ch = str3.charAt(1);
		System.out.println("the SECOND char is " + ch);

		/* ע�� + ��������� */
		System.out.println(100 + 10000 + "Hello" + 100 + 10000);

		str3 = "" + 100;// ��򵥵�ת�����ַ����ļ���
		System.out.println("2: str3 is " + str3);

	}

}
