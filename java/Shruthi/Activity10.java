package ibm;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add("LAMBOGINI");
		hs.add("THAR");
		hs.add("BENZE");
		hs.add("BMW");
		hs.add("SCORPIO");
		hs.add("THAR");//Duplicate not allowd 
		
		System.out.println("Number of Cars with no duplicates  : "+hs.size());
		System.out.println("Remove :"+hs.remove("LAMBOGINI"));
		System.out.println("Remove Again :"+hs.remove("LAMBOGINI"));
		System.out.println("Not Present "+hs.contains("LAMBOGINI"));
		System.out.println("Present :"+hs.contains("THAR"));
		System.out.println("Cars : "+hs);
		
		
	}
}
