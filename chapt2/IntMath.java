/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.2 ����������ѧ����
 */
package cn.sdu.edu.sc.java.chapt2;

public class IntMath {

	public static void main(String[] args) {

		/* �����ļӼ��˳���д */
		int iNumber1 = 7, iNumber2 = 17;
		iNumber1 += iNumber2;
		// iNumber1 = iNumber1 + iNumber2; ������ı��ʽ�ȼ�
		System.out.println("1: iNumber1 is " + iNumber1 + "; iNumber2 is "
				+ iNumber2);

		iNumber1 = 7;
		iNumber2 = 17;
		iNumber1 -= iNumber2;// iNumber1 = iNumber1-iNumber2;
		System.out.println("2: iNumber1 is " + iNumber1);

		iNumber1 = 8;
		iNumber2 = 4;
		iNumber1 /= iNumber2;// iNumber1 = iNumber1/iNumber2;
		System.out.println("3: iNumber1 is " + iNumber1);

		/* ++��--�Ĵ��� */
		iNumber1 = 8;
		iNumber1++;
		System.out.println("4: iNumber1 is " + iNumber1);

		++iNumber1;// ��iNumber1++;�ȼ�
		System.out.println("5: iNumber1 is " + iNumber1);

		iNumber1 = 8;
		iNumber2 = iNumber1++; // �Ƚ�iNumber2 = iNumber1����iNumber1=iNumber1+1
		System.out.println("6: iNumber1 is " + iNumber1 + "; iNumber2 is "
				+ iNumber2);

		iNumber1 = 8;
		iNumber2 = ++iNumber1; // �Ƚ�iNumber1=iNumber1+1����iNumber2 = iNumber1
		System.out.println("7: iNumber1 is " + iNumber1 + "; iNumber2 is "
				+ iNumber2);

	}

}
