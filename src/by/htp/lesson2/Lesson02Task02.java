package by.htp.lesson2;

public class Lesson02Task02 {

	public static void main(String[] args) {
		// Заполнить массив символами от A до Z, содержимые массива вывести на экран.

		// Version 1
		char a[] = new char[26];

		for (int i = 0; i <= 25; i++) {
			switch (i) {
			case 0:
				a[i] = 'A';
				break;
			case 1:
				a[i] = 'B';
				break;
			case 2:
				a[i] = 'C';
				break;
			case 3:
				a[i] = 'D';
				break;
			case 4:
				a[i] = 'E';
				break;
			case 5:
				a[i] = 'F';
				break;
			case 6:
				a[i] = 'G';
				break;
			case 7:
				a[i] = 'H';
				break;
			case 8:
				a[i] = 'I';
				break;
			case 9:
				a[i] = 'J';
				break;
			case 10:
				a[i] = 'K';
				break;
			case 11:
				a[i] = 'L';
				break;
			case 12:
				a[i] = 'M';
				break;
			case 13:
				a[i] = 'N';
				break;
			case 14:
				a[i] = 'O';
				break;
			case 15:
				a[i] = 'P';
				break;
			case 16:
				a[i] = 'Q';
				break;
			case 17:
				a[i] = 'R';
				break;
			case 18:
				a[i] = 'S';
				break;
			case 19:
				a[i] = 'T';
				break;
			case 20:
				a[i] = 'U';
				break;
			case 21:
				a[i] = 'V';
				break;
			case 22:
				a[i] = 'W';
				break;
			case 23:
				a[i] = 'X';
				break;
			case 24:
				a[i] = 'Y';
				break;
			case 25:
				a[i] = 'Z';
				break;
			}
		}
		System.out.println("Result for Version 1:");
		for (int i = 0; i <= 25; i++) {
			System.out.print(a[i] + " ");
		}
		
		// This line used to divide V1 from V2
		System.out.println();
		System.out.println("Result for Version 2:");

		// Version 2
		char b[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		for (int i = 0; i <= 25; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
