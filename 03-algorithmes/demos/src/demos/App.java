package demos;

import java.util.Scanner;
import classes.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String saisie;
		
		do {
			System.out.println("Sélectionner une démo : ");
			saisie = sc.nextLine();
			App.selectionnerDemo(saisie);
			
		} while(!saisie.equals("exit"));
		
		sc.close();
	}
	
	public static void selectionnerDemo(String nomDemo)
	{
		switch(nomDemo) {
			case "conditions":
				new DemoIfElse();
				break;
			case "boucles":
				new DemoWhile();
				break;
			case "exp":
				new DemoExpressions();
				break;
			case "exit":
				System.out.println("Programme terminé ! ");
				System.exit(0);
				break;
			default: 
				System.out.println("Saisie invalide !\n");
				break;
		}
	}

}
