package week2.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		int resultadd = obj.add(5,10,15);
		int resultsub = obj.sub(10,5);
		double resultmul = obj.mul(5d,10d);
		float resultdiv = obj.div(20f,10f);
		System.out.println("The answer of addition = " +resultadd+"\n"+"The answer of subtraction = " +resultsub+"\n"+
				"The answer of multiplication = " +resultmul+"\n"+"The answer of division = " +resultdiv); 	
		
	}
}
