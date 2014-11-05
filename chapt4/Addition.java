/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-19 
 * 4.3 ˵��������Overwriting����д��
 * ����û���ж��Ƿ��Խ�磬�����Ǻõĳ���
 */
package cn.sdu.edu.sc.java.chapt4;

public class Addition {
	public int Add(int number1, int number2) {
		System.out.println("Use int");
		return (number1 + number2);
	}

	public int Add(int number1, int number2, int number3) {
		System.out.println("Use int 3");
		return this.Add(Add(number1, number2), number3);
	}

	public double Add(double number1, double number2) {
		System.out.println("Use double");
		return (number1 + number2);
	}

	public float Add(float number1, float number2) {
		System.out.println("Use float");
		return (number1 + number2);
	}

	/* �β��б���ͬ������ֵ��ͬ������ */
//	public double Add(float number1, float number2) {
//		System.out.println("Use float2");
//		return (double) (number1 + number2);
//	}

	public short Add(short number1, short number2) {
		System.out.println("Use short");
		return (short) (number1 + number2);// Ĭ�Ϸ���int������ǿ������ת��
	}

	public int Add(int number1, short number2) {
		System.out.println("Use int and short");
		return (number1 + number2);
	}

	public int Add(short number1, int number2) {
		System.out.println("Use short and int");
		return (number1 + number2);
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		/* ע���Խ�� */
		System.out.println(add.Add(Integer.MAX_VALUE, Integer.MAX_VALUE));

		/* �����������ò�ͬ�ķ��� */
		add.Add(4, 5);
		add.Add(4, 5, 6);

		/* �����������ò�ͬ�ķ��� */
		add.Add(4.5, 5.3);
		add.Add(4.5f, 5.3f);

		/* �����������ò�ͬ�ķ��� */
		int iNumber = 10;
		short sNumber = 20;
		add.Add(iNumber, sNumber);
		add.Add(sNumber, iNumber);
		add.Add(sNumber, sNumber);
	}

}
