package ibm;

class Human{
	private static int count=0;
	
	public void walking(){
		System.out.println("Walking");
	}
	public void talking(){
		System.out.println("Talking");
	}
	
	public Human() {
		setCount(getCount() + 1);
			}
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		Human.count = count;
	}

}
class Boy extends Human{
}

class Girl extends Human{
}

class Robot{
	static 	int  rcount=0;
	public Robot() {
		rcount++;
			}
	public void walking(){
		System.out.println("Walking");
	}
	public void talking(){
		System.out.println("Talking");
	}

}

public class Drive1 {
	public static void main(String[] args) {
		Boy boy1=new Boy();
		Boy boy2=new Boy();
		Boy boy3=new Boy();
		
		
		Girl girl1=new Girl();
		Girl girl2=new Girl();
		Girl girl3=new Girl();
		
		
		Robot robot1 =new Robot();
		Robot robot2 =new Robot();
		Robot robot3 =new Robot();
		
		System.out.print("Human Count : ");
		System.out.println(Human.getCount());
		System.out.print("Robot Count : ");
		System.out.println(Robot.rcount);
	}
}
