class Example{
	static int a=10;
    int b=20;

	static void m1(){
		System.out.println("a1: "+a);        //o/p=====10
		//System.out.println(b);          //non-static variable b cannot be referenced from a static context
	}
	void m2(){
		System.out.println("a2,b2: "+a+" "+b);
 
	}
}
class Test04{
	public static void main(String[]args){
		Example.m1();

		//Example.m2();   //non-static method m2() cannot be referenced from a static context

		Example e1= new Example();
		Example e2=new Example();


		e1.b=40;
		e2.b=50;

        System.out.println();
		e1.m1();               //it can call  the static variable   o/p=====10
		System.out.println();
		e2.m1();                   //it can call the static variable o/p======10


		System.out.println();


		e1.m2();                 //it can call the non-static variable     o/p====10,40
		System.out.println();
		e2.m2();                  //it can call the non-static variable    o/p====10,50
		System.out.println();

	}
}
 