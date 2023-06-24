 interface shape{
	abstract void findArea();
 }
 class Rectangle implements shape {
	 public void findArea(){
          double l=3.5;
		  double b=4.5;

		System.out.println(l*b);
	 }
	  double l,b;
	 
 }
 class shapeArea extends Rectangle{
	 public static void main(String[]args){

		 Rectangle r = new Rectangle();

		 r.findArea();
		 r.l=4.5;
		 r.b=5.5;
		  double res=r.l*r.b;
		  System.out.println(res);
	 }
 };