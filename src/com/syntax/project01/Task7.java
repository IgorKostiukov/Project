package com.syntax.project01;

public class Task7 {

	public static void main(String[] args) {
String[] iceCream= {"Vanilla", "Mint", "Rocky Road", "Chocolate", "Rocky Road", "Mint"};
		
		String[] dupe=new String[iceCream.length];
		int index=1;
		int dupeIdx=0;
		
		for(String flavors:iceCream) {
			
			for(int i=index; i<iceCream.length; i++) {
				if(flavors.equals(iceCream[i])) {
					
					for(int y=0; y<=dupeIdx; y++) {
						if(flavors.equals(dupe[y])) {
							break;
						}else {
							dupe[dupeIdx]=flavors;
							dupeIdx++;
							break;
						}
					}
				}
			}index++;
		}
		for(int j=0; j<dupeIdx; j++) {
			System.out.println(dupe[j]);
		}







	}

}
