package application;

import model.entities.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("John Green", 150.00);
		System.out.println("Account #1:");
		System.out.println("Name: " + account1.getName());
		System.out.println("Initial balance: " + account1.getBalance());
		account1.deposit(200.00);
		System.out.println("Balance after deposit: " + account1.getBalance());
		account1.withdraw(225.00);
		System.out.println("Balance after withdraw: " + account1.getBalance());
		
		System.out.println();
		
		Account account2 = new Account("Mary Blue");
		System.out.println("Account #2:");
		System.out.println("Name: " + account2.getName());
		System.out.println("Initial balance: " + account2.getBalance());
		account2.deposit(3000.00);
		System.out.println("Balance after deposit: " + account2.getBalance());
		account2.withdraw(2999.00);
		System.out.println("Balance after withdraw: " + account2.getBalance());
	}

}
