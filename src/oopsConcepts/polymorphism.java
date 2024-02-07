package oopsConcepts;

interface car {
	void parts();

}

class Maruti implements car {
	public void parts() {
		System.out.println("maruti parts");
	}
}
class Huyndai implements car {
	public void parts() {
		System.out.println("Hyndai parts");
	}
}
class Toyato implements car {
	public void parts() {
		System.out.println("toyota parts");
	}
}


  class myclass {
	
	static void disply_my_parts(car c) {
		c.parts();
	}

}
public  class polymorphism {
	public static void main(String[] args) {
		car M = new Maruti();
		myclass.disply_my_parts(M);
		myclass.disply_my_parts( new Huyndai());
		myclass.disply_my_parts( new Toyato());
		
	}
}






