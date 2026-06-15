package ibm;

class Car1 {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public  Car1() {
		tyres=4;
		doors=4;
	}
	
	
//	 This displays the values of all the variables
	public void displayCharacteristics(String color,String transmission,int make) {
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		System.out.println("Feature of car");
		System.out.println("color : "+color);
		System.out.println("transmission : "+transmission);
		System.out.println("make : "+make);
		System.out.println("tyres : "+tyres);
		System.out.println("doors : "+doors);
	}
	
//	- This prints "Car is moving forward."
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
//	 This prints "Car has stopped."
	public void brake(){
		System.out.println("Car has stopped.");
	}

}

public class Activity1{
	public static void main(String[] args) {
		Car1 car1= new Car1();
		car1.accelarate();
		car1.displayCharacteristics("Red", "Autonomous", 2016);
		car1.brake();
	}
}