package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loco1 {

	private static String l1 = "01010101";
	private static String l2 = "10101010";
	private static List<String> chartSheet = new ArrayList<String>();

	public static boolean whenFirstLineL1(int i, int j) {
		boolean flag = false;
		if (chartSheet.get(i++).substring(j, j + 8).equals(l2) && chartSheet.get(i++).substring(j, j + 8).equals(l1)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l2)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l1)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l2)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l1)
				&& chartSheet.get(i).substring(j, j + 8).equals(l2))
			flag = true;
		return flag;
	}

	public static boolean whenFirstLineL2(int i, int j) {
		boolean flag = false;

		if (chartSheet.get(i++).substring(j, j + 8).equals(l1) && chartSheet.get(i++).substring(j, j + 8).equals(l2)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l1)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l2)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l1)
				&& chartSheet.get(i++).substring(j, j + 8).equals(l2)
				&& chartSheet.get(i).substring(j, j + 8).equals(l1))
			flag = true;
		return flag;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] input = str.split(" ");

		int count = 0;

		int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);
		for (int i = 0; i < n; i++)
			chartSheet.add(sc.nextLine());

		if (m > 7 && n > 7) {
			for (int i = 0; i < n - 7; i++) {
				for (int j = 0; j < m - 7; j++) {
					if (chartSheet.get(i).substring(j, j + 8).equals(l1)) {
						if (whenFirstLineL1(i + 1, j))
							count++;
					} else if (chartSheet.get(i).substring(j, j + 8).equals(l2)) {
						if (whenFirstLineL2(i + 1, j))
							count++;
					}
				}
			}
		}

		System.out.println(count);

	}

}
