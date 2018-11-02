package sessions.s02;

import java.util.Arrays;

public class Siruri {
	// array -> null
	// | | | | | |
	//
	public static void main(String[] args) {
		int[] array; // declararea array-ului
		array = new int[5]; // crearea array-ului

		// in practica se scrie int[] array = new int[5];
		array[0] = 9;
		array[1] = 7;
		array[2] = 8;
		array[3] = 10;
		array[4] = 9;

		System.out.println(array[0]);

		System.out.println(Arrays.toString(array));

		System.out.println(array.length);

		int[] array2 = { 9, 7, 8, 10, 9 };

		int[][] matrice = { //
				{ 1, 2, 3 }, //
				{ 4, 5, 6, 10 }, //
				{ 7, 8 } //
		};

		System.out.println(matrice[0][0]);
		System.out.println(matrice[2][0]);
		System.out.println(matrice[0][2]);
		System.out.println(matrice[1][1]);
		System.out.println(matrice[1][2]);
		System.out.println(matrice[2][1]);

		// java.lang.ArrayIndexOutOfBoundsException:
		// System.out.println(matrice[4][3]);

		int[] src = { 7, 8, 8, 9, 10 }; // -> 8,8,9
		int lungime = src.length - 2;

		int[] dest = new int[lungime];
		System.arraycopy(src, 1, dest, 0, lungime);
		System.out.println(Arrays.toString(dest));
		// ar trebui sa afiseze [8,8,9]

		// Arrays.binarySearch(src, 9);
		System.out.println(Arrays.binarySearch(src, 9)); // ...
		System.out.println(Arrays.binarySearch(src, 11)); // ...

		int[] copyOf = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(copyOf));

		System.out.println(Arrays.equals(src, copyOf));
		System.out.println(Arrays.equals(src, dest));

		int[] sir3 = { 9, 6, 3, 7, 7, 9, 2, 31, 9 };
		Arrays.sort(sir3);
		System.out.println(Arrays.toString(sir3));

	}
}
