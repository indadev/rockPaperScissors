# rockPaperScissors
## Introduction 

This is a coding challenge to show my coding skills.
It is a program that plays rounds of Rock, Paper, Scissors (https://en.wikipedia.org/wiki/Rock_paper_scissors)

## Execution

Start Spring boot server

```
mvn spring-boot:run
```

The client has been integrated inside the java project, you only need to open

http://localhost:8080/client.html

## Technology used

The API rest for the back end was created using:

* Java
* Spring boot

And a basic web front end using the framework Vue.js.
For the lack of time the JavaScript has been embedded inside the HTML page:

* Javascript
* Vuejs
* HTML

## Game details

There are two kinds of players, one always chooses rock and the other always random.

The game has 3 buttons:

* New Game: Create a new game
* Play Round: Play a new round
* Restart: Restart the current game

There is a part where it shows the results table with 3 columns (Player 1, Player 2 and Winner)

Between controls and player's results, there is a part where we show all the historic totals.

* All rounds
* Player 1 wins
* Player 2 wins
* All draws
