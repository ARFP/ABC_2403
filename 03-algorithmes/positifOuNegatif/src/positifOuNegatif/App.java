package positifOuNegatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int nombreEntier;
				
		System.out.println("Saisissez un nombre entier");
		
		nombreEntier = sc.nextInt();
		
		/*if(nombreEntier >= 0)
			System.out.println("Ce nombre est positif");
		else 
			System.out.println("Ce nombre est négatif");*/
		

		if(nombreEntier >= 0) { // Si nombreEntier est supérieur ou égal à 0
			System.out.println("Ce nombre est positif");
		}
		else { // sinon
			System.out.println("Ce nombre est négatif");
		}
		
		sc.close();

	}

}
