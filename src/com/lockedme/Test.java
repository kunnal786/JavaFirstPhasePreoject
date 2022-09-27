package com.lockedme;

import java.security.PublicKey;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {


	public static void main(String[] args) {
		String fileName;
		final String ROOT_DIRECTORY_PATH = "D:/java";
		WelcomeScreen ws = new WelcomeScreen();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to lockedme.com");
		System.out.println("Developer:- Kunnal Sharma");
		int ch;
		int ch1;
		do {
			System.out.println("1.List file in Acsending Order");
			System.out.println("2. Edit");
			System.out.println("3.Exit");
			System.out.println("Enter the choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				ws.DfAscendingorder(ROOT_DIRECTORY_PATH);
				break;
			case 2:
				do {
					System.out.println("1. Add File to the Directory");
					System.out.println("2. Remove file to the Directory");
					System.out.println("3. Searching file to the1 Directory");
					System.out.println("4.Enter the choice");
					ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						fileName = readFileName(sc);
						ws.AddFiles(fileName, ROOT_DIRECTORY_PATH);
						break;
					case 2:
						fileName = readFileName(sc);
						ws.deleteFiles(fileName, ROOT_DIRECTORY_PATH);
						break;
					case 3:
						fileName = readFileName(sc);
						ws.searchFile(fileName, ROOT_DIRECTORY_PATH);
						break;
					}
				} while (ch1 <= 3);
				break;
			case 3:
				
			
			}
		} while (ch < 3);
	}

	private static String readFileName(Scanner sc) {
		System.out.println("Enter the file name to add");
		sc.nextLine();
		
		String fileName = sc.nextLine();
		return fileName;
	}

}
