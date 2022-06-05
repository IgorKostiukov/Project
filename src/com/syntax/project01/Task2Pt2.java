package com.syntax.project01;

import java.util.Scanner;

public class Task2Pt2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of list of countries");
	int size=sc.nextInt();
	String a=sc.nextLine();

	String [] count=new String[size];
	String [] coun2=new String[size];
	for (int i=0;i<count.length;i++) {
		System.out.println("Enter country name");
		count[i]=sc.nextLine();
		
	}
	for (String count2:count) {
	if (count2.equalsIgnoreCase("usa")) {
		System.out.print("Capital of: "+count2+" -");
		System.out.println(" DC");
	}	else if (count2.equalsIgnoreCase("turkey")) {
		System.out.print("Capital of: "+count2+" -");
		System.out.println("Ankara");
	} else if (count2.equalsIgnoreCase("Ukraine")) {
		System.out.print("Capital of: "+count2+" -");
		System.out.println("Kyiv");
	
	}
	}
	sc.close();
}
}
