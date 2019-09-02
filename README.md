# Welcome to my Texas Hold'em guessing game!

This is being built with Java 11 and Spring 2.1.6.

The object of the game is to guess whether, based upon your cards and the communal
cards you can see, if you have the best hand vs your opponent.

I am working on both web and console versions of the game with the core module 
which houses the logic being my main focus currently. The majority of the logic is package private with the Game class exposing 
necessary methods to the user (loosely following the Facade design pattern). I am also 
using the Singleton design pattern to ensure that there is only ever 1 deck object 
and one board object in existence. 
