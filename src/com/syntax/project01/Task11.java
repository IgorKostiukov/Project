package com.syntax.project01;

public class Task11 {
	public static void main(String[] args) {
		String[] fruits = { "banana", "apple", "orange", "banana", "pineapple", "pineapple", "apple", "kiwi",
				"tomato", "kiwi" };
		String compare = "";
		String dupl="";
		
	
		for (int i = 0; i < fruits.length; i++) {
			compare = fruits[i];
			for (int j = i + 1; j < fruits.length; j++) {
				 if (j == fruits.length) {
					break;
				} else if (compare.equals(fruits[j])) {
					dupl=compare;
					System.out.println(dupl);

				}  
				
			}
			


		}
		if (dupl=="") {
			System.out.println("There is no duplicate");
		}
	}
}

