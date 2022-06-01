package com.syntax.project01;

public class Task8 {
public static void main(String[] args) {
		
		
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		//The Fibonacci series is a series where the next term is the sum of the previous two terms.
    //The first two terms of the Fibonacci sequence are 0 followed by 1.
		//Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	
	//for loop
	int n=10; //10 numbers of Fibonacci series;
	int firstNum=0; //first number of Fibonacci series;
	int secondNum=1;//second number of Fibonacci series;
	System.out.print("the first " + n + " numbers of Fibonacci series:");
	for (int i=1;i<=n;i++) {
		System.out.print(firstNum+",");
		int nextNum=firstNum+secondNum; //each next number in series is a sum of 2 previous numbers
		firstNum=secondNum;
		secondNum=nextNum;
	}
	System.out.println("   ");
	
	//while loop
	
	int i=1,fn=10,num1=0,num2=1;
	System.out.print("the first " + fn + " numbers of Fibonacci series:");
	while (i<=fn) {System.out.print(num1+",");
	int nextNumber=num1+num2;
	num1=num2;
	num2=nextNumber;
	
	i++;
	}
	
	System.out.println("   ");
	
	int [] Fnumbers=new int[10]; //creating array
	
	Fnumbers[0]=0;//first number of Fibonacci series;
	Fnumbers[1]=1;//second number of Fibonacci series;
	for(int i1=2; i1 < Fnumbers.length; i1++)
  {
    Fnumbers[i1] = Fnumbers[i1-1] + Fnumbers[i1-2]; }
    for (int i1=0;i1<Fnumbers.length;i1++) { {System.out.print(Fnumbers[i1]+" ");
  }
	
	
	
	
	
    }}
}
