
package com.DB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CEPOperations {

	Scanner sc = new Scanner(System.in);

	public void Retrieving() {
		File folder = new File("/Users/sharonrose/Desktop/CEPFolder");
		if (!folder.exists()) {
			folder.mkdirs();
		}

		File[] files = folder.listFiles();
		if (files.length == 0) {
			System.out.println("No Files Found.	");

		}

		else {

			List<String> fileList = new ArrayList<>();

// Loop through each file in the folder and add its name to the list 
			for (File file : files) {
				if (file.isFile()) {
					fileList.add(file.getName());
				}
			}

			int n = fileList.size();
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (fileList.get(i).compareTo(fileList.get(j)) > 0) {

						String temp = fileList.get(i);
						fileList.set(i, fileList.get(j));
						fileList.set(j, temp);
					}
				}
			}

// Print the list of file names
			for (String fileName : fileList) {
				System.out.println(fileName);
			}
		}

	}

	public void Add() {

		File folder = new File("/Users/sharonrose/Desktop/CEPFolder");
		if (!folder.exists()) {
			folder.mkdirs();
		}

		File[] files = folder.listFiles();
		boolean checker;
		String nameoffile = "";
		do {
			System.out.println("Enter the name of the file to add: ");
			nameoffile = sc.next();

			checker = false;

			for (File file : files) {
				if (nameoffile.equalsIgnoreCase(file.getName())) {
					System.out.println("File name already exists	");
					checker = true;
					break;

				}
			}

		} while (checker);

		System.out.println("Enter the content of the file: ");
		sc.nextLine();
		String contentoffile = sc.nextLine();

		File file = new File(folder, nameoffile);
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(contentoffile);
			writer.close();
			System.out.println("File created as " + file.getName());
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void delete() {

		File folder = new File("/Users/sharonrose/Desktop/CEPFolder");
		if (!folder.exists()) {
			folder.mkdirs();
		}

		File[] files = folder.listFiles();
		boolean checker;
		String nameoffile = "";
		do {
			System.out.println("Enter the name of the file to delete: ");
			nameoffile = sc.next();

			checker = true;

			for (File file : files) {
				if (nameoffile.equalsIgnoreCase(file.getName())) {
					file.delete();
					System.out.println("File deleted...");
					checker = false;
					break;
				}
			}

			if (checker == true) {

				System.out.println("File name doesn't exists...");

			}

		} while (checker);

	}

	public void search() {

		File folder = new File("/Users/sharonrose/Desktop/CEPFolder");
		if (!folder.exists()) {
			folder.mkdirs();
		}

		File[] files = folder.listFiles();
		boolean checker;
		String nameoffile = "";
		do {
			System.out.println("Enter the name of the file to search: ");
			nameoffile = sc.next();

			checker = true;

			for (File file : files) {
				if (nameoffile.equalsIgnoreCase(file.getName())) {
					System.out.println("File content:");
					try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
						String line;
						while ((line = reader.readLine()) != null) {
							System.out.println(line);
						}
					} catch (IOException e) {
						System.err.println("Error reading file: " + e.getMessage());
					}
					checker = false;
					break;
				}
			}

			if (checker == true) {

				System.out.println("File name doesn't exists...");

			}

		} while (checker);

	}

}
