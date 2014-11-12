package keywords;

/**
 * ˵��static�Ļ���ʹ�÷���
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2010.11.23
 * 
 */

public class StaticSimple {
	private static int count;// ���ü�����
	private int iNumber;

	public void inc() {
		iNumber++;
		count++;
	}

	public void print() {
		System.out.println("iNumber is " + iNumber + " AND count is " + count);
	}

	public static void dec() {
		count--;
		//iNumber--; //��̬����������thisָ�򣬲���ʹ����ķǾ�̬����
	}

	public static void main(String[] args) {
		StaticSimple ss1 = new StaticSimple();
		ss1.inc();
		ss1.print();

		StaticSimple ss2 = new StaticSimple();
		ss2.inc();
		ss2.print();

		StaticSimple ss3 = new StaticSimple();
		ss3.inc();
		ss3.print();

		ss3.dec();// ���Ƽ���ʹ�÷�ʽ
		StaticSimple.dec();// ���ھ�̬������ֱ�����������ʼ���
		ss3.print();
	}
}
