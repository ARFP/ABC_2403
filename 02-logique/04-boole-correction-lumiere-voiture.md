# Corrections exercices Algèbre de Boole

Corrections des exercices du document [03-algebre-de-boole-corrections.docx](./03-algebre-de-boole-corrections.docx)

## Lumière du plafonnier 

La lumière d'un véhicule s'éclaire si une des deux portes avant est ouverte (capteurs pd et pg à coupure de circuit) ou si l'interrupteur du plafonnier est appuyé.

**Présentez:**

- Les propositions 
- La table de vérité 
- L'expression booléenne simplifiée 

### Propositions

- P1 = La lumière est allumée
- P2 = Porte droite ouverte
- P3 = Porte gauche ouverte
- P4 = Interrupteur appuyé 

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 1 | 1 | 1 | = | 1 |
| 0 | 0 | 0 | = | 0 |
| 1 | 0 | 0 | = | 1 |
| 0 | 1 | 0 | = | 1 |
| 0 | 0 | 1 | = | 1 |
| 1 | 1 | 0 | = | 1 |
| 1 | 0 | 1 | = | 1 |
| 0 | 1 | 1 | = | 1 |

### Expression Boolèenne

P1 est `VRAI` si P2 est `VRAI` ou P3 est `VRAI` ou P4 est `VRAI` 

`P1 = P2 + P3 + P4`

