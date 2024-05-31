package insertionTableau;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
		int[] tableau = new int[]{ 1, 4, 5, 10, 20, 22, 25, 30, 32 };
		
        int[] tableau2 = new int[tableau.length + 1]; 


        System.out.println("tableau initial : " + Arrays.toString(tableau));
        
        System.out.println();
        
        for (int i = 0; i < tableau.length; i++) {
            tableau2[i] = tableau[i];
        }
        
        System.out.println("tableau2 initial: " + Arrays.toString(tableau2));

        System.out.print("Entrez le nombre à insérer : ");
        
        int nombreAInserer = scanner.nextInt();

        // Recherche de la position d'insertion
        int i = tableau.length - 1;
        
        while (i >= 0 && tableau2[i] > nombreAInserer) {
            tableau2[i + 1] = tableau2[i];
            i--;
        }

        // Insertion du nouveau nombre dans le tableau intermédiaire
        tableau2[i + 1] = nombreAInserer;
        
        tableau = tableau2;

        System.out.println("tableau apres: " + Arrays.toString(tableau)); 

	}

}
