# Welcome to my Texas Hold'em guessing game!

This is being built with Java 11 and Spring 2.1.6.

The object of the game is to guess whether, based upon your cards and the communal
cards you can see, if you have the best hand vs your opponent. This will occur across
4  phases that will loosely mirror a game of Texas Hold'em poker (pre-flop, flop, turn
and river).

The inspiration for this came from my own experiences at the tables when I was first 
learning to play. On occasion when all the cards were turned over I wasn't always 100% 
sure why I had won (or lost)!

I am working on both web and console versions of the game. The core module 
which houses the logic is my main focus currently. The majority of the logic is 
package private with the Game class exposing necessary methods to the user 
loosely following the Facade design pattern. I am also using the Singleton design 
pattern to ensure that there is only ever 1 deck object and one board object in existence. 
