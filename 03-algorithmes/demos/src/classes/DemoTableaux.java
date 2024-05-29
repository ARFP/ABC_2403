package classes;

public class DemoTableaux {
	
	public DemoTableaux() {
		
		// Déclaration d'un tableau d'entiers
		int[] tableau; 
		int[] tableau2;
		
		// Initialisation d'un tableau de 3 cases vides
		// Les 3 cases "vides" prennent la valeur par défaut du type 
		// (0 pour les types numériques, NULL pour les tableaux de String).
		tableau = new int[3];
		
		// Initialisation d'un tableau avec 5 valeurs préremplies
		// Le nombre de cases dans le tableau correspond au nombre de valeurs renseignées.
		tableau2 = new int[] { 1, 3, 5, 7, 9 }; 

		// Affichage de la longueur des 2 tableaux précédents
		System.out.println("Longueur de tableau: " + tableau.length); // Affiche 3
		System.out.println("Longueur de tableau2: " + tableau2.length); // Affiche 5
		
		// Ajout de valeurs dans le 1er tableau
		// On accède aux "cases" du tableau avec leur indice
		// 1ere case = indice 0 ; 2ème case = indice 1 ; etc...
		tableau[0] = 3;
		tableau[1] = 5;
		tableau[2] = 22;

		// Affichage des éléments du 1er tableau
		System.out.println("Element 0 de tableau = " + tableau[0]);
		System.out.println("Element 1 de tableau = " + tableau[1]);
		System.out.println("Element 2 de tableau = " + tableau[2]);
			
		// Parcours de toutes les cases d'un tableau avec une boucle FOR
		// On utilise la variable "i" pour accéder aux éléments du tableau.
		// Tout au long du parcours, la variable "i" prendra les valeurs des indices du tableau: 
		// 0 puis 1 puis 2 etc... jusqu'à la dernière case du tableau.
		/*
		 * POUR i de 0 à longueur(tableau), incrémenter i
		 * 	ECRIRE "Element ", i, " de tableau = ", tableau[i]
		 * FIN POUR
		 * */
		for(int i = 0; i < tableau.length; i++) {
			System.out.println("Element " + i + " de tableau = " + tableau[i]);
		}
		
		
	}

}
