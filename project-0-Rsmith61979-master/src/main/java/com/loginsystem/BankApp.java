package com.loginsystem;

import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BankApp {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("hello");
	
	BankApp() {
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}


	class bankacct {
		
		int balance;
		int previousTransaction;
		String customerName;
		String customerId;
		
		bankacct(String cname,String cid) {
			
			customerName = cname;
			customerId = cid;
		}
		
		
		
		void deposit(int amount) {
			
			if(amount != 0) {
				
				balance = balance + amount;
				previousTransaction = amount;
				
				
			}
		}
		
		void withdraw(int amount) {
			
			if(amount != 0) {
				
				balance = balance - amount;
				previousTransaction = -amount;
				
			}
		}
		
		
		void getPreviousTransaction() {
			
			if(previousTransaction > 0) {
				
				System.out.println("deposited: " + previousTransaction);
			}
			else if(previousTransaction < 0) {
				
				System.out.println("withdraw: " + Math.abs(previousTransaction));
			}
			else {
				
				System.out.println("no transaction occured");
			}
		
		}
		
		void showMenu() {
			char options = '\0';
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("welcome " + customerName);
			System.out.println("Your ID is " + customerId);
			System.out.println("\n");
			System.out.println("A. check balance");
			System.out.println("B. deposit");
			System.out.println("C. withdraw");
			System.out.println("D. previous transaction");
			System.out.println("E. exit");
			
			do {
			
				System.out.println("===========================");
				System.out.println("enter an option");
				System.out.println("===========================");
				options = scanner.next().charAt(0);
				System.out.println("\n");
				
				switch(options) {
				
				case 'A':
					System.out.println("----------------------");
					System.out.println("balance = " + balance);
					System.out.println("----------------------");
					System.out.println("\n");
					break;
					
				case 'B':
				System.out.println("----------------------");
				System.out.println("enter an amount to deposit:");
				System.out.println("----------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
				case 'C':
				System.out.println("----------------------");
				System.out.println("enter amount to withdraw:");
				System.out.println("----------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
				case 'D':
				System.out.println("----------------------");
				getPreviousTransaction();
				System.out.println("----------------------");
				System.out.println("\n");
				break;
				
				case 'E':
					System.out.println("*********************");
					break;
				
				default:
				System.out.println("invalid option! .please enter again");
				break;
				}
				
				
			}
			while(options != 'E');
			
			System.out.println("thank you for using our services");
			
		}
		
	}