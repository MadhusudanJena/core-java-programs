class Example{
	 static void m1(String msg){
		System.out.println(msg);
	}
}
class Test{
	public static void main(String[]args){ 
        System.out.println("Test main start:\n_________________");
		//for static method...
		Example.m1("Hi"); 
		Example.m1("Hello");
		 System.out.println("____________________\nTest main end:");


	 //for non-static method...
	// Example e1=new Example();
	 //e1.m1("Biswajeet");
	}
};
