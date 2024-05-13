# Ma catégorie au Football

Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :

- Trop jeune : Moins de 5 ans
- Débutant : De 5 à 6 ans
- Poussin : De 7 à 8 ans
- Benjamin : De 9 à 10 ans
- Pupille : De 11 à 12 ans
- Minime : De 13 à 14 ans
- Cadet : De 15 à 16 ans
- Junior : De 17 à 18 ans
- Sénior : De 19 à 34 ans
- Vétéran : 35 ans et +

## Algorithme

```
VARIABLES

age est un ENTIER
categorie est une CHAINE DE CARACTERE

TRAITEMENT

ECRIRE "Saisissez votre âge"
LIRE age

SI age <5 ALORS
	categorie := "trop jeune"
SINON SI age < 7 ALORS
	categorie := "Débutant"
SINON SI age < 9 ALORS
	categorie := "Poussin"
SINON SI age < 11 ALORS
	categorie := "Benjamin"
SINON SI age < 13 ALORS
	categorie := "Pupille"
SINON SI age < 15 ALORS
	categorie := "Minime"
SINON SI age < 17 ALORS
	categorie := "Cadet"
SINON SI age < 19 ALORS 
	categorie := "Junior"
SINON SI age < 35 ALORS
	categorie := "Senior"
SINON ALORS
	categorie := "Veteran"

AFFICHAGE

ECRIRE "Votre catégorie est ", categorie, "."

```
