/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-31 
 * 5.4 ��װ��
 *  */

package cn.sdu.edu.sc.java.chapt5;

public class WrapperClass {

	public static void main(String[] args) {
		int number = 5;
		Integer oNumber = new Integer(5);

		number = oNumber;

		oNumber = 15;

		Integer intClass1 = 5;
		System.out.println("intClass1 is " + intClass1);
		Integer intClass2 = 5;
		System.out.println("intClass2 is " + intClass2);

		if (intClass2 == intClass1)
			System.out.println("intClass2 == intClass1");
		else
			System.out.println("intClass2 != intClass1");
		if (intClass2.equals(intClass1))
			System.out.println("intClass2 equals intClass1");
		else
			System.out.println("intClass2 NOT equals intClass1");

		Integer intClass3 = new Integer(number);
		System.out.println("intClass3 is " + intClass3);

		if (intClass2 == intClass3)
			System.out.println("intClass2 == intClass3");
		else
			System.out.println("intClass2 != intClass3");
		if (intClass2.equals(intClass3))
			System.out.println("intClass2 equals intClass3");
		else
			System.out.println("intClass2 NOT equals intClass3");

		String strNum = "55";
		Integer intClass4 = new Integer(strNum);
		System.out.println("intClass4 is " + intClass4);
		
		int number2 = intClass4.intValue();
		System.out.println("number2 is " + number2);
		int number3 = intClass4;// ���Խ����Զ��Ĳ��
		System.out.println("number3 is " + number3);

		int number4 = Integer.parseInt("55");// ���õ��ַ���ת��Ϊ�����ķ���
		System.out.println("number4 is " + number4);
		int number5 = Integer.parseInt("5A", 16);// ���õĲ�ͬ���Ƶ��ַ���ת��Ϊ�����ķ���
		System.out.println("number5 is " + number5);
	
		String strNum2 = Integer.toString(number);// ���õ�����ת��Ϊ�ַ����ķ���
	    System.out.println("strNum2 is " + strNum2);
		String strNum3 = Integer.toString(90, 16);// ���õ�����ת��Ϊ��ͬ���Ƶ��ַ����ַ����ķ���
		System.out.println("strNum3 is " + strNum3);

		System.out.println("Integer.MAX_VALUE is " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE is " + Integer.MIN_VALUE);

		Double doubleClass1 = new Double("45.168");
		System.out.println("doubleClass1 is " + doubleClass1);
		Double doubleClass2 = 45.168;
		System.out.println("doubleClass2 is " + doubleClass2);

		double doubleNum = doubleClass1;// ���Խ����Զ��Ĳ��
		System.out.println("doubleNum is " + doubleNum);

		double doubleNum2 = Double.parseDouble("67.8970");// ���õ��ַ���ת��Ϊ�����ķ�����ע���β��0����ȥ
		System.out.println("doubleNum2 is " + doubleNum2);
		String strNum4 = Double.toString(45.678);// ���õĸ�����ת��Ϊ�ַ����ķ���
		System.out.println("strNum4 is " + strNum4);

		System.out.println("Double.MAX_VALUE is " + Double.MAX_VALUE);
		System.out.println("Double.MIN_VALUE is " + Double.MIN_VALUE);
	}

}
