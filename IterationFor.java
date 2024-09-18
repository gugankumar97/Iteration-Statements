package IterationStatements;

public class IterationFor {

	public static void main(String[] args) {

		
		for (int i=1; i<=3;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print (j);
			}
			System.out.println("");
		}
		
	}



// Write program to print the below patterns

//******HW patterns*******

// console input number =5(pyramid)
//*
//**
//***
//****	
//*****
//****
//***
//**
//*

//console number 5(square)
//*****
//*   *
//*   *
//*   *
//*****


//console number 5,3(rectangle)
//*****
//*   *
//*****

//***
//* *
//* *
//* *
//***


//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

	}


