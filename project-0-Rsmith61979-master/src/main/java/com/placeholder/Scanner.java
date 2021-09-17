package com.placeholder;

import java.io.InputStream;

public class Scanner {
	
	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		System.out.println("value = " + a);
	}

}
