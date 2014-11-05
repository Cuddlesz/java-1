/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-14
 * 2.8 ǿ������ת��
 */

package cn.sdu.edu.sc.java.chapt2;

public class CastSample {

	public static void main(String[] args) {

		float fNumber = (float) 7.0;
		long lNumber = (long) 7;

		fNumber = lNumber;// ����ʵ�֣��Զ�����ת��
		System.out.println("1: fNumber is " + fNumber);

		/* Խ�粻�ᱨ�����Ǻ��п������߼����� */
		int iNumber2 = 100000;
		byte bNumber = (byte) iNumber2;
		System.out.println("2: bNumber is " + bNumber);

		/* �ж�Խ�緶Χ����һ���ܺõ����� */
		if (iNumber2 <= Byte.MAX_VALUE) {
			bNumber = (byte) iNumber2;
			System.out.println("3: bNumber is " + bNumber);
		} else
			System.out.println("Out of Scope");
	}

}
