/**
 * 
 */

/*
 * Rotate and Speak Game
N children are playing a game of Rotate and Speak. In this game all the children are given a number plate which contains distinct values and they need to form a circle in clockwise order.

There are Q  turns in this game. In each turn two numbers a  and b are announced. The rules of the game are as follows :

If the number a is equal to 1 then it means that all the children shift b steps in anti clockwise direction.
If the number a is equal to 2 then it means that all the children shift b steps in clockwise direction.
If the number a is equal to 3 then it means that the child who is standing at b position  in the clockwise order speaks the number on his number plate. Note that the positions are from 0 to n-1  not 1 to n
Input format:
First line contains an integer t  that denotes the number of test cases
First line in every test case contains an integer n denoting the count of children playing the game.
Second line in every test case contains n space separated integers , here the ith integer is the number on the number plate of the student i 
Third line in every test case contains an integer Q ,number of turns in the game.
Following  lines ,each contain two integers describing one of the 3 types of moves in a turn.

Output format:
For each moves of type 3, you have to print the number that will be spoken in that turn of the game.
 *  */
package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Princess
 *
 */

import java.util.Scanner;

public class ArrayRotation {

	/**
	 * @param args
	 */

	public static List<String> answers = new ArrayList<String>();

	public static List<String> number1Announced(List<String> playerPosition, int times) {
		System.out.println("Before: " + playerPosition);

		String temp, previous;
		for (int i = 0; i < times; i++) {
			previous = playerPosition.get(playerPosition.size() - 1);
			for (int j = 0; j < playerPosition.size(); j++) {
				temp = playerPosition.get(j);
				playerPosition.set(j, previous);
				previous = temp;
			}
		}
		
		System.out.println("After counter clockwise: " + playerPosition);
		return playerPosition;
	}

	public static List<String> number2Announced(List<String> playerPosition) {
		System.out.println("Before: " + playerPosition);
		String temp = playerPosition.get(0);
		for (int i = playerPosition.size() - 2; i > 0; i--) {
			playerPosition.set(i - 1, playerPosition.get(i));
		}
		playerPosition.set(playerPosition.size() - 1, temp);
		System.out.println("After clockwise: " + playerPosition);
		return playerPosition;
	}

	public static void number3Announced(List<String> playerPosition, String index) {
		answers.add(playerPosition.get(Integer.parseInt(index)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// storing numbers in an array
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for (int cntr = 0; cntr < testCases; cntr++) {
			int noOfPlayres = Integer.parseInt(sc.nextLine());
			String playerPositionInput = sc.nextLine();
			System.out.println(playerPositionInput);
			int noOfChances = Integer.parseInt(sc.nextLine());

			List<String> playerPosition = new ArrayList<String>();

			for (int i = 0; i < playerPositionInput.length(); i++)
				if (playerPositionInput.charAt(i) != ' ')
					playerPosition.add(Character.toString(playerPositionInput.charAt(i)));

			int i = 0;
			String numbersAnnounced = null;
			while (i < noOfChances) {
				numbersAnnounced = sc.nextLine().trim();
				for (int j = 0; j < numbersAnnounced.length(); j += 2) {
					if (numbersAnnounced.charAt(j) == '1') {
						playerPosition = number1Announced(playerPosition, 1);
					} else if (numbersAnnounced.charAt(j) == '2') {
						playerPosition = number2Announced(playerPosition);
					} else if (numbersAnnounced.charAt(j) == '3') {
						number3Announced(playerPosition, Character.toString(numbersAnnounced.charAt(2)));
						break;
					}
				}
				i++;
			}
			System.out.println(answers);
		}
	}
}
