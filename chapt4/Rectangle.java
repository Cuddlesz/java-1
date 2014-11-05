/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-10-24 
 * 4.4 ˵���������ķ�װ�����֣�ע��Getter��Setter
 *  ��δ�������ر�õ����
 *  */
package cn.sdu.edu.sc.java.chapt4;

public class Rectangle {

	/*
	 * ��������Ϊprivate�����ַ�װ�����Կ��Ծ���Ĭ��ֵ�������ָ����ϵͳ��Ĭ�Ϸ��䣬��intΪ0
	 */
	private int length = 200;
	private int width = 100;

	/* ʹ��Getter()��Setter()�������Ա�¶��ȥ */
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int calcArea() {
		int area = length * width;
		return area;
	}

	/* ע�� this���÷� */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	/*
	 * Ĭ�Ϲ����� �����û�й���������ôϵͳ������һ��û����ʽ�������Ĺ������� �����ʽ�����˹���������ôĬ�Ϲ��������������ã�����ͨ��������ʽ����
	 */
	public Rectangle() {
		this(10, 20);
	}

	/* equals()�����Ķ��壬�˴��ⲻ��һ���õ�д�� */
	public boolean equals(Rectangle rect) {
		if (rect == null)
			return false;
		if (this.length == rect.length && this.width == rect.width)
			return true;
		else
			return false;
	}

	public static Rectangle creatRectangle(int length, int width) {
		Rectangle temp = new Rectangle(length, width);
		return temp;
	}

	public static void main(String[] args) {

		int l = 10;
		int w = 20;
		Rectangle rect;
		rect = creatRectangle(l, w);

		int ll=rect.getLength();
		
		/* ������α����ر���ϸ����⣬��Ϊ���Java�Ĺؼ��������ͼ1 */
		int iNumber = 5;// ����һ�仰�Ա�
		Rectangle rect1 = new Rectangle(10, 20);
		Rectangle rect2 = new Rectangle(10, 20);
		if (rect1 == rect2)
			System.out.println("rect1==rect2");
		else
			System.out.println("rect1!=rect2");

		if (rect1.equals(rect2))
			System.out.println("rect1 equals rect2");
		else
			System.out.println("rect1 NOT equals rect2");

		rect2 = rect1;
		if (rect1 == rect2)
			System.out.println("AGAIN rect1==rect2");
		else
			System.out.println("AGAIN rect1!=rect2");
	}

}
