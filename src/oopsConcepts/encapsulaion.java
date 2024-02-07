package oopsConcepts;



class pojoclass{
	private int car = 10;
	private String jeep ="myjeep";
	
	
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car = car;
	}
	public String getJeep() {
		return jeep;
	}
	public void setJeep(String jeep) {
		this.jeep = jeep;
	}
	
}

public  class encapsulaion {

	
	public static void main(String[] args) {
		pojoclass p =new pojoclass();
		//System.out.println(p.car);//wrong cant access
		System.out.println(p.getCar());
		p.setJeep("GopalJeep");
		System.out.println(p.getJeep());
	}
	
}





