package assignments;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	
	public static void main(String args[])
	{
		for (int k = 0; k < 5; k++) {
			System.out.println("Enter the number to find factorial or not:");
			Scanner obj = new Scanner(System.in);
			int n = obj.nextInt();
			int fact = 1;
			for (int i = n; i >= 1; i--) {
				fact = fact * i;
			}
			System.out.println(fact);
		}
		
	}

}
