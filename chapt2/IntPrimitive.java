/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.1 ������������
 */
package cn.sdu.edu.sc.java.chapt2;

public class IntPrimitive {

	public static void main(String[] args) {

		/* Primitive���ͣ�int��long��short��byteһ����Сд */
		/* ����Ĭ�϶���int */
		int iNumber = 7;// 32bit
		long lNumber = 7L;// 64bit
		//iNumber = 7777777777; //Խ��
		lNumber = 7777777777L; // ���������"L"
		System.out.println("1: lNumber is " + lNumber);
		short sNumber = 7;// 16bit
		byte bNumber = 7;// 8bit
		// bNumber = 777;//Խ��
		Byte oNumber = 7;// ��ԭ���������ͣ�Non-Primitive)

	}

}
