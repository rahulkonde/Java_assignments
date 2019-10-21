package Collections;

import java.util.Scanner;

public class Degree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter celcius value ");
		double Celcius = sc.nextDouble();
		
		double Fareniheit = 9.0/5.0 * Celcius + 32.0 ;
		System.out.println (Fareniheit);
				
		
	}

}

