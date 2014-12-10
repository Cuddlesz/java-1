/**
 * @author Dahogn
 * @version 1.00
 * @since 2012.11.27
 * 9.1 ˵��Java���쳣����
 */

package cn.sdu.edu.sc.java.chapt9;

import java.util.Scanner;

public class ExceptionDemo {
	public static int div(int number, int div) throws DivideByZeroException
	// throws���п����׳��쳣�����ڷ�����û�б�����
	// ʹ�������ķ�����Ӧ�÷���try{}����
	{
		if (div == 0)
			throw new DivideByZeroException("��������Ϊ0");
		// �׳��쳣�󣬽�������ֹ�˷�����ִ��
		else
			return number / div;
	}

	public static int sqrt(int number) throws SqrtExceedException
	// throws���п����׳��쳣�����ڷ�����û�б�����
	// ʹ�������ķ�����Ӧ�÷���try{}����
	{
		if (number > 46340)
			throw new SqrtExceedException("��ƽ����Խ��");
		// �׳��쳣�󣬽�������ֹ�˷�����ִ��
		else
			return number * number;
	}

	public static int div() {
		return (10 / 0);
	}

	public static int div(int div) throws DivideByZeroRuntimeException
	// throws���п����׳��쳣�����ڷ�����û�б�����
	// ʹ�������ķ�����Ӧ�÷���try{}����
	{
		if (div == 0)
			throw new DivideByZeroRuntimeException("��������Ϊ0");
		// �׳��쳣�󣬽�������ֹ�˷�����ִ��
		else
			return 10 / div;
	}

	public static void main(String[] args) {

		int div = 0;
		int number = 10;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������");
		div = scan.nextInt();
		// result=number/div; //��Σ�յ�д��
		// ��if-else��ܷ���
		if (div == 0) {
			System.out.println("��������Ϊ0");
			result = number / (div + 1);
			System.out.println("result=" + result);

		} else {
			result = number / div;
			System.out.println("result=" + result);

		}

		// ��Exception�࣬����һ�㲻Ҫֱ����Exception��
		try {
			result = 10;
			System.out.println("��������һ������");
			div = scan.nextInt();
			if (div == 0) {
				throw new Exception("��������Ϊ0");
				// ��������������
				// result=number/(div+1);
				// System.out.println("result="+result);
			} else {
				result = number / div;
				System.out.println("result=" + result);
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("result=" + result);
		} finally {
			System.out.println("FINAL");
		}

		// ���Զ����DivideByZeroException�쳣���Ϻõ��÷�
		try {
			result = 10;
			System.out.println("2:��������һ������");
			div = scan.nextInt();
			if (div == 0)
				throw new DivideByZeroException();
			else {
				result = number / div;
				System.out.println("result=" + result);
			}
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("result=" + result);
		} 
		
		// ʹ�û���δ�����쳣���ܵ�div()����
		try {
			ExceptionDemo.div(10, 0);
			ExceptionDemo.sqrt(100);
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
		} catch (SqrtExceedException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ����unchecked exception, ����ֱ��ʹ�ã��쳣���ձ��׳�������̨
		ExceptionDemo.div();
		ExceptionDemo.div(10);
		// ExceptionDemo.div(10, 0); //�˾仰������
		try{
			int temp=10/0;
		}catch(Exception e){
			
		}
	}
}
