/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.3 �����ĳ���
 */
package cn.sdu.edu.sc.java.chapt2;

public class IntDiv {

	public static void main(String[] args) {

		/* ����ķ���������һ�£������ķ����뱻����һ�� */
		int iNumber1 = 7, iNumber2 = 17;
		int iNumber3 = iNumber2 / iNumber1;
		int iNumber4 = iNumber2 % iNumber1;// ȡ����
		System.out.println("1: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);

		iNumber1 = 7;
		iNumber2 = -17;
		iNumber3 = iNumber2 / iNumber1;
		iNumber4 = iNumber2 % iNumber1;
		System.out.println("2: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);

		/* ��һ�� ��������Գ����ټ���������һ�����ڱ������� */
		iNumber1 = -7;
		iNumber2 = 17;
		iNumber3 = iNumber2 / iNumber1;
		iNumber4 = iNumber2 % iNumber1;
		System.out.println("3: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);

		iNumber1 = -7;
		iNumber2 = -17;
		iNumber3 = iNumber2 / iNumber1;
		iNumber4 = iNumber2 % iNumber1;
		System.out.println("4: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);
	}

}
