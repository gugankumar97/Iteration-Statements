package IterationStatements;

public class WhileDoWhile {

	public static void main(String[] args) {

		int counter =1;
		
		// *********While Loop***********
		
		while(counter <5) {
			System.out.println("Counter :" + counter);
			counter++;
		}
		System.out.println("End of while loop");
		//**********Do While Loop**********
		
		int counter1 = 2;
		do {
			System.out.println("Counter 1 :"+ counter1);
			counter1--;
		}while(counter1>3);
		System.out.println("true");

	}

}
