/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-18
 * 3.2 ��֧�����÷�
 */
package cn.sdu.edu.sc.java.chapt3;

public class Branch {

	public static void main(String[] args) {

		int iNumber1 = 5, iNumber2 = 10;
		// iNumber1++�����˼��㣬�����ж�ʱiNumber1ֵΪ5
		if (iNumber1++ > 5)
			System.out.println("1.The Value of iNumber2 is " + iNumber2
					+ ";The Value of iNumber1 is " + iNumber1);
		// else//д�Ͳ�дelse��һ��
		System.out.println("2.The Value of iNumber2 is " + iNumber2
				+ ";The Value of iNumber1 is " + iNumber1);

		// iNumber1++û�м���
		if (iNumber2 < 20 || iNumber1++ > 5) {
			System.out.println("3.The Value of iNumber2 is " + iNumber2
					+ ";The Value of iNumber1 is " + iNumber1);

		}

		if (iNumber2 > 8) {
			if (iNumber1 > 4) {
				System.out.println("4.The Value of iNumber2 is " + iNumber2
						+ ";The Value of iNumber1 is " + iNumber1);
			} 
	   else// ƥ��"if(iNumber1>4)"
			System.out.println("5.The Value of iNumber2 is " + iNumber2
						+ ";The Value of iNumber1 is " + iNumber1);
		}
		
		iNumber2 = 5;
		switch (iNumber2) {
		case 5:
			System.out.println("6.The Value of iNumber2 is " + iNumber2);
		case 10:
			System.out.println("7.The Value of iNumber2 is " + iNumber2);
		case 15:
			System.out.println("8.The Value of iNumber2 is " + iNumber2);
			break;
		case 20:
			System.out.println("9.The Value of iNumber2 is " + iNumber2);
			break;
		default:
			System.out.println("10.The Value of iNumber2 is " + iNumber2);
		}

		// ʹ�� ?:
		iNumber2 = iNumber1 > 10 ? 20 + iNumber1 : 30 + iNumber1;
		System.out.println("11.The Value of iNumber2 is " + iNumber2);
	}

}
