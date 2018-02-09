package by.htp.lesson2;

public class Lesson02TaskH03 {

	public static void main(String[] args) {

		// Заполнить массив из 100 элементов целыми числами от 1 до 100, вывести на
		// экран содержимое массива в одну строку,
		// поменять чётные цифры местами с нечётными, результат вывести на экран в одну
		// строку.

		int d[] = new int[100];

		for (int i = 1; i <= 100; i++) {
				d[i - 1] = i;
		}

		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		// For each 
		System.out.println();
		System.out.println("For each structure");
		for(int element: d) {
			System.out.print(element + " ");
		}
		

		int b = 0;

		for (int i = 0; i < d.length - 1; i = i + 2) {
			if (d[i] % 2 == 1) {
				b = d[i];
				d[i] = d[i + 1];
				d[i + 1] = b;
			}
		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		
	}

}
