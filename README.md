# rockPaperScissors
## Introducction 

This is coding challenge to show my coding skills.
It is a program that play rounds of Rock, Paper, Scissors (https://en.wikipedia.org/wiki/Rock_paper_scissors)

## Execution

Start Spring boot server

```
mvn spring-boot:run
```

We have integrated the client inside the java project you only need to open

http://localhost:8080/client.html

## Technology used

We have created a rest api for the back end using:

* Java
* Spring boot

And a basic web front end using, for the lack of time we have embedded the javascript inside the HTML page:

* Javascript
* Vuejs
* HTML

## First part

There is two kind of players, one always choose rock and other algays random.

The game have 3 buttons:

* New Game: Create a new game
* Play Round: Play a new round
* Restart: Restart the current game

There is a part where we show the results table with 3 columns (Player 1, Player 2 and Winner)

Between controls and players results there is a part where we show all the historic totals.

* All rounds
* Player 1 wins
* Player 2 wins
* All draws
