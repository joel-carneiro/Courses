package parte1;

import java.util.Scanner;

public class UsandoImports {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name =input.nextLine();
		
		System.out.println("Hi, " + name);
		
		input.close();
	}

}
