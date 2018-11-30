package v48;

import java.util.Scanner;

public class Metoder {

	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		String name;
		String name2;
		
		System.out.println("Hej. Vad heter du och din mamma?");
		name = input.nextLine();
		name2 = input.nextLine();
		
		welcomeMessage(name, name2);
		
	}

	//Skriv en metod som returnerar en hälsning till en person
	
	static void welcomeMessage(String name, name2)  {
	
		System.out.println("Hej " + name + "! Välkommen hit!");
		System.out.println("Hej " + name2 + "! Välkommen hit!");
		
	}
