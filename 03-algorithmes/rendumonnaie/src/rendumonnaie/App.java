package rendumonnaie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double prixTotal;
		double prixPaye;
		double renduMonnaie;
		int cinqEuros;
		int deuxEuros = 0;
		int unEuro = 0;
		int cinquanteCents = 0;
		int vingtCents = 0;
		int dixCents = 0;
		
		prixTotal = App.saisirPrixTest();
		
		cinqEuros = (int)(prixTotal / 5);
		
		if(cinqEuros * 5 < prixTotal) {
			cinqEuros++;
		}
		
		prixPaye = cinqEuros * 5;
		renduMonnaie = prixPaye -prixTotal;
		renduMonnaie = Math.round(renduMonnaie * 100.0) / 100.0;
		
		System.out.println("Le client doit payer: "+ prixTotal + "€");
		System.out.println("Le client doit donner " + cinqEuros + " billets de 5€ soit " + prixPaye + "€)");
		System.out.println("Rendu monnaie: " + renduMonnaie + "€");
		
		while(renduMonnaie > 0 ) {
			while(renduMonnaie > 2) {
				deuxEuros++;
				renduMonnaie = enleverMonnaie(renduMonnaie, 2.0);
			}
			while(renduMonnaie >= 1) {
				unEuro++;
				renduMonnaie = enleverMonnaie(renduMonnaie, 1.0);
			}
			while(renduMonnaie >= 0.5) {
				cinquanteCents++;
				renduMonnaie = enleverMonnaie(renduMonnaie, 0.5);
			}
			while(renduMonnaie >= 0.2) {
				vingtCents++;
				renduMonnaie = enleverMonnaie(renduMonnaie, 0.2);
			}
			while(renduMonnaie >= 0.1) {
				dixCents++;
				renduMonnaie = enleverMonnaie(renduMonnaie, 0.1);
			}
		}
		
		System.out.println("Répartition de la monnaie à restituer au client : ");

		App.AfficherNombrePieces(deuxEuros, 2);
		App.AfficherNombrePieces(unEuro, 1);
		App.AfficherNombrePieces(cinquanteCents, 0.5);
		App.AfficherNombrePieces(vingtCents, 0.2);
		App.AfficherNombrePieces(dixCents, 0.1);
	}
	
	public static double saisirPrix()
	{
		Scanner sc = new Scanner(System.in);
		double prixSaisie;
		double prixTotal;
		
		prixTotal = 0;
		
		do {
			System.out.println("Saisissez un prix: ");
			prixSaisie = sc.nextDouble();
			prixTotal += prixSaisie;
			
		} while(prixSaisie > 0);
		
		sc.close();
		
		return prixTotal;
	}
	
	public static double enleverMonnaie(double renduMonnaie, double valeurAEnlever) {
		renduMonnaie -= valeurAEnlever;
		return Math.round(renduMonnaie * 100.0) / 100.0;
	}
	
	public static void AfficherNombrePieces(int nombrePieces, double valeurPiece) {
		if(nombrePieces > 0) {
			System.out.println("- " + nombrePieces + " pièce(s) de " + valeurPiece + "€");
		}
	}
	
	public static double saisirPrixTest()
	{
		return 37.7d;
	}

}
