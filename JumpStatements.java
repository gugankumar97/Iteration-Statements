package IterationStatements;

public class JumpStatements {

	public static void main(String[] args) {

		System.out.println("=========== continue");

		for (int i = 0; i < 5; i++) {
			
			System.out.println("i%2 = " + i % 2);
			
			if (i % 2 == 0) {
				
				System.out.println("counter: " + i);
				continue;	
			}
			System.out.println("Outside If loop");
		}

		System.out.println("=========== break");
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
		
			System.out.println("counter: " + i);
		}

		System.out.println("=========== break nested loop");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("counter: " + i);
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break;
				}
				System.out.print(" "+j + " ");
			}
			System.out.print("\n");
			
			
		}

	}

}
