package bank;

import java.util.*;

public class Runclass {
	public static void main(String[] args) {
		
	
	int atmno=12345;
	int pinno=123;
	Scanner in = new Scanner(System.in);
	System.out.println("**Please  Enter Correct  Atm No**");
	 int atmNo =in.nextInt();
	 System.out.println("Enter the Correct PinNo");
	 int pinNo=in.nextInt();
	 if ((atmno==atmNo)&&(pinno==pinNo)) {
		 System.out.println("Validation Has don Successfully");
		 
	 }
	 else {
		 System.out.println("You have Entered Wrong ATM No and PinNo");
		 System.exit(0);
	 }

}
}
