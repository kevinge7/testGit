# CS611-Project0
## TicTacToe Game
Yuxi Ge
yuxig5@bu.edu
U70788037
## Environment
Java 8

## run
Main file is ticTacToe.java

## Files
#### ticTacToe.java 
This is the main file of the project. It contains the checkWin function which used to check whether winner is generate and who is the winner. Everything in this file is not extendable. Because these are the unique rule for TicTacToe game. 
#### player.java
This file is used to switch player when every valid move happened. And it can extend to other games, such as add players ID, their prefer symbol and multiple players.
#### cell.java
This file define each cell in the board. 
#### board.java
This file is to combine cell into a board. For TicTacToe, this file combine 9 cells in a board. This can extend to any number of cells needed.

## Input/Output Example
OutPut:
Welcome to the Tic-Tac-Toe!
Do you want to play the game? (y/n)
Input:y
OutPut:
Please enter a board size: 
Intput:3
Output:
*  *  *  
*  *  *  
*  *  *  
X: Please enter the row number:
Input:1
Outut:
X: Please enter the column number:
Input:1
Output:
X  *  *  
*  *  *  
*  *  *  
O: Please enter the row number:

~
~
~

X  X  *  
O  O  *  
*  *  *  
X: Please enter the row number:
Input:1
Output:X: Please enter the column number:
Input:3
Output:
X  X  X  
O  O  *  
*  *  *  

Congrats!
X Win!
