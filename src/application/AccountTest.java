package application;

import model.entities.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account myAccount = new Account("Nathan Bueno");
		System.out.println(myAccount.getName());
		
		myAccount.setName("John Green");
		System.out.println(myAccount.getName());
	}

}
