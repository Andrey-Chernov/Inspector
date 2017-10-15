package ru.ach.javasource.inspector;

/**
 * @author Андрей
 *
 */
public class SrcInspector {
	/**
	 * @param args - параметры командной строки
	 */
	public static void main(String[] args) {
		output("Java source code inspector.");
	}

	/**
	 * Выводит сообщение в основной информационный поток.
	 * @param message - сообщение
	 */
	private static void output(String message) {
		if(message == null || message.isEmpty()) {
			throw new IllegalArgumentException("Сообщение отсутствует");
		}
		// Как временный вариант: вывод на системную консоль
		System.out.println(message);
	}

	/**
	 * Вывод служебной информации и протокола работы.
	 * @param message - сообщение
	 */
	private static void log(String message) {
		if(message == null || message.isEmpty()) {
			throw new IllegalArgumentException("Сообщение отсутствует");
		}
		System.out.println(message);
	}
}
