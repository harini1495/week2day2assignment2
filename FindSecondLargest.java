package week2.day2;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] large = {3,2,11,4,6,7};
		
		Arrays.sort(large);
		
		for(int i=0;i<large.length;i++) {
			
			System.out.println(large[i]);
		}
		
		System.out.println("Second Largest array number is " + large[large.length-2]);
	}

}
