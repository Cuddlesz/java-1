package cn.sdu.edu.sc.java.chapt10;

/**
 * ˵�����ı��ļ�����ȡ�ı����ݵķ��� 
 * @author Dahogn
 * @version 1.01
 * @since 2008.12.10
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileInputDemo {
	public static void main(String[] args) {
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("text.txt"));
			int count = 0;
			// String line = inputStream.readLine();
			int ch = inputStream.read();
			// readLine�������ļ�ĩβ��������null
			// ע�⻹��һ��read�����������õ�Int��UNICODE�룩���ļ�ĩβ������-1
			while (ch != -1) {
				System.out.print((char) ch);
				ch = inputStream.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
			System.out.println("or could not be opened.");
		} catch (IOException e) {
			System.out.println("Error reading from file.");
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Problem with close the stream");
			}
		}
	}
}
