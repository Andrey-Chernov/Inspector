/**
 * 
 */
package ru.ach.javasource.inspector;

/**
 * @author ������
 *
 */
public class SrcInspector {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		output("Java source code inspector.");
	}
	
	/**
	 * ������� ��������� � �������� �������������� �����
	 * @param message
	 */
	private static void output(String message) {
		if(message == null || message.isEmpty()) {
			throw new IllegalArgumentException("��������� �����������");
		}
		// ��� ��������� �������: ����� �� ��������� �������
		System.out.println(message);
	}

	/**
	 * ����� ��������� ���������� � ��������� ������. 
	 * @param message
	 */
	private static void log(String message) {
	}
}
