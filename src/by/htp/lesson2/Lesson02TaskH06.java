package by.htp.lesson2;

import java.util.Random;

public class Lesson02TaskH06 {

	public static void main(String[] args) {
		// ПОСЛЕДНЯЯ ЗАДАЧА. 
//		Заполнить массив из 100 элементов целыми случайными числами,  вывести на экран содержимое массива в одну строку, 
//		поменять чётные цифры местами с нечётными, результат вывести на экран в одну строку. 
//		Если для чётного числа нет пары из чётного - замену не производить.
		
		// Declare Array + Random
		int[] arr1 = new int[100];
		Random rand = new Random();
		
		// Fill array with random data and print each element
		for(int i = 0;i < arr1.length; i++) {
			arr1[i] = rand.nextInt(100);
			System.out.print(arr1[i] + " ");
		}
		
		// Declare indexes to calculate number of even and odd elements in array
		int index1 = 0;
		int index2 = 0;
		for(int i = 0;i < arr1.length; i++) {
			if(arr1[i] % 2 == 0) {
				index1++;
			} else {
				index2++;
			}
		}
		System.out.println();
		System.out.println("Number of even elements = " + index1);
		System.out.println("Number of odd elements = " + index2);
		
		// Declare 2 temporary arrays for indexes 
		int[] arrtemp1 = new int[index1];
		int[] arrtemp2 = new int[index2];
		// Fill Temp Arrays with index values
		int a = 0;
		for(int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				arrtemp1[a] = i;
				System.out.print(arrtemp1[a] + " ");
				a++;
			}
		}
		System.out.println();
		int b = 0;
		for(int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0) {
				arrtemp2[b] = i;
				System.out.print(arrtemp2[b] + " ");
				b++;
			}
		}
		
		// To find shorter array -->
		int arrlimit = 0;
		if (arrtemp1.length < arrtemp2.length) {
			arrlimit = arrtemp1.length;
		} else {
			arrlimit = arrtemp2.length;
		}
		System.out.println("\nShorter arreay = " + arrlimit);
		
		// Swap even elements with odd elements + print array
		for(int i = 0; i < arrlimit-1; i++) {
			int c = arr1[arrtemp1[i]];
			arr1[arrtemp1[i]] = arr1[arrtemp2[i]];
			arr1[arrtemp2[i]] = c;
		}
		for(int element: arr1) {
			System.out.print(element + " ");
		}
		
		
		
		// МОЖНО РЕШИТЬ В РАМКАХ ОДНОГО МАССИВА, умножая заменненые числа на N. Сложно, но можно
	}

}
