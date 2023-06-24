class Example{
	static void m1(int i,float f){
		float res=i+f;
		System.out.println("from m1");
		System.out.println("i: "+ i);
		System.out.println("f: "+ f);
		System.out.println("Res: "+ res);
		
	}
}
class Operate{
	public static void main(String[]args){
		Example.m1(10,10.001F);
        System.out.println();
		Example.m1(25,18.67F);
	}
};

