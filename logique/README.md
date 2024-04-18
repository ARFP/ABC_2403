# Module Logique

Raisonnement Logique & Algèbre de Boole 


## Exemple

Considérons le cas d’une ampoule pour laquelle nous définissons les opérations suivantes

- Allumer l'ampoule
- Éteindre l'ampoule

Les états possibles de l'ampoule sont : 

- L'ampoule est allumée
- L'ampoule est éteinte


## Questions à se poser 

- Est-il possible d'allumer une ampoule déjà allumée ?
    - Non
- Est-il possible d'éteindre une ampoule déjà éteinte ?
    - Non

Dans les 2 cas, il y a une condition pour que l'opération correspondante réussisse.

On peut alors poser les problèmes suivants : 

- Je peux allumer l'ampoule si elle est éteinte
- Je peux éteindre l'ampoule si elle est allumée


### Cas 1 : Je peux allumer l'ampoule si elle est éteinte

- Allumer l'ampoule est l'opération à réaliser, le résultat sera "*l'ampoule s'allume*" que nous l'appellerons **P1** pour **Proposition 1**
- "*Si elle est éteinte*" est une condition nécessaire pour réaliser l'opération, nous l'appellerons **P2** ou **Proposition 2**

Soit : 
- P1 = L'ampoule s'allume
- P2 = L'ampoule est éteinte

On peut alors écrire la formule suivante  :

`P1 est vrai si P2 est vrai`
