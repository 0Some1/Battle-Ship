
# Battleship Game

## Project Overview

This project aims to implement the classic table game, Battleship. The game environment consists of a table where a number of ships are hidden. The player's objective is to find and destroy all the ships using a limited number of missiles. This implementation focuses on a single-player version of the game.

## Project Environment

At the beginning of each game round, the player is prompted to provide the following information:

- Number of each ship type (4 types with lengths ranging from 2 to 5)
- Number of available missiles
- Length and width of the game table

The ships are randomly positioned on the table, which is represented by a grid of squares. Each square is initially hidden, and its color and shape are not visible to the player. The player can click on any square to launch a missile at that location.

The result of the missile launch is displayed to the player through the color of the targeted square:

- Blue: The square is empty
- Red: The missile hits and destroys a part of a ship

The color of each targeted square remains the same throughout the game. The game continues until the player runs out of missiles or successfully destroys all the available ships.

During the game, the player can keep track of the following information:

- Number of remaining missiles
- Number and type of remaining ships

Additionally, the player has the option to reveal the contents of the squares for a limited time. Empty squares are displayed with light blue, and squares with ships are displayed with green. This feature can be accessed through a button in the game's graphical user interface (GUI).

**Note:** This implementation focuses on a single-player version of the Battleship game.

## Getting Started

To start the game:

1. Launch the game application.
2. Enter the number of each ship type, the number of available missiles, and the dimensions of the game table.
3. Click on the squares on the table to launch missiles and reveal their contents.
4. Keep track of the remaining missiles and ships.
5. Use the reveal option to briefly display the contents of the squares.

Enjoy playing Battleship!

