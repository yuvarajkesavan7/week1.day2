package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj1 = new Calculator();
		
		int addThreeNumbers = obj1.addThreeNumbers(2, 2, 2);
		System.out.println(addThreeNumbers);
		
		int subractTwoNumbers = obj1.subractTwoNumbers(2, 1);
		System.out.println(subractTwoNumbers);
		
		float multiply = obj1.multiply(1.5F, 1.5F);
		System.out.println(multiply);
		
	    double divide = obj1.divide(4, 2);
	    System.out.println(divide);

	}

}
