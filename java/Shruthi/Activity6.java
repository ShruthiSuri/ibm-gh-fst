package ibm;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Activity6 {


	public static void main(String[] args) throws InterruptedException{
		Plane plane =new Plane(10);
		plane.onboard("Narayan");
		plane.onboard("Shruthi");
		plane.onboard("Swetha");
		plane.onboard("Satish");
		plane.onboard("Saraswathi");
		
		plane.onboard("Subramani");
		plane.onboard("Kanushka");
		plane.onboard("Naren");
		plane.onboard("Dhanvi");
		plane.onboard("Aradhya");
		
		System.out.println("Take off");
		System.out.println(plane.takeOff());
		System.out.println(plane.getPassesngers());
		
//		Thread.sleep(5000);
		

		Thread.sleep(5000);

		System.out.println("Landed");
		plane.land();
		System.out.println(plane.getLastTimeLanded());
	}

}


class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int max) {
    	maxPassengers=max;
    	passengers= new ArrayList<>();// empty array.
    }
//    onboard(): add passengers to the array using the add() method
    public  void onboard(String name) {
    	passengers.add(name);	
    }
    
    
//    takeOff(): returns the current date and time
   public Date takeOff() {
	   Date currentDate = new Date();
	   return currentDate;
   }
    
    
//    land(): sets the value of lastTimeLanded to the current date and time. Also clear() the array.
    public void land() {
//    	Date currentDate = new Date();
    	lastTimeLanded= new Date();
    }
    
    
    
//    getLastTimeLanded(): returns the value of lastTimeLanded.
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
//    getPassesngers(): returns the array of passengers.
    public List<String> getPassesngers() {
    	return passengers;
    }
}