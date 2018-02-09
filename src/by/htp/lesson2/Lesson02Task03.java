package by.htp.lesson2;

public class Lesson02Task03 {

	public static void main(String[] args) {
		// Заполнить массив целых чисел четными значениями в диапазоне 2-100;

		int index = 0;

		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				index++;
			}
		}
		System.out.println("Index is equal to = " + index);

		int d[] = new int[index];

		int a = 0;
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				d[a] = i;
				System.out.print(d[a] + " ");
				a++;
				
			}
		}
		
		//Duplicate output
		System.out.println();
		System.out.println("duplicate output");
		
		for (int i = 0; i < d.length - 1; i++) {
			
			System.out.print(d[i] + " ");
		}

	}

}
