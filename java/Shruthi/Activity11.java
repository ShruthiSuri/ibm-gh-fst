package ibm;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	public static void main(String[] args) {
		Map<Integer, String> colours=new HashMap();
		colours.put(1, "Red");
		colours.put(1, "Blue");
		colours.put(2, "Red");
		colours.put(3, "Green");
		colours.put(4, "White");
		colours.put(5, "Yellow");
		
		for (Integer key : colours.keySet()) {
		    System.out.println(key + " -> " + colours.get(key));
		}
		
		System.out.println(colours.containsValue("Green"));
		System.out.println(colours.containsValue("green"));
		

		System.out.println(colours.size());
	}
}
