package categorieFootball;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		int age;
		String categorie;
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Catégorie Football");
		
		System.out.println("Saisissez votre âge");
		
		age = sc.nextInt();
		
		if (age < 5) {
			categorie = "trop jeune";
		}
		else if (age < 7) {
			categorie = "Débutant";
		}
		else if (age < 9) {
			categorie = "Poussin";
		}
		else if (age < 11) {
			categorie = "Benjamin";
		}
		else if (age < 13) {
			categorie = "Pupille";
		}
		else if (age < 15) {
			categorie = "Minime";
		}
		else if (age < 17) {
			categorie = "Cadet";
		}
		else if (age < 19) {
			categorie = "Junior";
		}
		else if (age < 35) {
			categorie = "Senior";
		}
		else {
			categorie = "Veteran";
		}
		
		System.out.println("Votre catégorie est " + categorie + ".");
		
		sc.close();
	}
}
