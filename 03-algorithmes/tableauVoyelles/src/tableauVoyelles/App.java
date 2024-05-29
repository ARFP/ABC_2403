package tableauVoyelles;

public class App {

	public static void main(String[] args) {
		// Écrire un algorithme qui déclare et 
		// remplit un tableau contenant les six voyelles de l’alphabet latin.

		// solution 1
		// déclare un tableau de 6 "cases"
		char[] tableau2 = new char[6];
		// On remplit manuellement chacune des cases
		tableau2[0] = 'a';
		tableau2[1] = 'e';
		tableau2[2] = 'i';
		tableau2[3] = 'o';
		tableau2[4] = 'u';
		tableau2[5] = 'y';
		
		// solution 2
		// déclare un tableau l'initialise avec 6 valeurs
		char[] tableauBis = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};
		
		
		//char[] tableauTer = new char[6];
		//tableauTer = {'a', 'e', 'i', 'o', 'u', 'y'};
	}

}
