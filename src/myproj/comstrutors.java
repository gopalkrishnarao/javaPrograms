
package  myproj;



public  class comstrutors {
	private final  static  int  x1=10;
	public static int x =10;//global
	comstrutors() {
	//	x1=20;
		System.out.println("default construcor");
		
	}
	
	comstrutors(int d,double x) {
		//comstrucotrs(int d,double x);
		System.out.println("cons x=>"+comstrutors.x1);
		System.out.println("integer construcor");
		
	}
	comstrutors(double x,int y) {
		this(10,10.2);
		System.out.println("float construcor");
		
	}
	private void myfunc() {
		System.out.println("hi");
		myfunc() ;
		
	}
	
	public static void main(String[] args) {
		final int x = 0;//local
		System.out.println("start x=>"+x);
		comstrutors a = new comstrutors(10.2,10);
		//a.myfunc();
//		comstrucotrs b = new comstrucotrs(10.2);
		//System.out.println(comstrucotrs.x1);
		System.out.println("end ");
	}
}





