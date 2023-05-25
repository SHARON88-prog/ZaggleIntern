
package com.DB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CEPMain {
	public static void main(String[] args) {
		CEPOperations cepo = new CEPOperations();
// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the LockMe.com Application!");
		System.out.println("	");

		int choice = 0;
		do {
			while (true) {

				System.out.println("\nEnter 1 to Retrieve\nEnter 2 to do Operations\nEnter 3 to Exit");

				System.out.println("Pick ur choice:");
				try {
					choice = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input	! ");
					sc.next();
				}
			}

			switch (choice) {
			case 1:
				cepo.Retrieving();
				break;

			case 2:

				int t = 1;
				do {
					System.out.println(
							"\nEnter a to add\nEnter b to delete\nEnter c to search\nEnter d to go back to home");

					char ch = sc.next().charAt(0);
					switch (ch) {
					case 'a':

						cepo.Add();
						break;
					case 'b':

						cepo.delete();
						break;
					case 'c':

						cepo.search();
						break;
					case 'd':

						t = 0;

						break;
					default:
						System.out.println("Invalid Input	!. ");

						break;

					}

				} while (t != 0);
				break;
			case 3:

				System.out.println("	");

				System.out.println("Thanks for using the app.");
				System.exit(0);

			default:

				System.out.println("Invalid Input	!. ");

				break;

			}

		} while (true);

	}

}
