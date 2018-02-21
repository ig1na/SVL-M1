# Estelle HERIPRET - Antoine LAFRANCE

## TP2 SVL : Test en isolation avec Mockito

### Question 1 :
Nous devons mocker les objets "De", "Joueur" et "Banque" car le jeu en dépend. Nous ne voulons pas d'aléatoire pour le lancer de dé car nous devons provoquer la victoire ou la défaite du joueur. De même nous souhaitons pouvoir décider de la solvabilité de la banque ou du joueur. Des classes mocks nous permettrons d'avoir ce controle sur le résultat des méthodes de ces classes.


### Question 2 : 
- On teste la levée d'exception lorsqu'on appelle la méthode jouer alors que le jeu est fermé
- On teste la levée d'exception lorsqu'uon appelle la méthode jouer alors que le joueur n'est pas solvable, on vérifie aussi que les dés ne sont jamais lancés
- On teste que le jeu est bien fermé si à la fin d'un tour gagnant la banque est insolvable
- On teste que le jeu est bien ouvert si à la fin d'un tour gagnant la banque est solvable 
- On teste que le jeu reste ouvert si le joueur perd

### Question 3 : 
voir Jeu.java

### Question 4 :
On teste l'état interne de l'objet, à savoir s'il est ouvert ou non, il s'agit donc d'un test d'état.

Les tests ont été réalisé dans la classe : jeuTests.java

### Question 5 :
On va tester si le joueur est solvable, on a donc un mock, et on ne teste pas l'état interne du jeu, mais une levée d'exception lorsqu'on tente de débiter un joueur qui n'est pas solvable. On a donc un test des interactions.

### Question 6 & 7:
voir JeuTests.java & BanqueA.java

