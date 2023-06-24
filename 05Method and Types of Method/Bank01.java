class BankAccount{
	
	static String bankName;
	static String branchName;
	static String ifsc;

	long accNum;
	String accHName;
	double balance;

	static void bankName(){
		System.out.println(bankName);
	}
	static void branchName(){
		System.out.println(branchName);
	}
	static void ifsc(){
		System.out.println(ifsc);
	}
	void deposit(double amt){
		balance=balance+amt;
	}
	void withdraw(double amt){
		balance=balance-amt;
	}
	void currentBalance(){
		System.out.println(balance);
	}
	void display(){
		System.out.println(bankName);
		System.out.println(branchName);
		System.out.println(ifsc);
		System.out.println(accNum);
		System.out.println(accHName);
		System.out.println(balance);
	}
}
class Bank01{
	public static void main(String[]args){
		
		//initializing static value
		BankAccount.bankName="SBI";
		BankAccount.branchName="Nayagarh";
        BankAccount.ifsc="SBIN00143";

		BankAccount acc1 =new BankAccount();
		BankAccount acc2=new BankAccount();

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println("\nacc2 object values");
		acc2.display();

        //initializing non-static  acc1 value

		acc1.accNum=9876543209551L;
		acc1.accHName="Biswajeet";
		acc1.balance=200000;

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println("\nacc2 object values");
		acc2.display();


		//initializing non-static  acc2 value

		acc2.accNum=8847818650955L;
		acc2.accHName="Debashis";
		acc2.balance=350000;

		System.out.println("\nacc1 object values\n==================");
		acc1.display();
		acc1.balance=acc1.balance+100000;
		System.out.println("Main balance after credited 100000: "+acc1.balance);
		acc1.balance=acc1.balance-200000;
		System.out.println("Main balance after withdraw 200000: "+acc1.balance);
		System.out.println("Current Account Balance: "+ acc1.balance);
 
		System.out.println("\nacc2 object values\n--------------------");
		acc2.display();

		acc2.balance=acc2.balance+100000;
		System.out.println("Main balance after credited 100000: "+acc2.balance);
		acc2.balance=acc2.balance-200000;
		System.out.println("Main balance after withdraw 200000: "+acc2.balance);
		System.out.println("Current Account Balance: "+ acc2.balance);
 
	}
};

	 