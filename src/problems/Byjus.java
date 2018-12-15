package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Byjus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfStalls = Integer.parseInt(sc.nextLine());
		List<Integer> veggiesPerStall = new ArrayList<Integer>();
		String veggieDetails = sc.nextLine();
		StringTokenizer st = new StringTokenizer(veggieDetails);
		while (st.hasMoreTokens()) {
			veggiesPerStall.add(Integer.parseInt(st.nextToken()));
		}
		List<Integer> leastNumberOfVeggies = new ArrayList<Integer>();
		int numberOfQueries = Integer.parseInt(sc.nextLine());

		List<Integer> requiredVeggies = new ArrayList<Integer>();

		for (int i = 0; i < numberOfQueries; i++) {

			requiredVeggies.add(Integer.parseInt(sc.nextLine()));
		}

		for (int i = 0; i < numberOfQueries; i++) {

			int myAns = 0;

			int sum = 0;
			for (Integer value : veggiesPerStall)
				sum += value;

			if (requiredVeggies.get(i) > sum)
				myAns = -1;

			else if (requiredVeggies.get(i) == sum)
				
				myAns = Collections.max(veggiesPerStall);

			else if (requiredVeggies.get(i) == 0)
				myAns = 0;

			else {
				int letsSee = 0;
				myAns = (int) Math.ceil(requiredVeggies.get(i) / numberOfStalls) - 1;

				while (letsSee < requiredVeggies.get(i)) {
					myAns++;
					letsSee = 0;
					for (int j = 0; j < numberOfStalls; j++) {

						if (veggiesPerStall.get(j) >= myAns)
							letsSee += myAns;
						else
							letsSee += veggiesPerStall.get(j);

					}

				}
			}

			leastNumberOfVeggies.add(myAns);
		}
		for (int i = 0; i < leastNumberOfVeggies.size(); i++)
			System.out.println(leastNumberOfVeggies.get(i));
	}

}
