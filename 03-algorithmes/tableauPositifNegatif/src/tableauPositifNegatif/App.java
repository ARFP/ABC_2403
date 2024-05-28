package tableauPositifNegatif;

import java.util.Scanner;

public class App {
	
	public static int poserQuestion(String question)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(question);
		
		int valeur = sc.nextInt();
		
		sc.close();
		
		return valeur;
	}

	public static void main(String[] args) {
		// Écrire un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, 
		// qui devront être stockées dans un tableau.
		// L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il compte saisir. 
		// Il effectuera ensuite cette saisie. 
		// Enfin, une fois la saisie terminée, 
		// le programme affichera le nombre de valeurs négatives et le nombre de valeurs positives.

		Scanner sc = new Scanner(System.in);
		int tailleTableau;
		int[] tableau;
		int i;
		int positif;
		int negatif;
		
		positif = 0;
		negatif = 0;
		
		/*System.out.println("Entrer le nombre de valeurs que vous souhaitez saisir : ");
		
		tailleTableau = sc.nextInt();*/

		tailleTableau = App.poserQuestion("Entrer le nombre de valeurs que vous souhaitez saisir : ");
		
		tableau = new int[tailleTableau];
		
		for(i = 0; i < tailleTableau; i++) {
			/*System.out.println("Saisissez la valeur N°" + (i+1) + "/" + tailleTableau);		
			
			tableau[i] = sc.nextInt();*/
			
			tableau[i] = App.poserQuestion("Saisissez la valeur N°" + (i+1) + "/" + tailleTableau);
			
			if(tableau[i] >= 0) {
				positif++;
			} else {
				negatif++;
			}
			
		} // fin for

		System.out.println("Vous avez saisi: " + positif + " nombres positifs");
		System.out.println("Vous avez saisi: " + negatif + " nombres négatifs");
		
		sc.close();
		
	}

}
