/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-11-25 
 * 8.1 ˵������Ļ���ʹ�÷���
 *  
 *  */
package cn.sdu.edu.sc.java.chapt8;

public class ArrayTest {
	public static final int ArrayLength = 10;// ����ħ����Magic Number������Ч����

	public static void Output(int[] intArray) {
		for (int index = 0; index < intArray.length; index++)
			System.out.print(intArray[index] + ",");
		System.out.println();
	}

	public static void swap(int[] intarr) {
		int temp = intarr[0];
		intarr[0] = intarr[1];
		intarr[1] = temp;
	}

	public static void main(String[] args) {

		int[] intArray = new int[ArrayTest.ArrayLength];// ����һ������
		for (int index = 0; index < intArray.length; index++)
			intArray[index] = index * index;
		ArrayTest.Output(intArray);
		System.out.println("--------------------------------------");
		int[] testarr = { 14, 25 };// ���������������ͬʱ���г�ʼ��
		/*
		 * ���ֿܷ����ֿ�д������
		 */
		/*
		 * int[] testarr; testarr= { 14, 25 };
		 */
		ArrayTest.swap(testarr);
		ArrayTest.Output(testarr);// ��ʱ�������������������Ԫ�صĽ���

	}

}
