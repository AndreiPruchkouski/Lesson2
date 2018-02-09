package by.htp.lesson2;

import java.util.Random;

public class Lesson02TaskH07 {

	public static void main(String[] args) {
		//a.  Заполнить массив размером из 100 элементов случайными целыми числами
		//b.  Найти минимальный элемент массива, созданного в задании 1.
		//c.  Разделить все элементы массива на минимальный элемент, результат деления сохранить в новый массив типа double, 
		//    вывести содержимое нового массива на экран.
		/*
		 * Результат деления будет вещественным числом, при использовании переменной типа int 
		 * результат деления автоматически округлитися до ближайшего целого значения, 
		 * т.е. до 0.0. Чтобы избежать такой ситуации, нужно воспользоваться приведением типа:
		 * int x1 = 8;
		 * int x2 = 13;
		 * double d = x1/(double)x2;
		 */

		int[] arr1 = new int[100];
		Random random = new Random();
		// a.
		for(int i = 0;i < arr1.length; i++) {
			arr1[i] = random.nextInt(100 - 1 + 1) + 1;
		}
		for(int element: arr1) {
			System.out.print(element + " ");
		}
		
		// b.
		int min = arr1[0];
		
		for(int i = 0;i < arr1.length-1; i++) {
			if (arr1[i] < min) {
				min = arr1[i];
				
			}
		}
		System.out.println("\nMin array element = " + min);
		System.out.println();
		// c. 
		// Declare new Double Array for storage new data
		double[] arr2 = new double[100];
		// Fill newly declared Array with calculation data
		for(int i = 0;i < arr1.length; i++) {
			arr2[i] = arr1[i] / (double)min;
		}
		// Print array values
		for(double element: arr2) {
			System.out.println(element + " ");
		}
		

	}

}
