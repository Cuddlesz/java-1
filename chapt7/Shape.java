/**
 * @author �����@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 7.1 Shape�࣬˵���������ʹ��
 *  
 *  */

package cn.sdu.edu.sc.java.chapt7;

public abstract class Shape {
	private int edge;// ��״�м����߹��ɣ���ΪԲ����0����

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}

	public Shape(int edge) {
		this.edge = edge;
	}

	public String toString() {
		return ("edge is " + this.edge);
	}

	/*
	 * ������󷽷��������һ����������Ϊabstract����ô�����ض�Ϊabstract�������ࣩ ����������й����������ǲ���ֱ�����ɳ�����Ķ���
	 */
	public abstract double getArea();

	/*
	 * ������û�з����壬����д�������� public abstract void getArea(); public abstract void
	 * getArea(){;}
	 */
	public static void main(String[] args) {
		// Shape s = new Shape(4); //�������ɳ�����Ķ���
		
		System.out.println("��ϰʹ��------------------------------------------------");
		Shape[] arr = new Shape[2];
		arr[0] = new Rectangle(10.0, 20.0);
		arr[1] = new Circle(15.0);
		for (int index = 0; index < arr.length; index++)
			System.out.println("Area of arr[" + index + "] is "
					+ arr[index].getArea());

	}
}
