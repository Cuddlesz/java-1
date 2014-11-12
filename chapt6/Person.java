/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-31 
 * 5.2 ˵��static���÷�
 *  static˵�����ԣ����߷��������������࣬������ĳһ������Ķ���
 *  ���������������ȫ���Եķ���
 *  */

package cn.sdu.edu.sc.java.chapt5;

public class Person {
	private String name;// ����
	private int id;// ��ʶ
	private static int count;// ����������¼һ�������˶��ٸ���

	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Person(String name) {
		this.name = name;
		id++;
		count++;
	}

	/* ��̬�����в���ֱ��ʹ�����еķǾ�̬������������ */
	public static void test() {
		// id++;//����
		count = 10;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Tom");
		System.out.println("1: id is " + p1.getId());
		System.out.println("1: count is " + p1.getCount());

		Person p2 = new Person("Tom");
		System.out.println("2: id is " + p2.getId());
		System.out.println("2: count is " + p2.getCount());

		Person p3 = new Person("Tom");
		System.out.println("3: id is " + p3.getId());
		System.out.println("3: count is " + p3.getCount());
		/*���Ƽ��ö��������þ�̬�������� p3.getCount() */
		
		/* ����Ϊstatic�ķ����������ԣ�����ֱ�����������е��� */
		System.out.println("count is " + Person.getCount());
		
		/* main����Ҳ��static������ֱ�ӵ���ͬһ���������static���� */
		test();
		System.out.println("count is " + Person.getCount());
	}

}
