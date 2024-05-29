package abcevalalgo1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nombreArticles;
		double prixHT;
		double prixTTC;
		
		System.out.println("Bienvenue dans le programme de calcul du prix TTC.");
		System.out.println("Indiquer le prix de l'article : ");
		prixHT = sc.nextDouble();
		
		System.out.println("Le prix de l'article Hors Taxe est de : " + prixHT);
		
		System.out.println("Indiquer le nombre d'articles : ");
		nombreArticles = sc.nextInt();
		
		prixTTC = prixHT * nombreArticles;
				
		if (prixHT >= 10) {
			prixTTC = prixTTC + (prixHT * 20 / 100);
		}
		else {
			prixTTC = prixTTC + (prixHT * 5 / 100);
		}
		
		System.out.println("Le montant à payer est de : " + prixTTC + ".");
		
		sc.close();

	} // FIN DU PROGRAMME

}
