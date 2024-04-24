# Exercice 1.1 : Hello World
Ecrire un programme qui affiche “Hello World !”.

  
``` 
ECRIRE "Hello World"
``` 

# Exercice 1.2 : Hello you
L’utilisateur est invité à saisir son prénom dans la console.

Le programme affiche “Bonjour “ suivi du prénom saisi.

```
VARIABLES
    toto est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE toto
    ECRIRE "bonjour ", toto, "."
```

Alternative avec contrôle sur la longueur du prénom

```
VARIABLES
    prenom est une CHAINE DE CARACTERES

TRAITEMENT 
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    SI prenom.LONGUEUR > 2 ALORS
        ECRIRE "bonjour ", prenom, "."
    SINON 
        ECRIRE "Prénom invalide"
    FIN SI
```


# Exercice 1.3 : Calcul de la moyenne de 2 nombres

L’utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

```
VARIABLES

nombre1 est un NOMBRE ENTIER 
nombre2 est un NOMBRE ENTIER
moyenne est un NOMBRE REEL 

TRAITEMENT

ECRIRE "Veuilez saisir un premier nombre"
LIRE nombre1
ECRIRE "Veuilez saisir un second nombre"
LIRE nombre2

moyenne <-- (nombre1 + nombre2) / 2

RESULTAT

ECRIRE "La moyenne de ", nombre1, " et ", nombre2, " est ", moyenne, "."
// "La moyenne de 12 et 81 est 46,5"
```

# Exercice 1.4 : Calcul de l’aire et du volume d’une sphère

Lire le rayon `R` d’une sphère puis calculer et afficher :
- Son aire = `4 π R²`
- Son volume = `(4 π R³)/3`

```

```

# Exercice 1.5 : Calcul de la surface d’un secteur circulaire

Lire le rayon R d’un cercle et un angle A (en degré(s)).

Calculer et afficher :
- L’ aire du secteur circulaire = (π R² A) / 360

```

```

# Exercice 1.6 : Inversion de 2 valeurs

Lire 2 nombres entier A et B.

Afficher la valeur de A puis la valeur de B.

Mettre le contenu de A dans B et celui de B dans A.

Afficher à nouveau la valeur de A puis la valeur de B.

```

```