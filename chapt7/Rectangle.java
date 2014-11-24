/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 7.4 Rectangle�࣬˵��������ͽӿڵ�ʹ��
 *  
 *  */

package cn.sdu.edu.sc.java.chapt7;

/*Java����ֻ�ܼ̳���һ�����࣬���ǿ���ͬʱʵ�ֶ���ӿ�*/
public class Rectangle extends Shape implements AreaCountable {//ʵ�ֽӿ�
	private double length;// ��
	private double width;// ��

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle(double length, double width) {
		super(4);
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return (this.width * this.length);
	}

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(10.0, 20.0);
		AreaCountable ac = rect;
		Shape s = rect;
		System.out.println("Edge of rect is " + rect.getEdge());
		System.out.println("Length of rect is " + rect.getLength());
		System.out.println("Area of rect is " + rect.getArea());

		//System.out.println("Edge of ac is " + ac.getEdge());//����ʹ�õķ���
		//System.out.println("Length of ac is " + ac.getLength());//����ʹ�õķ���
		System.out.println("Area of ac is " + ac.getArea());
		
		System.out.println("Edge of s is " + s.getEdge());
		//System.out.println("Length of s is " + s.getLength());//����ʹ�õķ���
		System.out.println("Area of s is " + s.getArea());

	}

}
