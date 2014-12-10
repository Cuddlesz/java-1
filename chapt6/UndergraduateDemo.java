/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 6.4 ˵��������Ϊ���ԡ������βΡ���������ֵ��
 *  
 *  */
package cn.sdu.edu.sc.java.chapt6;

public class UndergraduateDemo {
	private Undergraduate undergraduate;

	public Undergraduate getUndergraduate() {
		return undergraduate;
	}

	public void setUndergraduate(Undergraduate undergraduate) {
		this.undergraduate = undergraduate;
	}

	public UndergraduateDemo(String initialName, int initialStudentNumber,
			int initialLevel) {
		undergraduate = new Undergraduate(initialName, initialStudentNumber,
				initialLevel);
	}

	public void reset(String initialName, int initialStudentNumber,
			int initialLevel) {
		undergraduate = new Undergraduate(initialName, initialStudentNumber,
				initialLevel);
	}

	public void upgrade() {
		if (undergraduate == null)
			System.out.println("undergraduate is null");
		else {
			int level = undergraduate.getLevel();
			if (level < 4)
				undergraduate.setLevel(level + 1);
			else
				undergraduate.setLevel(4);
		}
	}

	public void showUpgradeAddOne(int level) {
		level = level + 1;
		System.out.println("undergraduate  AddOne is:" + level);
	}

	public static void ShowUndergraduate(Undergraduate ug) {
		ug.Output();
	}

	// һ������Ϊstatic
	public void UpgradeUndergraduate(Undergraduate ug) {
		int level = ug.getLevel();
		if (level < 4)
			ug.setLevel(level + 1);
		else
			ug.setLevel(4);
	}

	// һ������Ϊstatic
	public static void UpgradeUndergraduate(Object object) {
		if (object == null)
			System.out.println("Object is null");
		else if (object instanceof Undergraduate) {
			Undergraduate ug = (Undergraduate) object;
			int level = ug.getLevel();
			if (level < 4)
				ug.setLevel(level + 1);
			else
				ug.setLevel(4);
		} else
			System.out.println("Object is wrong");

	}

	public Undergraduate InitUndergraduate(String initialName,
			int initialStudentNumber, int initialLevel) {
		Undergraduate temp = new Undergraduate(initialName,
				initialStudentNumber, initialLevel);
		return temp;
		// ����ֱ��д return new
		// Undergraduate(initialName,initialStudentNumber,initialLevel);
	}

	// һ������Ϊstatic
	public static void ShowUndergraduate(Object object) {
		if (object == null)
			System.out.println("Object is null");
		else if (object instanceof Undergraduate) {
			Undergraduate ug = (Undergraduate) object;
			ug.Output();
		} else
			System.out.println("Object is wrong");
	}

	public static void main(String[] args) {

		Undergraduate undergraduate1 = new Undergraduate("Tom", 12345, 1);
		UndergraduateDemo demo = new UndergraduateDemo("Tom", 12345, 1);

		System.out.println("====Step1====");
		UndergraduateDemo.ShowUndergraduate(undergraduate1);

		System.out.println("====Step2====");

		demo.UpgradeUndergraduate(undergraduate1);

		demo.showUpgradeAddOne(undergraduate1.getLevel());

		undergraduate1.Output();// ע���ʱlevel��ֵ������

		System.out.println("====Step3====");
		Undergraduate undergraduate2 = demo
				.InitUndergraduate("Jerry", 12346, 2);
		UndergraduateDemo.ShowUndergraduate(undergraduate2);

		Person person = new Undergraduate("Tom", 12345, 1);

		System.out.println("====Step4====");
		System.out.println("���ڶ�������ObjectΪ�βεķ��������³��������ȷִ��");
		UndergraduateDemo.ShowUndergraduate(person);

		System.out.println("====Step5====");
		UndergraduateDemo.UpgradeUndergraduate(person);
		person.Output();// ע���ʱlevel��ֵ������

		System.out.println("====Step6====");
		Student student = demo.InitUndergraduate("Jerry", 12346, 2);
		UndergraduateDemo.ShowUndergraduate(student);
	}
}