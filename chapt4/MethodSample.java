/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-14
 * 4.2 �����Ķ���͸���
 */
package cn.sdu.edu.sc.java.chapt4;

public class MethodSample {

	/**
	 * �����ӷ����㣬������������Ϊint
	 * 
	 * @param iNumber1
	 *            һ������
	 * @param iNumber2
	 *            һ������
	 * @return �ӷ�����Ľ������������Ϊint
	 */
	public static int addition(int iNumber1, int iNumber2) {
		int iNumber3 = iNumber2 + iNumber1;
		iNumber2 += 100;
		iNumber1 += 10000;
		System.out.println("addition: iNumber1 is " + iNumber1);
		System.out.println("addition: iNumber2 is " + iNumber2);
		System.out.println("addition: iNumber3 is " + iNumber3);
		// dNumber1=35.0;//������������
		return iNumber3;
	}

	public static int sub(int iNumber1, int iNumber2) {
		return (iNumber2 - iNumber1);
	}

	/**
	 * 
	 * @param iNumber1
	 * @param iNumber2
	 * @return ע��Խ�磬�ܹؼ�
	 */

	public static int mult(int iNumber1, int iNumber2) {
		long temp = (long) iNumber1 * (long) iNumber2;
		// long temp = iNumber1 * iNumber2;//�˷�Ĭ�Ϸ���int��������Խ��
		if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
			System.out.println("Out of Scope!!");
			return 0;
		} else
			return (int) temp;
	}

	/**
	 * ���п���̨���,��������û�з���ֵ
	 * 
	 * @param str
	 *            �����ַ���
	 */
	public static void print(String str) {
		System.out.println(str);
	
	}

	public static void main(String[] args) {
		int iNumber1 = 10, iNumber2 = 20;
		double dNumber1 = 10.0, dNumber2 = 20.0;
		int iNumber3 = addition(iNumber1, 20);
		// double dNumber3 = addition(dNumber2,dNumber1);// �������Ͳ�ƥ�䣬����

		/* ���Բ��÷���ֵ */
		mult(Integer.MAX_VALUE, Integer.MAX_VALUE);

		/* �ֲ�����������������ڱ������ڲ� */
		System.out.println("main: iNumber1 is " + iNumber1);
		System.out.println("main: iNumber2 is " + iNumber2);
		System.out.println("main: iNumber3 is " + iNumber3);

		/* �������ÿ���Ƕ�� */
		print("main: result is " + sub(iNumber2, iNumber1));
	}
}
