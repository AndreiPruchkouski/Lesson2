package by.htp.lesson2;

public class Lesson02Task01 {

	public static void main(String[] args) {
		// Объявить массив целого типа и заполнить целыми значениями от 1 до 100.
		// Вывести содержимое массива на экран.
		// Для заполнения использовать цикл for, для вывода - также цикл for

		int а[] = new int[100];

		for (int i = 0; i <= 99; i++) {
			а[i] = i + 1;
		}
		for (int i = 0; i <= 99; i++) {
			System.out.println(а[i]);
		}

	}

}
