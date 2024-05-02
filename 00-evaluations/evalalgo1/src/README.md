# Algorithme à implémenter 

```
DEBUT PROGRAMME 

VARIABLES 

    nombreArticles est un ENTIER 
    prixHT est un REEL 
    prixTTC est un REEL 

TRAITEMENT 

    ECRIRE "Bienvenue dans le programme de calcul du prix TTC." 
    ECRIRE "Indiquer le prix de l'article : " 
    LIRE prixHT 
    ECRIRE "Le prix Hors Taxes de l'article est : ", prixHT 
    ECRIRE "Indiquer le nombre d'articles : " 
    LIRE nombreArticles 
    prixTTC <-- prixHT * nombreArticles 
 
    SI prixHT >= 10 ALORS 
        prixTTC <-- prixTTC + (prixTTC * 20 / 100) 
    SINON  
        prixTTC <-- prixTTC + (prixTTC * 5 / 100) 
    FIN SI 
 
RESULTAT 

    ECRIRE "Le montant à payer est de : ", prixTTC, "." 

FIN PROGRAMME 
```