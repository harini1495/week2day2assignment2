package week2.day2;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int num = 123,sum =0;
		
		while(num>0) {
			 
		int mod = num%10;
		sum = sum +mod;
		num = num/10;
				
			}
			 System.out.println("Sum of Digits " + sum);
		}
	}

