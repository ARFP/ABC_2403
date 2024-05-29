package calculAireVolume;

import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {
		
		double R; // Rayon de la sphère
		
		double aire;
		
		double volume;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Saisir votre nombre");
		
		R = sc.nextDouble();
		
		aire = 4 * Math.PI * Math.pow(R, 2);
		
		volume = (4 * Math.PI * Math.pow(R, 3)) / 3;
				
		System.out.println("L'aire de la sphère est de " + aire);
		
		System.out.println("Le volume de la sphère est " + volume);
	  	
		
		sc.close();
		
				
				
	
		

	}

}
