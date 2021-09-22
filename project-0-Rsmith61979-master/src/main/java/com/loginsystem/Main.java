package com.loginsystem;

public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandPasswords = new IDandPasswords();
		
		
		loginpage loginPage = new loginpage(idandPasswords.getLoginInfo());

	}

}
