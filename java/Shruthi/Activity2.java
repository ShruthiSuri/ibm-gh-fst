package ibm;

import java.util.Scanner;

public class Activity2 {

	public static boolean IsSum30(int [] newarray) {
		int sum=0;
		for (int val : newarray) {
			sum+=val;
		}
		System.out.println("Sum : "+sum);
		if (sum==30)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n=scanner.nextInt();
		
		int arr[]=new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		boolean result=IsSum30(arr);
		System.out.println(result);
		
		scanner.close();
	}

}
