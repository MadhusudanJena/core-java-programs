class Example{
	static int a=10;
	          int x=20;
    static void m1(){
		System.out.println("Value of a: "+a);
		//System.out.println("Value of x: "+x);    //error: non-static variable x cannot be referenced from a static context
            
    }
	 void m2(){
		  System.out.println();      
		System.out.println("Value of a: "+a);
		System.out.println("Value of x: "+x);
	}
}
class Test1{
	public static void main(String[]args){
		//for static method....
		Example.m1();
		//Example.m2();    error: non-static method m2() cannot be referenced from a static context
                
        
		//for non-static method...
		Example e1=new Example();
		//e1.m1();
		e1.m2();
	}
};
