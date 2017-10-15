package ru.ach.javasource.inspector;

/**
 * @author Андрей
 *
 */
public class SrcInspector {
    private static final String programName = "Java source code inspector.";
    private static final String version = "ver.1.0, 2015 - 2017";
	/**
	 * @param args - параметры командной строки
	 */
	public static void main(String[] args) {
		output(programName);
		output(version);
		log("The program is started");
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
