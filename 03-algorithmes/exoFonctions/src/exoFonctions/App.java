package exoFonctions;

public class App {

	public static void main(String[] args) {

		// Ecrire une PROCEDURE qui calcule et affiche le périmètre d'un triangle
		
		int a = 20; // Coté 1 du triangle
		int b = 30; // Coté 2 du triangle
		int c = 40; // Coté 3 du triangle
		
		// Appel de la fonction calculerPerimetreTriangle
		App.calculerPerimetreTriangle(a, b, c);
		
		
		
		// Ecrire une PROCEDURE qui calcule la MOYENNE des valeurs du tableau
		
		int[] valeurs = new int[] { 1, 3, 5, 7, 3, 4, 2, 4, 22 }; // Le tableau de valeurs
		
		App.calculerMoyenne(valeurs); // Appel de la fonction calculerMoyenne
	}
	
	/**
	 * Calcule et affiche le périmètre d'un triangle
	 * @param a1 longueur du 1er coté
	 * @param b1 longueur du 2ème coté
	 * @param c1 longueur du 3ème coté
	 */
	public static void calculerPerimetreTriangle(int a1, int b1, int c1)
	{
		int perimetre = a1 + b1 + c1;
		
		System.out.println(perimetre);
	}
	
	/**
	 * Calcule et affiche la moyenne des valeurs d'un tableau
	 * @param tableau le tableau de valeurs
	 */
	public static void calculerMoyenne(int[] tableau) 
	{
		int somme = 0; // la somme de toutes les valeurs du tableau
		float moyenne; // La moyenne de toutes les valeurs du tableau
		
		for(int i = 0; i < tableau.length; i++) {
			//somme = somme + tableau[i];
			somme += tableau[i];
		}
		
		moyenne = ((float)somme / (float)tableau.length);
		
		System.out.println(moyenne);
	}

}
