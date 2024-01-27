package corejava_assignments;

import java.util.Scanner;

public class O40_coreJava_user {
	public static void main(String[] args) {
		System.out.println("program Start");

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter the num1");
			int num1 = sc.nextInt();

			System.out.println("Enter the num2");
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.println("The result is : " + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}
}
