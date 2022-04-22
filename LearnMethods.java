package week1.day2;

public class LearnMethods {
 public static void main(String[] args) {
	
	 LearnMethods obj = new LearnMethods();
	 obj.printCarName();
	 
	 int carRegNumber = obj.getcarRegNumber();
	 System.out.println(carRegNumber);
	 
	 String carVariant = obj.getcarVariant();
	 System.out.println(carVariant);
	 
	 int addTwoNumbers = obj.addTwoNumbers(1, 2);
	 System.out.println(addTwoNumbers);
}
	 public void printCarName() {
	 System.out.println("Swift");
	 }
	 
	 public int getcarRegNumber() {
	 int carRegNumber = 7777;
	 return carRegNumber;
	 }
	
	 public String getcarVariant() {
	 return "Petrol";
	    }
	 public int addTwoNumbers(int a, int b) {
	 return a + b;	 
	 }
}
