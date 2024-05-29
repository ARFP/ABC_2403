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