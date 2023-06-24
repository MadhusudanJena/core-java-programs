 class AO{
	static void add(){
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Addition of two number : "+ c);
	}
	static void sub(int a,int b){
		int c=a-b; 
		System.out.println("Subtraction of two number: "+ c);
	}
	static int mul(int a,int b){
		return a*b;
	}
	static int div(int a,int b){
		return a/b;
	}
 }
 class Calc{
	 public static void main(String[]args){
		 System.out.println("main start\n");
		AO.add();

		AO.sub(100,50);

		System.out.println("Multiplicaton of two number: "+ AO.mul(20,30));
        System.out.println("Division of two number: "+ AO.div(20,5));
        
		System.out.println();
		int mRes=AO.mul(20,4);

		if(mRes<100){
			System.out.println(mRes+50);
		}
		else{
			System.out.println(mRes+100);
		}


        System.out.println("\nmain end");
	 }
 };
  