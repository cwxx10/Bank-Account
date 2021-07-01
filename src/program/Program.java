package program;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
 

import account.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		Account account = new Account(null, 0);

		Date date = new Date();
		

		System.out.println(date);
		int numberAccount = random.nextInt(9999) + 1000;
		account.setNumberAccount(numberAccount);
		System.out.println(".");
		int op1 = 0;
		int verifOperationCase2 = 0;
		int verifPassword =0;
		
		do {
		System.out.println("Welcome to your Bank! Select your option!");
		
		System.out.println("[1] ----- OPEN ACCOUNT");
		System.out.println("[2] ----- ENTER ACCOUNT");
		System.out.println(">");
		int op = sc.nextInt();
		op1 = op;
		
		} while (op1 != 1 && op1 != 2);
			
		
		
		
		switch (op1) {
		
		
		case 1:
			System.out.println("Opening Account. Please follow the next Steps: ");
				try{
				      Thread.sleep(2000);
				}catch(Exception e){
				      System.out.println("");
				}
			System.out.println("Your Full Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hello "+name+"!");
			System.out.println("We are generating your account, please wait some seconds...");
				
				try{
				      Thread.sleep(4000);
				}catch(Exception e){
				      System.out.println("");
				}
			System.out.printf("Your new number account: ");
				try{
				      Thread.sleep(1500);
				}catch(Exception e){
				      System.out.println("");
				}		
				
			System.out.printf("%.0f\n", account.getNumberAccount());
			
			System.out.println("Is there na initial deposit (y/n)? ");
			System.out.println("R: ");
			char response = sc.next().charAt(0);
			
			if (response == 'y'|| response == 'Y') {
				System.out.println("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				account = new Account( name, initialDeposit, numberAccount);
				System.out.println("Opening account...");
					try{
					      Thread.sleep(1500);
					}catch(Exception e){
					      System.out.println("");
					}
				System.out.println("Welcome to your new account!");
					try{
					      Thread.sleep(700);
					}catch(Exception e){
					      System.out.println("");
					}
				System.out.println(account.toString1());
				
				
				
				
			
			} else {
				account = new Account(name, numberAccount);
				System.out.println("Welcome to your new account!");
					try{
					      Thread.sleep(700);
					}catch(Exception e){
					      System.out.println("");
					}
			System.out.println(account.toString1());
			}
			
			
			
			break;
			
			
			
		case 2:
			System.out.println("Login: ");
			sc.nextLine();
			String login = sc.nextLine();
			System.out.println("Hello "+login+". \nNow type your password: ");
			do {
				System.out.println("Your Password: [3 DIGITS]");
				int password = sc.nextInt();
				verifPassword = password;
			} while (verifPassword < 100 || verifPassword > 999);
			System.out.println("Logging, please wait some seconds...");
				try{
				      Thread.sleep(4000);
				}catch(Exception e){
				      System.out.println("");
				}
			System.out.println("Successfully Login!");
			System.out.println("---");
				try{
				      Thread.sleep(1000);
				}catch(Exception e){
				      System.out.println("");
				}
			System.out.printf("Welcome user:  "+login);
			System.out.println();
			
			double balanceProgram = random.nextInt(9999) + 0;
			System.out.printf("Account Number: %.0f\n",account.getNumberAccount());
			System.out.printf("Your Balance: %.2f\n",balanceProgram);
			System.out.println("---");
			System.out.println(date);
			System.out.println("---");
			
			
			do {
				System.out.println("Select your operation: ");
				System.out.println("[1] ----- DEPOSIT");
				System.out.println("[2] ----- WITHDRAW");
				System.out.println("[0] ----- EXIT");
				System.out.println("Select: ");
				verifOperationCase2 = sc.nextInt();
			} while (verifOperationCase2 != 1 && verifOperationCase2 != 2 && verifOperationCase2 != 0);
			
			if (verifOperationCase2 == 1) {
				System.out.println("Value from deposit $: ");
				double depositProgram = sc.nextDouble();
				account.getbalanceFinal(depositProgram, balanceProgram);
				System.out.println("Depositing... Please wait some seconds.");
					try{
					      Thread.sleep(3500);
					}catch(Exception e){
					      System.out.println("");
					}
				System.out.println("Successfully Deposited!");
					try{
					      Thread.sleep(1500);
					}catch(Exception e){
					      System.out.println("");
					}
				System.out.printf("Your new balance: ");
				System.out.println(account.getbalanceFinal(depositProgram, balanceProgram));
				
			} else if (verifOperationCase2 == 2) {
				System.out.println("Value from withdraw $: ");
				double withdrawProgram = sc.nextDouble();
				account.getbalanceFinal2(balanceProgram, withdrawProgram);
				System.out.println("Processing... Please wait some seconds.");
					try{
					      Thread.sleep(3500);
					}catch(Exception e){
					      System.out.println("");
					}
					System.out.println("Successfully Withdraw! Please take your money.");
						try{
						      Thread.sleep(5500);
						}catch(Exception e){
						      System.out.println("");
						}
						System.out.printf("Your new balance: ");
						System.out.println(account.getbalanceFinal2(withdrawProgram, balanceProgram));					
			
			} else if (verifOperationCase2 == 0){
				System.out.println("Exiting...");
					try{
					      Thread.sleep(1500);
					}catch(Exception e){
					      System.out.println("");
					}
			}
			break;
		}
		
		
		
		
		
		
		
		sc.close();

	}
	


}
