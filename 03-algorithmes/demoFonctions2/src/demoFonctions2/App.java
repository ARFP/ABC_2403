package demoFonctions2;

public class App 
{
	public static void main(String[] args) 
	{
		Toto toto = new Toto();		
		
		toto.a = 20;
		
		App.changerValeur(toto);
		
		System.out.println(toto.a);
	}
	
	public static void changerValeur(Toto tata)
	{
		tata.a = 30;
	}
}
