/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-19 
 * 5.1 ˵��final���÷�
 *  final���α����������������ֻ�ܱ���ֵ1�Σ���ֵ�󽫲��ܱ��ı䣬������������������
 * 
 *  */

package cn.sdu.edu.sc.java.chapt5;

import cn.sdu.edu.sc.java.chapt4.Rectangle;

public class FinalSample {

	private final int VALUE_A = 10;// VALUE_A��ֵ�����ܱ��ı�

	public static final int VALUE_B = 10;// �൱�ڶ�����һ������

	private final Rectangle rect = new Rectangle(10, 20);

	/* ���Խ���������Ϊfinal���Ҳ�����ʼֵ����ô���췽������Դ����Խ��и�ֵ */
	private final int VALUE_C;

	/* ������Setter���� */
	public int getVALUE_C() {
		return VALUE_C;
	}
	
	FinalSample(int c) {
		VALUE_C = c;
	}

	public void test() {
		// VALUE_A = 100;//���ܸı�
		// rect=new Rectangle(100, 200);//���ܸı�

		/* �ı�ָ������ֵ�ǿ��Ե� */
		rect.setLength(100);
		rect.setWidth(200);
	}

	/* �βζ���Ϊfinal�������ڲ����ܸı���βε�ֵ */
	public void testFinal(final int iNumber) {
		// iNumber++;//����
	}

	public static void main(String[] args) {
		System.out.println("VALUE_B is " + FinalSample.VALUE_B);// ����ֱ��ʹ��

		FinalSample fs = new FinalSample(20);
		System.out.println("VALUE_C is " + fs.getVALUE_C());

	}

}
