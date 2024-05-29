package demoFonctions;

public class App {

	public static void main(String[] args) 
	{
		System.out.println("Démo sur les fonctions");

		App.afficherHelloWorld();
		App.afficherHelloPrenom("Mike");
		App.afficherHelloPrenom("Pierre");
		App.afficherHelloPrenom("Paul");
		
		int somme = App.calculerSomme(7, 3);
		
		System.out.println(somme);
				
	}
	
	/**
	 * Affiche "Hello World !" dans la console
	 * Utilisation : App.helloWorld();
	 */
	public static void afficherHelloWorld()
	{
		//System.out.println("Hello World !");
		App.afficherHelloPrenom("World");
	}
	
	/**
	 * Affiche le prénom fourni en argument dans la console
	 * @param prenom Le prénom à afficher
	 */
	public static void afficherHelloPrenom(String prenom) 
	{
		System.out.println("Hello " + prenom);
	}
	
	/**
	 * Calcule la somme de 2 nombres entiers
	 * @param a le 1er nombre
	 * @param b le 2nd nombre
	 * @return le résultat du calcul
	 */
	public static int calculerSomme(int a, int b)
	{
		int resultat = a + b;
		
		return resultat;
	}

}
