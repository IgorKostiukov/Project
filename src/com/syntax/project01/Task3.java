package com.syntax.project01;

public class Task3 {
public static void main(String[] args) {
	int [] [] a= {{1,2,3,},{4,5,6},{7,8,9}};
	int sum=0;
	for (int [] i:a) {
		for (int j:i) {
			sum+=j;
		}
	}
	System.out.println("The sum of all numbers is "+sum);
}
}
