/** 
 * @author Dahogn
 * @version 1.00
 * @since 2012.11.27
 * 9.1 ˵��Java���쳣����
 */
package cn.sdu.edu.sc.java.chapt9;

public class SqrtExceedException extends Exception {

	public SqrtExceedException() {
		super("Sqrt Exceed��");
	}

	public SqrtExceedException(String message) {
		super(message);
	}
}
