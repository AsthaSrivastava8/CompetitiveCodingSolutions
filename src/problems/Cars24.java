package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cars24 {

	static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
		// Current combination is ready to be printed, print it
		if (index == r) {
			for (int j = 0; j < r; j++)
				System.out.print(data[j] + " ");
			System.out.println("");
			return;
		}

		// replace index with all possible elements. The condition
		// "end-i+1 >= r-index" makes sure that including one element
		// at index will make a combination with remaining elements
		// at remaining positions
		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r);
		}
	}

	static void printCombination(int arr[], int n, int r) {
		// A temporary array to store all combination one by one
		int data[] = new int[r];

		// Print all combination using temprary array 'data[]'
		combinationUtil(arr, data, 0, n - 1, 0, r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> answers = new ArrayList<Integer>();
		int cntr = 0;
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		int[] array = new int[size];
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input);
		int i = 0;
		while (st.hasMoreTokens()) {
			array[i++] = Integer.parseInt(st.nextToken());
		}
		int places = Integer.parseInt(sc.nextLine());

		if (array.length < places)
			cntr = 0;
		else {
			printCombination(array, array.length, places);
		}
		System.out.println(cntr);
	}

}
