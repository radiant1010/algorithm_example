package step1;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1008
public class problemNo1008 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] inputNumbers = input.split(" ");

		double num1 = Integer.parseInt(inputNumbers[0]);
		double num2 = Integer.parseInt(inputNumbers[1]);

		double sum = num1 / num2;
 
		System.out.printf(String.valueOf(sum));
	}
}
