package problems;

import java.util.Scanner;

public class GE {

	public static boolean isPalindrome(String array) {
		String reverse ="";
		boolean flag = false;
		for (int i = array.length() - 2; i >= 0; i--)
			reverse = reverse + array.charAt(i);
		if (reverse.equals(array))
			flag = true;
		return flag;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String array;
		boolean flag = false;
		String[] answers = new String[n];
		for (int i = 0; i < n; i++) {
			array = sc.nextLine();
			flag = false;
			for (int j = 0; j < array.length(); j++) {
				if (isPalindrome(array.substring(j) + array.substring(0, j))) {
					flag = true;
					break;
				}
			}
			if (flag)
				answers[i] = "YES";
			else
				answers[i] = "NO";
		}
		for (String value : answers)
			System.out.println(value);
	}
}
