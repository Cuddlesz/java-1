/**
 * @author Dahogn
 * @version 1.00
 * @since 2012.11.27
 * 9.1 �Զ����쳣DivideByZeroRuntimeException,˵��Java���쳣����
 * һ������£�����������������캯�������Ҳ�������дgetMessage()����
 */

package cn.sdu.edu.sc.java.chapt9;

public class DivideByZeroRuntimeException extends RuntimeException {

	public DivideByZeroRuntimeException() {
		super("Divide By Zero");
	}

	public DivideByZeroRuntimeException(String message) {
		super(message);
	}

	
}
