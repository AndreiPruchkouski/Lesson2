package by.htp.lesson2;

import java.util.Random;

public class Lesson02TaskH05 {

	public static void main(String[] args) {
		// Найти максимальный элемент массива из задания 1, вывести значение максимального элемента на экран
		
		//Version 01
		int a[] = new int[100];
		Random rand = new Random();

		// Fill array with some random data
		for(int i = 0;i < a.length; i++) {
			a[i] = rand.nextInt((100 - 0) + 1) + 0;
			System.out.print(a[i] + " ");
		}
		// To find max number in array
		int max = a[0];
		for(int i = 1;i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("\nVersion 1. Max value from array = " + max);
		
		//Version 2 (using Math.max())
		int b[] = new int[100];
		Random rand2 = new Random();
		for(int i = 0;i < b.length; i++) {
			b[i] = rand2.nextInt((100 - 0) + 1) + 0;
			System.out.print(b[i] + " ");
		}
		int max2	= Integer.MIN_VALUE;	
		for(int i = 0; i < b.length; i++) {
			max2 = Math.max(max2, b[i]);
		}

		System.out.println("\nVersion 2. Max value from array = " + max2);
		
	}

}
