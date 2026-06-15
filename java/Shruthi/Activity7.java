package ibm;
interface  BicycleParts{
	public int tyres=2;
	public int maxSpeed=15;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicycleParts,BicycleOperations{
	int currentSpeed;
	int gears;
	public Bicycle(int gears,int currentSpeed) {
	this.gears=gears;
	this.currentSpeed=currentSpeed;
	
	}
	@Override
	public void applyBrake(int decrement) {
		currentSpeed-=decrement;
		System.out.println("CurrentSpeed after decrement : "+currentSpeed);
	}

	@Override
	public void speedUp(int increment) {
		currentSpeed+=increment;	
		System.out.println("CurrentSpeed after increament : "+currentSpeed);
	}

	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}
}


class MountainBike  extends Bicycle{
	int seatHeight;
	public MountainBike(int gears, int currentSpeed,int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight=0;
		this.seatHeight=seatHeight;
	}
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed + "\nHeight of the Seat is "+seatHeight+"!");
	}
}

public class Activity7 {
	public static void main(String[] args) {
		MountainBike mountainBike=new MountainBike(3,0,25);
		 System.out.println(mountainBike.bicycleDesc());
		    mountainBike.speedUp(20);
		    mountainBike.applyBrake(5);
		    mountainBike.bicycleDesc();
	}
}
