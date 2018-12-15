package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ByjusEqualDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numberOfTeams = Integer.parseInt(sc.nextLine());
		List<Integer> budget = new ArrayList<Integer>();
		List<Integer> numberOfEmployees = new ArrayList<Integer>();
		for (int i = 0; i < numberOfTeams; i++) {
			String input = sc.nextLine();

			budget.add(Integer.parseInt(input.substring(0, input.indexOf(" "))));
			numberOfEmployees.add(Integer.parseInt(input.substring(input.indexOf(" ") + 1)));
		}

		int numberOfRevisions = 0;
		boolean areAllDone = false;

		while (!areAllDone) {
			numberOfRevisions++;
			boolean flag = true;
			int j = 1;
			for (int i = 0; i <= j; i++) {
				if (budget.get(i) % numberOfEmployees.get(i) != 0) {
					int temp = budget.get(i);
					budget.set(i, temp + 1);
					flag = false;
					if (j < numberOfTeams - 2)
						j++;
				}
			}

			if (flag)
				areAllDone = true;
		}
		System.out.println(numberOfRevisions - 1);

	}
}
