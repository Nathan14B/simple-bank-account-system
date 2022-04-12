package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class AccountTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Account firstAccount = new Account("Jane Green", 50);
		Account secondAccount = new Account("John Blue");
		
		displayAccount(firstAccount);
		displayAccount(secondAccount);
		
		System.out.println();
		
		System.out.print("Enter deposit amount for firstAccount: ");
		double depositAmount = input.nextDouble();
		
		System.out.println();
		
		System.out.printf("Adding %.2f to firstAccount balance.%n", depositAmount);
		firstAccount.deposit(depositAmount);
		
		System.out.println();
		
		displayAccount(firstAccount);
		displayAccount(secondAccount);
		
		System.out.println();
		System.out.println();
		
		System.out.print("Enter deposit amount for secondAccount: ");
		depositAmount = input.nextDouble();
		
		System.out.println();
		
		System.out.printf("Adding %.2f to secondAccount balance.%n", depositAmount);
		secondAccount.deposit(depositAmount);
		
		System.out.println();
		
		displayAccount(firstAccount);
		displayAccount(secondAccount);
	}

	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}
