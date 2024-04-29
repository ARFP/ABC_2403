# Positif ou négatif (bis) ?

Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.

## Algorithme

``` 
VARIABLES 

	nombre1 est un ENTIER
	nombre2 est un ENTIER
	resultat est un ENTIER

TRAITEMENT 

	ECRIRE "Saisissez un 1er nombre entier"

	LIRE nombre1

	ECRIRE "Saisissez un 2nd nombre entier"

	LIRE nombre2
	
	resultat <-- nombre1 * nombre2

	SI resultat >= 0 ALORS
		ECRIRE "Le produit des 2 nombres est positif"
	SINON ALORS
		ECRIRE "Le produit des 2 nombres est négatif"
	FIN SI

```