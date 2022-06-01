package com.syntax.project01;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("How many countries would you like to enter?");
		int size=inp.nextInt();
		inp.nextLine();
		String capital = "";
		
		String[] countries=new String[size];
		
		for (int a=0; a < size; a++) {
			System.out.println("Enter the name of a country.");
			String country=inp.nextLine();
			countries[a]=country;
		}
		
		int i= 0;
		while (i< countries.length) {
			
			switch (countries[i].toLowerCase()) {
			
			case "south korea":
				capital="Seoul";
				break;
			
			case "poland":
				capital="Warsaw";
				break;	
			
			case "canada":
				capital="Ottowa";
				break;
			
			case "south africa":
				capital="Cape Town";
				break;
			
			case "usa":
			capital="Washington D.C.";
				break;
			
			case "Iran":
				capital="Tehran";
				break;
				
			default:
				capital="Unknown";
			}
			System.out.println("The capital of " + countries[i] + " is " + capital);
			i++;
		}
		
	}
	
}