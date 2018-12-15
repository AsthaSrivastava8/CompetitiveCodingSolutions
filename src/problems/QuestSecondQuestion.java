package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuestSecondQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		List<String> answers = new ArrayList<String>();
		for (int i = 0; i < testCases; i++) {
			List<String> inputs = new ArrayList<String>();
			int numberOfTasks = Integer.parseInt(sc.nextLine());
			for (int j = 0; j < numberOfTasks; j++)
				inputs.add(sc.nextLine());
			Collections.sort(inputs);
			List<String> Alice = new ArrayList<String>();
			List<String> Bob = new ArrayList<String>();
			boolean flag = true;
			while (flag) {
				int diff = 0;
				for (String value : inputs) {
					
				}
			}
		}
		for (String value : answers)
			System.out.println(value);
	}

}
