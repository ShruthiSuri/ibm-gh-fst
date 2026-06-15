package ibm;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
		myList.add("Shruthi");
		myList.add("Narayan");
		myList.add("Sandhya");
		myList.add("Srinidhi");
		myList.add("Sarang");
		System.out.println("Names in the list ");
		System.out.println("____________________________________");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("==================");
		System.out.println("Third name in the list "+myList.get(2));
		System.out.println("===========");
		System.out.println("Invalid name "+myList.contains("Shruti"));
		System.out.println("Valid name "+myList.contains("Shruthi"));
		System.out.println("Size : "+myList.size());
		System.out.println("Invalid name "+myList.remove("Sri"));
		System.out.println("Valid name "+myList.remove("Srinidhi"));
		
		
	}
}