package problems;

import java.util.Scanner;

public class Loco2 {

	static int numberOfGroups, myGroups, beauty, size;
	static String[] input = new String[2];
	static int arrayInt[] = new int[500];

	public static int compareFromSmaller(boolean flag, int i) {
		System.out.println("Inside compare: ");
		int j;
		for (j = i; j < size - 1; j++) {
			System.out.println("Value of j :" + j);
			System.out.println("Flag: " + flag);
			if (flag == false) {
				System.out.println("Comapring smaller");
				if (arrayInt[j] < arrayInt[j + 1]) {
					beauty++;
					flag = !flag;
				} else {
					break;
				}
			} else if (flag == true) {
				System.out.println("Comapring greater");
				if (arrayInt[j] > arrayInt[j + 1]) {
					beauty++;
					flag = !flag;
				} else {
					break;
				}
			}
		}
		System.out.println("Returning j: " + j);
		myGroups++;
		return j;

	}

	public static int compareFromGreater(boolean flag, int i) {
		System.out.println("Inside Greater");
		System.out.println("Inside compare: ");
		int j;
		for (j = i; j < size - 1; j++) {
			System.out.println("Value of j :" + j);
			System.out.println("Flag: " + flag);
			if (flag == false) {
				System.out.println("Comapring smaller");
				if (arrayInt[j] < arrayInt[j + 1]) {
					beauty++;
					flag = !flag;
				} else {

					break;
				}
			} else if (flag == true) {
				System.out.println("Comapring greater");
				if (arrayInt[j] > arrayInt[j + 1]) {
					beauty++;
					flag = !flag;
				} else {

					break;
				}
			}
		}
		System.out.println("Returning j: " + j);
		myGroups++;
		return j;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		input = sc.nextLine().split(" ");

		size = Integer.parseInt(input[0]);
		numberOfGroups = Integer.parseInt(input[1]);

		String[] array = new String[size];
		array = sc.nextLine().split(" ");

		int i = 0;
		for (String val : array) {
			arrayInt[i++] = Integer.parseInt(val);
		}

		i = 0;

		if (numberOfGroups < size) {

			if (arrayInt[0] > arrayInt[1]) {
				boolean flag = false;
				beauty++;
				System.out.println("i: " + i + " size: " + size);
				while (i < size - 1) {
					i = compareFromSmaller(flag, i + 1);
					// if (numberOfGroups - myGroups != 0)
					// break;
				}

			} else if (arrayInt[0] < arrayInt[1]) {
				boolean flag = true;
				beauty++;

				while (i < size - 1) {
					i = compareFromGreater(flag, i + 1);
					// if (numberOfGroups - myGroups != 0)
					// break;
				}

			}
		}

		System.out.println("myGroups: " + myGroups);
		System.out.println(beauty);
	}

}
