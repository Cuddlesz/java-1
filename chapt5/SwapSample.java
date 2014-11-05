/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-11-6 
 * 5.3 ͨ��swap��˵�������������ݵġ���ֵ���ص�
 *  Java���淽�����ݣ�ȫ���Ǵ�ֵʵ��
 *  */

package cn.sdu.edu.sc.java.chapt5;

class Int {
	public int in;// �ڲ�ֻ��һ��int���͵ı�����Ϊ��ʹ�÷��㣬����Ϊpublic�����Ǻõķ���

	public Int(int in) {
		this.in = in;
	}

}

public class SwapSample {

	/* ��Primitive������Ϊ�βΣ���ֵ���޷����swap */
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println("swap int: i is " + i);
		System.out.println("swap int: j is " + j);

	}

	/* ���Զ����Int�࣬�����õĵ�ֵַ���������swap */
	public static void swap(Int oi, Int oj) {
		int temp = oi.in;
		oi.in = oj.in;
		oj.in = temp;

		/* ���´���һ���������swap */
		/*
		 * Int otemp=oi; oi=oj; oj=otemp;
		 */
		System.out.println("swap Int: oi.in is " + oi.in);
		System.out.println("swap Int: oj.in is " + oj.in);

	}

	public static void swap(Integer wi, Integer wj) {
		Integer otemp = wi;
		wi = wj;
		wj = otemp;

		System.out.println("swap Integer: wi is " + wi);
		System.out.println("swap Integer: wj is " + wj);
	}

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		swap(i, j);
		System.out.println("1 main: i is " + i);
		System.out.println("1 main: j is " + j);
		System.out.println("--------------------------------");

		Int oi = new Int(10);
		Int oj = new Int(20);
		swap(oi, oj);
		System.out.println("2 main: oi.in is " + oi.in);
		System.out.println("2 main: oj.in is " + oj.in);
		System.out.println("--------------------------------");

		Integer wi = 10;
		Integer wj = 20;
		swap(wi, wj);
		System.out.println("3 main: wi is " + wi);
		System.out.println("3 main: wj is " + wj);
		System.out.println("--------------------------------");

	}

}
