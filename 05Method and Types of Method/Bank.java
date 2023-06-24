class BankAccount{
	String bankName;
	String ifsc;

	long accNum;
	String accHName;
	double balance;
}
class Bank{
	public static void main(String[]args){
		//customer.1:HK
		BankAccount acc1=new BankAccount();

       //diff operation
       //#1.printing
	   System.out.println("acc1 object values: \n");
	   System.out.println("  acc1.bankName: "+acc1.bankName);
	   System.out.println("  acc1.IFSC: "+acc1.ifsc);
	   System.out.println("  acc1.bankName: "+acc1. accNum);
	   System.out.println("  acc1.bankName: "+acc1.accHName);
	   System.out.println("  acc1.bankName: "+acc1.balance);
	   System.out.println( );





	   //#2.storing value of this customer
	   acc1.bankName="HDFC";
	   acc1.ifsc="HDFC0000938";
	   acc1.accNum=12345678910L;
	   acc1.accHName="HK";
	   acc1.balance=10000;
	   System.out.println("acc1 object values");
	   System.out.println("acc1.bankName: "+acc1.bankName);
	   System.out.println("acc1.IFSC: "+acc1.ifsc);
	   System.out.println("acc1.bankName: "+acc1. accNum);
	   System.out.println("acc1.bankName: "+acc1.accHName);
	   System.out.println("acc1.bankName: "+acc1.balance);
	   System.out.println( );


	   //#3.withdraw money

	   acc1.balance=acc1.balance-2000;
	   System.out.println("Main balance after debit: "+acc1.balance);

        //#4.deposit money
	   acc1.balance=acc1.balance+5000;
	   System.out.println("Main balance after deposit: "+acc1.balance);
       //#5.checkbalance
	   System.out.println(acc1.balance);


       System.out.println();
	   System.out.println(acc1.bankName);
	   System.out.println(acc1.ifsc);
	   System.out.println(acc1.accNum);
	   System.out.println(acc1.accHName);
       System.out.println(acc1.balance);

	}
};
