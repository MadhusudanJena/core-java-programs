class  Bus{
	void Breaks(){
		 System.out.println("Bus has normal breaks.");
	}
}
class vehicle extends Bus{
	void breaks(){
		System.out .println("volvo has powerfull breaks.");
	}
	public static void main(String[]args){
		vehicle b=new vehicle();
		b.Breaks();
		b.breaks() ; 
 
	}
}