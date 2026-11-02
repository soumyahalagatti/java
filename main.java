package homework;
class Bank {
String AccNo;
String HolderName;
double Balance;
Bank (String accNo,String Name ,double Bal){
	AccNo=accNo;
	HolderName=Name;
	Balance=Bal;
}
void deposit(double amount) {
	Balance=Balance+amount;
}
void withdraw(double amount) {
	Balance=Balance-amount;
}
void displayBalance() {
	System.out.println(HolderName+":"+Balance);
}
}
 public class main {
	 public static void main (String[] args) {
		Bank acc1=new Bank("101","Rahul",5000);
		Bank acc2=new Bank("102","priya",8500);
		Bank acc3=new Bank("103","amit",12000);
		 acc1.deposit(2000);
		 acc2.withdraw(1000);
		 acc3.deposit(3000);
		 acc1.displayBalance();
		 acc2.displayBalance();
		 acc3.displayBalance();
	 }
 }
