## Estelle HERIPRET

## Antoine LAFRANCE

### TP3 Pratique du TDD sans dépendances

#### Exercice 1 : 

fonctionnalités : créer un compte ,créditer un compte et débiter un compte

Créer un compte :
- initialement à zéro

Créditer un compte :
- créditer sur zéro
- créditer sur non zéro

Débiter un compte : 
- débiter sur zéro -> erreur
- débiter sur non zéro
- débiter trop sur non zéro

#### Exercice 2 :

fonctionnalité : sous-echantillonne une liste d'entiers

- sous-echantillonner une liste vide -> liste vide
- frequence <= 0 -> exception
- longueur sous-echantillon <= 0 -> exception
- sous-echantillonner [1,2,3,4,5] avec fréquence = 2 et longueur echantillon à 1 -> renvoyer [1,3,5] 
- sous-echantillonner une liste de 5 éléments avec frequence = 5 et longueur echantillon à 1 -> renvoyer le premier element
- sous-echantilloner une liste de 5 éléments avec fréquence = 10 et longueur échantillon = 6 -> renvoyer la liste
- fréquence < longueur sous-echantillons -> exception
