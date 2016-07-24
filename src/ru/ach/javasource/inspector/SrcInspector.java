/**
 * 
 */
package ru.ach.javasource.inspector;

/**
 * @author Андрей
 *
 */
public class SrcInspector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Выводит сообщение в основной информационный поток
	 * @param message
	 */
	private static void output(String message) {
		if(message == null || message.isEmpty()) {
			throw new IllegalArgumentException("Сообщение отсутствует");
		}
		// Как временный вариант: вывод на системную консоль
		System.out.println(message);
	}

	/**
	 * @param message
	 */
	private static void log(String message) {
		
	}
}
