namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        int age;
        String categorie;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            age = int.Parse(textBox1.Text);

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

           label2.Text = "Votre catégorie: " + categorie;
        }
    }
}