package by.htp.lesson2;

import java.util.Random;

public class Lesson02TaskH01 {

	public static void main(String[] args) {
		// Заполнить массив размером из 100 элементов случайными целыми числами

		// Version 1
		int a[] = new int[100];
		int x = 0;
		int y = 1000;

		for (int i = 0; i < a.length; i++) {

			a[i] = x + (int) (Math.random() * y);
			System.out.println("Version 1. Array i" + i + " was filled with = " + a[i]);
		}

		// Version 2
		int b[] = new int[100];
		Random rand = new Random();

		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt((1000 - 0) + 1) + 0;
			System.out.println("Version 2. Array i" + i + " was filled with = " + b[i]);
		}

	}

}
