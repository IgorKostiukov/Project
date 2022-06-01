package com.syntax.project01;

public class Task4 {
public static void main(String[] args) {
	int [][] numbers= {
			{12, 2, 26, 100, 3, 5, 13},
			{1,11, 101, 33, 122, 8, 15},
	};
	
	
	
	for (int even=0; even<numbers.length; even++) {
		
		for (int col=0; col<numbers[even].length; col++) {
			
			if (numbers[even][col]%2==0) {
		
		System.out.print(numbers[even][col]+" ");
			}
		
		}
	}
}
}
