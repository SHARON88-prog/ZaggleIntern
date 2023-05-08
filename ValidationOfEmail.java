
package com.email;

import java.util.Scanner;

public class ValidationOfEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] emailIds = { "sha@example.com", "sha1@gmail.com", "sha2@gmail.com" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email: ");
		String searchEmail = sc.next();
		boolean b = false;
		for (String email : emailIds) {
			if (email.equals(searchEmail))
				b = true;
		}
		if (b) {
			System.out.println(searchEmail + " email is found in list");
		} else {
			System.out.println(searchEmail + " email is not found in list");
		}
	}

}
