package IterationStatements;

public class IterationsLabels {

	public static void main(String[] args) {

		System.out.println("=========== labels");
		
		loop1: for (int i = 0; i < 5; i++) {
				System.out.println("counter i: " + i);
				
			loop2: for (int j = 0; j < 5; j++) {
					System.out.println("counter j: " + j);//j=0
					
					if (j >= 0 && j < 3) {
							System.out.println("break loop1");
							continue loop2;
						} else if(i>=0 && i<2){
							System.out.println("break loop2");
							break loop2;
						}else {
							System.out.println("HI");
							continue loop1;
						}
					}
		}

	}

}
