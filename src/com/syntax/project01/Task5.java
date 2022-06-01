package com.syntax.project01;

public class Task5 {
	public static void main(String[] args) {
		int [] [] a= {{1,2,3,4,5},{10,20,30},{111,222,333,444},{55,22},{7777,88889}};
		int sum=0;
		int sum1=0;
		for (int[] i:a) {
			for (int j:i) {
				if(j%2==0) {
					sum+=j;
					
				} else {
					sum1+=j;
				}
			}
		}
		System.out.println("Sum of Odd numbers is "+sum1);
		System.out.println("Sum of Even numbers is "+sum);
		System.out.println("---------------------------------");
		int sum2=0;
		int sum3=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0) {
					sum2+=a[i][j];
					
				} else {
					sum3+=a[i][j];
				}
			}
		}
		System.out.println("Sum of Odd numbers is "+sum3);
		System.out.println("Sum of Even numbers is "+sum2);
	}
	}

