package Homework;

class BankAccount{
	private String accountNumber;
	private String holderName;
	protected double balance;
	BankAccount(String accNo,String name,double bal){
		accountNumber=accNo;
		holderName=name;
		balance=bal;
	}
	String getholderName() {
		return holderName;
	}
	double getBalance() {
		return balance;
	}
	void deposit(double amount) {
		balance=balance+amount;
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
		}else {
			System.out.println("Insufficient balance for"+holderName);
		}
	}
	void displayBalance() {
		System.out.println(holderName+"("+accountNumber+"):"+balance);
	}
}
class SavingsAccount extends BankAccount{
	SavingsAccount (String accNo,String name,double bal){
		super(accNo,name,bal);
	}
	void addInterest() {
		balance=balance+(balance*0.04);
	}
	void withdraw(double amount) {
		if(balance-amount>=1000) {
			balance=balance-amount;
		}else {
			System.out.println("saving account must keep minimum rs.1000");
		}
	}
}
public class Main1{
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount("101","Rahul",5000);
		BankAccount acc2=new BankAccount("102","Priya",8500);
		acc1.withdraw(4500);
		acc2.withdraw(8000);
		acc1.displayBalance();
		acc2.displayBalance();
		SavingsAccount sav= new SavingsAccount("103","Amit",12000);
		sav.addInterest();
		sav.displayBalance();
	}
}
