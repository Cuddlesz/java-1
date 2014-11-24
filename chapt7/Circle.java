/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 7.3 Circle�࣬˵���������ʹ��
 *  
 *  */
package cn.sdu.edu.sc.java.chapt7;

public class Circle extends Shape {
	private double rad;// Բ�İ뾶

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public Circle(double rad) {
		super(0);// ������ɻ���Ĺ��죬���»����ǳ�����
		this.rad = rad;
	}

	public double getArea() {
		return (Math.PI * this.rad * this.rad);
	}

	public static void main(String[] args) {
		Shape s = new Circle(10.0);// ���������ָ������Ķ���
		System.out.println("Area of s is " + s.getArea());
	}

}
