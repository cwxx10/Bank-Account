package account;

public class Account {
	
	private String name;
	private double balance;
	private double balanceFinal;
	private double numberAccount;
	private double initialDeposit;
	
	
	
	public Account(String name, double numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}

	public Account(String name, double initialDeposit, double numberAccount) {
		this.name = name;
		this.initialDeposit = initialDeposit;
		this.numberAccount = numberAccount;
	}
	
	
	
	public double getbalanceFinal(double balanceProgram, double depositProgram) {
		return balanceProgram + depositProgram;
	}
	
	public double getbalanceFinal2(double balanceProgram, double withdrawProgram) {
		return withdrawProgram -balanceProgram;
	}
	

	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getNumberAccount() {
		return numberAccount;
	}
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	
	
	
	public String toString1() {
		return  "---\n"
				+"Your Data: \n"
				+name
				+". Your Number Account: "
				+numberAccount
				+".\nYour Balance: "
				+initialDeposit
				+"$."
				
				;
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

