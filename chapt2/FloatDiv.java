/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.5 ����������
 */
package cn.sdu.edu.sc.java.chapt2;

public class FloatDiv {

	public static void main(String[] args) {

		double dNumber = 17 / 7;
		System.out.println("1: dNumber is " + dNumber);

		dNumber = 17 / 7.0;
		System.out.println("2: dNumber is " + dNumber);

		dNumber = 17 / (double) 7;
		System.out.println("3: dNumber is " + dNumber);

		dNumber = (double) 17 / 7;
		//�ȼ��� dNumber = ((double) 17) / 7;
		System.out.println("4: dNumber is " + dNumber);
	}

}
