namespace catFootball
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String saisie;
            int age;
            String categorie; 

            Console.WriteLine("Saisissez votre âge : ");

            saisie = Console.ReadLine();

            age = int.Parse(saisie);

            if (age < 5)
            {
                categorie = "trop jeune";
            }
            else if (age < 7)
            {
                categorie = "Débutant";
            }
            else if (age < 9)
            {
                categorie = "Poussin";
            }
            else if (age < 11)
            {
                categorie = "Benjamin";
            }
            else if (age < 13)
            {
                categorie = "Pupille";
            }
            else if (age < 15)
            {
                categorie = "Minime";
            }
            else if (age < 17)
            {
                categorie = "Cadet";
            }
            else if (age < 19)
            {
                categorie = "Junior";
            }
            else if (age < 35)
            {
                categorie = "Senior";
            }
            else
            {
                categorie = "Veteran";
            }


            Console.WriteLine("Votre catégorie est " + categorie + ".");


        }
    }
}