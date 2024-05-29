package tableauSommeValeurs;

public class App {

	public static void main(String[] args) {
		// Écrire un algorithme calculant la somme des valeurs d’un tableau 
		// (on suppose que le tableau a été préalablement saisi avec 10 nombres réels (float)).

		int i; // utilisé pour la boucle for
		float somme; // somme des valeurs du tableau
		float[] tableau; // Le tableau
		
		tableau = new float[]
				{
					13.37f,
					14.5f,
					9.4f,
					987.456f,
					1.01f, 
					3.45f,
					0.02f,
					7.45f,
					42f,
					99.99f					
				};
		
		somme = 0;
		
		for(i = 0; i < tableau.length; i++) {
			// somme = somme + tableau[i];
			somme += tableau[i];
		}
		
		System.out.println("La somme des valeurs du tableau est : " + somme);
		
	}

}
