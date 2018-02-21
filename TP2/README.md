# Estelle HERIPRET - Antoine LAFRANCE

## TP2 SVL : Test en isolation avec Mockito

### Question 1 :
Comportement non déterministe donc mock -> pour dé on veut pas d'aléatoire
interaction avec utilisateur donc mock joueur
mock banque

### Question 2 : 
- jeux fermé
- jeux ouvert cas joueur pas solvable -> oracle on ne va pas lancer les dés
utiliser mock, never

- jeux ouvert joueur gagne et banque non solvable
- jeux ouvert joueur gagne et banque solvable
- jeux ouvert joueur perd

### Question 3 : 
voir Jeu.java

### Question 4 :
Si le jeu est fermé, c'est un test d'état.

Les tests ont été réalisé dans la classe : jeuTests.java
