package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WissenProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		ArrayList<String> inputs = new ArrayList<String>();
		for (int i = 0; i < testCases; i++)
			inputs.add(sc.nextLine());
		List<Integer> finalAnswers = new ArrayList<Integer>();
		for (int i = 0; i < inputs.size(); i++) {
			int answer = 0;
			int cntr9 = 0, cntr0 = 0, cntrsqL = 0, cntrsqR = 0, cntrcuL = 0, cntrcuR = 0;
			for (int j = 0; j < inputs.get(i).length(); j++) {
				if (inputs.get(i).charAt(j) == ')')
					cntr0++;
				else if (inputs.get(i).charAt(j) == '(')
					cntr9++;
				else if (inputs.get(i).charAt(j) == '{')
					cntrcuL++;
				else if (inputs.get(i).charAt(j) == '}')
					cntrcuR++;
				else if (inputs.get(i).charAt(j) == '[')
					cntrsqL++;
				else if (inputs.get(i).charAt(j) == ']')
					cntrsqR++;
			}

			answer = Math.min(cntr0, cntr9) + Math.min(cntrsqL, cntrsqR) + Math.min(cntrcuL, cntrcuR);
			finalAnswers.add(answer * 2);
		}

		for (int i = 0; i < finalAnswers.size(); i++) {
			System.out.println(finalAnswers.get(i));
		}

	}

}
