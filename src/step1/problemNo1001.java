package step1;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1001
public class problemNo1001 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] inputNumbers = input.split(" ");

		int num1 = Integer.parseInt(inputNumbers[0]);
		int num2 = Integer.parseInt(inputNumbers[1]);

		int sum = num1 - num2;

		System.out.printf(String.valueOf(sum));
	}
}
