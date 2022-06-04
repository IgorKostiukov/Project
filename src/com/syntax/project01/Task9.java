package com.syntax.project01;

public class Task9 {
public static void main(String[] args) {
int a[] = {10,2,-2,4,15,6};
int min=a[0];
int max=a[0];
for (int i:a) {
	if(min>=i) {
		min=i;
	}
	else if(max<=i) {
		max=i;
	} else if (min ==max) {
		System.out.println("min and max value are the sanme");
	}
}
System.out.println("Minimum number is "+min);
System.out.println("Maximum number is "+max);
}
}
