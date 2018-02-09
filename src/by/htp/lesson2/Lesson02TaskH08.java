package by.htp.lesson2;

public class Lesson02TaskH08 {

	public static void main(String[] args) {
		// Создать 2 массива длинной 50 элементов, поменять местами элементы в четной
		// позиции
		// первого массива с элементами в нечетной позиции второго массива.

		int arr1[] = new int[51];
		int arr2[] = new int[51];

		// Filling arrays
		for (int i = 1; i <= 51; i++) {
			arr1[i - 1] = i;
			arr2[i - 1] = i;
		}

		// Switching elements

		for (int i = 0; i < arr1.length; i++) {
			// Задаем ограничение чтобы не выходить за рамки массива
			if (i % 2 == 0 && i + 1 < arr2.length) {
				int a = arr1[i];
				arr1[i] = arr2[i + 1];
				arr2[i + 1] = a;
			}

		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");

		}
		System.out.println();
		for (int element : arr2) {
			System.out.print(element + " ");
		}
	}

}
