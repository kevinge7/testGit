# CS611 Project0
From Yuxi Ge Boston University

## Environment
Java 8

## run
Main file is ticTacToe.java

## structure
#### ticTacToe.java 
This is the main file of the project. It contains the checkWin function which used to check whether winner is generate and who is the winner. Everything in this file is not extendable. Because these are the unique rule for TicTacToe game. 
#### player.java
This file is used to switch player when every valid move happened. And it can extend to other games, such as add players ID, their prefer symbol and multiple players.
#### cell.java
This file define each cell in the board. 
#### board.java
This file is to combine cell into a board. For TicTacToe, this file combine 9 cells in a board. This can extend to any number of cells needed.
