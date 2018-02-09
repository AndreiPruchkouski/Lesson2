package by.htp.lesson2;

import java.util.Random;

public class Lesson02TaskH04 {

	public static void main(String[] args) {
		// Подсчитать количество чётных и нечётных элементов в массиве из задания 1, 
		// вывести количество четных и нечетных на экран 
		// Задание 1 было --> Заполнить массив размером из 100 элементов случайными целыми числами
		
		int a[] = new int[100];
		Random rand = new Random();
		
		for(int i = 0;i < a.length; i++) {
			a[i] = rand.nextInt((100 - 0) + 1) + 0;
			System.out.print(a[i] + " ");
		}
		
		// Declare variables to calculate even and odd numbers.
		int even = 0;
		int odd = 0;
		
		for(int i = 0;i < a.length; i++) {
			if (a[i] % 2 == 1) {
				odd++;
			}else {
				even++;
			}
		}
		System.out.println();
		System.out.println("Number of even numbers = " + even);
		System.out.println("Number of odd numbers = " + odd);
		
			
	}

}
