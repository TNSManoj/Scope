package Autoboxing;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name:");
		String input=sc.nextLine();
		int upperCharCount =0;
		int lowerCharCount =0;
		if(!input.isEmpty()) {
			for(char ch:input.toCharArray()) 
				if(!Character.isDigit(ch)&&Character.isAlphabetic(ch)){
			{
				if(Character.isUpperCase(ch)) {
					upperCharCount++;
				}else {
					lowerCharCount++;
				}
			}
				}
		
		System.out.println("uppercase character:"+upperCharCount);
		System.out.println("lowercase character:"+lowerCharCount);
		}
	System.out.println("end of program...");
	
	sc.close();

	}

}
