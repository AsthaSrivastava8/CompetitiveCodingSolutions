package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EskoFlightQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input);
		List<String> reqCities = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			reqCities.add(st.nextToken());
		}
		System.out.println(reqCities);

		List<String> possibleRoutes = new ArrayList<String>();

		input = sc.nextLine().trim();
		do {
			possibleRoutes.add(input);
			input = sc.nextLine().trim();
		} while (!input.equals(""));

		System.out.println(possibleRoutes);

		int leastPrice = 0;
		String shortestRoute = null;
		for (int i = 0; i < possibleRoutes.size(); i++) {
			if (possibleRoutes.get(i).substring(0, possibleRoutes.get(i).indexOf(" ")).equals(reqCities.get(0))) {
				leastPrice += Integer.parseInt(possibleRoutes.get(i).substring(possibleRoutes.get(i).indexOf(" ") + 1));
			}
		}
	}

}
