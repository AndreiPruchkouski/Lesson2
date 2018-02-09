package by.htp.lesson2;

import java.util.Random;

public class Lesson02TaskH02 {

	public static void main(String[] args) {
		// Вывести из массива (задание 1) все чётные элементы на экран
		
		int b[] = new int[100];
		
		Random rand = new Random();

		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt((1000 - 0) + 1) + 0;
		}
		System.out.println("Even numbers from []:");
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				System.out.print(b[i] + " ");
			}
		}
	}

}
