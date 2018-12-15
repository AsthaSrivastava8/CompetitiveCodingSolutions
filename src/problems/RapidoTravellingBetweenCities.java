// gives wrong answer

package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RapidoTravellingBetweenCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		List<Integer> answers = new ArrayList<Integer>();
		for (int t = 0; t < testCases; t++) {

			int[] nkq = new int[3];
			String input = sc.nextLine();
			nkq[0] = Integer.parseInt(input.substring(0, input.indexOf(" ")));
			nkq[1] = Integer.parseInt(input.substring(input.indexOf(" ") + 1, input.lastIndexOf(" ")));
			nkq[2] = Integer.parseInt(input.substring(input.lastIndexOf(" ") + 1));

			int[] cities = new int[nkq[0]];
			input = sc.nextLine();
			StringTokenizer st = new StringTokenizer(input);
			int i = 0;
			while (st.hasMoreTokens()) {
				cities[i++] = Integer.parseInt(st.nextToken());
			}

			int[] lrx = new int[3];
			for (i = 0; i < nkq[2]; i++) {
				input = sc.nextLine();
				lrx[0] = Integer.parseInt(input.substring(0, input.indexOf(" ")));
				lrx[1] = Integer.parseInt(input.substring(input.indexOf(" ") + 1, input.lastIndexOf(" ")));
				lrx[2] = Integer.parseInt(input.substring(input.lastIndexOf(" ") + 1));

				if (Math.abs(lrx[0] - lrx[2]) > nkq[1] || Math.abs(lrx[1] - lrx[2]) > nkq[1]) {
					answers.add(Math.abs(lrx[0] - lrx[1]));

				}
			}

		}
		for (Integer value : answers) {
			System.out.println(value);
		}
	}

}
