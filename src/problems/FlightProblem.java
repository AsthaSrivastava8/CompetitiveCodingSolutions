package problems;

import java.util.LinkedList;
import java.util.Scanner;

public class FlightProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		LinkedList<Integer>[] connections = new LinkedList[Integer.parseInt(input[1])];
		int i = 0;
		String[] connection = new String[2];
		while (i < Integer.parseInt(input[1])) {
			connection = sc.nextLine().split(" ");
			if (connections[i] == null) {
				connections[i] = new LinkedList<Integer>();
			}
			connections[i].add(Integer.parseInt(connection[0]));
			connections[i].add(Integer.parseInt(connection[1]));
			i++;
		}

		for (LinkedList<Integer> value : connections)
			System.out.println(value);

		for (i = Integer.parseInt(connection[1]) - 1; i >= 0; i--) {
			for (int j = 1; j > 0; j--) {
				
			}
		}
	}
}
