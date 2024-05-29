package inversion2Valeurs;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {


		int A; 
		
		int B;
		
		int C;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre");
		
		A = sc.nextInt();
		
		System.out.println("Saisir le second nombre");
		
		B = sc.nextInt();
		
		System.out.println("Les valeurs sont " + A + " et " + B);
		
		C = B;
		
		B = A;
		
		A = C;
		
		System.out.println("Les valeurs sont " + A + " et " + B);
		
		
		sc.close();
	}

}
