/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 6.2 �򵥵�Student�࣬˵���̳й�ϵ���̳���Person��
 *  
 *  */

package cn.sdu.edu.sc.java.chapt6;

public class Student extends Person {
	private int StudentNo;// ѧ��

	public int getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}

	public Student(String name, int StudentNo) {
		super(name);// �����ǵ�һ��
		this.StudentNo = StudentNo;
		System.out
				.println("In Constructor Student(String name, int StudentNo)");
	}

	public Student() {
		// super();//��ʹ��дsuper()��Ҳ�ض������
		this.StudentNo = 1;
		System.out.println("In Constructor Student()");
	}
	
	/* ��ʽ��������� */
	public String toString() {
		return ("name is " + this.getName() + "; StudentNo is " + this.StudentNo);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.getName().equals(s.getName())
					&& this.StudentNo == s.StudentNo)
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean isSame(Student s) {
		if (s == null)
			return false;
		if (this.getName().equals(s.getName()) && this.StudentNo == s.StudentNo)
			return true;
		else
			return false;
	}

	/*
	 * ���أ�Overridding��Person���ж���� Output()������ ������������һ�����β��б�һ������ʱ����ֵ���ͱض�һ������������
	 */
	public void Output() {
		super.Output();// ���ø����Output()����
		System.out.println("StudentNo is " + this.getStudentNo());
	}

	/*
	 * ��д�� Overwritting�� Output������ �β��б�һ���������Person���ж����
	 * Output()��������Overridding
	 */
	public void Output(String notes) {
		this.Output();
		System.out.println("notes:" + notes);
	}

	public void OutputClassName() {
		System.out.println("Class Student");
	}

	public final void OutputSuperClassName() {//ͨ��final�ؼ��֣�ָ�����಻������Overridding�������
		super.OutputClassName();// ���ø���ķ����������ٲ���Overridding
	}

	public static void main(String[] args) {
		Student s = new Student("Tom", 123);
		Person p = new Student("Tom", 123);

		if (s == p)
			System.out.println("s==p");
		else
			System.out.println("s!=p");
		if (s.equals(s))
			System.out.println("s equals p");
		else
			System.out.println("s NOT equals p");
		System.out.println("1---------------------------------------------");
		s.Output();
		p.Output();
		// p.Output("EX");//�����������ʹ�ã�Person������û���������
		s.Output("EX");
		s.OutputSuperClassName();
		System.out.println("2---------------------------------------------");
		/* ͨ��isSame()������˵��������Ϊ�����β��ڼ̳й�ϵ�е�Ӧ�� */
		Person p1 = new Student("Jerry", 1);
		Person p2 = new Student("Jerry", 123);
		Student s3 = new Student("Jerry", 1234);
		Person p4 = new Person("Jerry");

		if (p1.isSame(p2))
			System.out.println("p1 is Same p2");
		else
			System.out.println("p1 is NOT Same p2");

		if (p1.isSame(s3))
			System.out.println("p1 is Same s3");
		else
			System.out.println("p1 is NOT Same s3");
		if (s3.isSame(p1))
			System.out.println("s3 is Same p1");
		else
			System.out.println("s3 is NOT Same p1");

		if (p4.isSame(s3))
			System.out.println("p1 is Same p2");
		else
			System.out.println("p1 is NOT Same p2");
		if (s3.isSame(p4))
			System.out.println("s3 is Same p2");
		else
			System.out.println("s3 is NOT Same p2");

	}
}
