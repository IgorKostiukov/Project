package com.syntax.project01;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the size of the array");
	int size=sc.nextInt();
	System.out.println("The size of the array is "+size);
	int [] intarray = new int[size];
	int sum=0;
	for (int i=0;i<size;i++) {
		System.out.println("Please array value");
		intarray [i] = sc.nextInt(); 
		sum+=intarray[i];
	}
	System.out.println("The sum of all elements in array is "+ sum);
}
}
