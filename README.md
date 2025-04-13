# Maze Generator and Solver

## Project Overview

This project implements a maze generator and solver using recursive backtracking. The maze is generated with walls and paths, and the solution path is found using a depth-first search (DFS) recursive algorithm. The user can specify the size of the maze, and the program will generate and display the maze along with the computed path from the start point to the exit.

## Features

- **Maze Generation**: A random solvable maze is generated using the recursive backtracking algorithm. Walls and paths are represented within a 2D grid.
- **Recursive Pathfinding**: A DFS algorithm is used to find a valid path from the starting point to the exit.
- **Custom Maze Size**: Users can define the number of rows and columns for the maze (both odd and even values will be adjusted to odd dimensions automatically).
- **Maze Visualization**: The maze is displayed in the terminal using `#` for walls and spaces for paths. The solution path is shown using `.`.
- **Input & Output**: Users can input the maze size and view the generated maze with the computed path.

## How to Use

1. Clone the repository:

   ```bash
   git clone https://github.com/KAzybekovich/saliev-discrete.git
Navigate to the project directory:

bash
Copy code
cd saliev-discrete
Compile the program using your IDE or the command line:

If using IntelliJ IDEA:

Open the project in IntelliJ.

Build and run the project.

Or using the command line:

bash
Copy code
javac MazeSolver.java
Run the program:

bash
Copy code
java MazeSolver
The program will ask you to enter the number of rows and columns (both must be at least 11, and the program will adjust to odd dimensions if needed).

After running the program, you will see the maze and the solution path.

Requirements
Java 8 or higher

Project Structure
MazeSolver.java: Main program that generates the maze and solves it.

README.md: Project description and instructions.

.gitignore: Git ignore file to avoid unnecessary files being committed.

Commit History
The project includes a minimum of 10 commits, detailing the incremental progress of implementing the maze generation and solver, along with improvements and debugging.

Example Output
Maze (before solving):

shell
Copy code
# # # # # # # # # #
#   #     #       #
#   # ### # #######
#   #   # #   #   #
# # ### # # # # # #
# #     # #     # #
# # # ##### ### # #
#   #       # # # #
####### # ##### # #
#   # #       #   #
# # # ####### # ###
# #   #       #   #
# # # ########### #
#     #         # #
# ##### ######### #
# # #     #   #   #
# # ##### # # #####
#     #   #   #   #
# # # # # # # # # #
Solution Path (displayed with .):

shell
Copy code
# # # # # # # # # #
# . . . . . # . . #
# . # ### # #######
# . #   # #   # . #
# # ### # # # # # #
# # . . # #     # #
# # # ##### ### # #
# . # . . . . # # #
####### # ##### # #
# . # . . # . . . #
# # # ####### # ###
# # . # . . . # . #
# # # ########### #
# . . . . # . . . #
# ##### ######### #
# # # . # . . # . #
# # ##### # # #####
# . . # . . . . . #
# # # # # # # # # #
