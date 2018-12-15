package problems;

import java.util.*;

public class GE2 {

	public static boolean isPalindrome(String array) {
		String reverse = Character.toString(array.charAt(array.length() - 1));
		boolean flag = false;
		for (int i = array.length() - 2; i >= 0; i--)
			reverse = reverse + array.charAt(i);
		if (reverse.equals(array))
			flag = true;
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		String input = sc.nextLine();
		n = Integer.parseInt(Character.toString(input.charAt(0)));
		k = Integer.parseInt(Character.toString(input.charAt(2)));
		input = sc.nextLine();
		int sum = 0;
		List<String> temp = new ArrayList<String>();

		for (int j = 0; j < n - 1; j++) {
			for (int i = j + 1; i < n; i++) {
				temp.add(input.substring(j, i));
			}
		}

		System.out.println(temp);

		for (String value : temp) {
			if (isPalindrome(value)) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
