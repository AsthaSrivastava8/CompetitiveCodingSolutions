package applicationPackage;

import java.util.Scanner;

public class ThoughtWorks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] part = str.split("(?<=\\D)(?=\\d)");
		String temp = null;

		int startIndex = 0, number = 0;

		for (int i = 0; i < part.length; i++) {

			startIndex = part[i].indexOf('(');

			number = Integer.parseInt(part[i].substring(0, startIndex));

			temp = part[i].substring(startIndex + 1, part[i].length() - 1);
			
			for (int j = 0; j < number; j++) {
				System.out.print(temp);
			}

		}

	}

}
