package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WissenProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();

		int q = Integer.parseInt(input.substring(input.indexOf(" ") + 1));

		input = s.nextLine();

		List<Integer> array = new ArrayList<Integer>();

		StringTokenizer st = new StringTokenizer(input);
		while (st.hasMoreTokens()) {
			array.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(array);
		List<Integer> value = new ArrayList<Integer>();

		// taking answers-1 values
		for (int i = 0; i < q; i++) {
			value.add(Integer.parseInt(s.nextLine()));
		}

		for (int i = 0; i < value.size(); i++) {
			int temp = value.get(i) +1;
		
			temp++;
			boolean flag = true;
			while (flag) {
				flag = false;
				if (array.contains(temp)) {
					temp++;
					flag = true;
				}
			}

			System.out.println(temp);

		}

	}
}
