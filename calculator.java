package com.ArithmeticCalculation;

import java.util.Scanner;

public class calculator {
	private static double num1;
	private static double num2;

	public calculator(double num1, double num2) {
		calculator.num1 = num1;
		calculator.num2 = num2;
	}

	public double add() {
		return num1 + num2;
	}

	public double subtract() {
		return num1 - num2;
	}

	public double multiply() {
		return num1 * num2;
	}

	public double divide() {
		return num1 / num2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		calculator calc = new calculator(num1, num2);

		System.out.print("1.Add \n2.Sub \n3.Mul \n4.Div");
		int operator = sc.nextInt();

		double result;

		switch (operator) {
		case 1:
			System.out.print("Enter first number: ");
			num1 = sc.nextDouble();
			System.out.print("Enter second number: ");
			num2 = sc.nextDouble();
			result = calc.add();
			System.out.println(result);
			break;

		case 2:
			System.out.print("Enter first number: ");
			num1 = sc.nextDouble();

			System.out.print("Enter second number: ");
			num2 = sc.nextDouble();
			result = calc.subtract();
			System.out.println(result);
			break;

		case 3:
			System.out.print("Enter first number: ");
			num1 = sc.nextDouble();

			System.out.print("Enter second number: ");
			num2 = sc.nextDouble();
			result = calc.multiply();
			System.out.println(result);
			break;

		case 4:
			System.out.print("Enter first number: ");
			num1 = sc.nextDouble();

			System.out.print("Enter second number: ");
			num2 = sc.nextDouble();
			result = calc.divide();
			System.out.println(result);
			break;

		default:
			System.out.println("Invalid operator");
			return;
		}

	}
}