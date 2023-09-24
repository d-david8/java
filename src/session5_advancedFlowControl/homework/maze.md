Pathfinding in a Maze
Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an end. You have to find a path from the start to the end, moving only up, down, left, or right. You can't move diagonally. If a path exists, print it; otherwise, inform the user that there's no solution.

The maze will be represented by a 2D array where:
0 represents an open cell.
1 represents a wall.
S represents the start.
E represents the end.

Example:
S 1 0 1
0 1 0 1
0 1 0 1
1 0 0 E

Problem Tasks:
Read the maze layout from a file or hard-code it into your program.
Implement a pathfinding algorithm to navigate from the start to the end.
If a path is found, print the maze with the path. You can represent the path with a *.
If no path exists, print "No solution found."

Hints:
Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
You might want to represent the maze using a class with methods to detect neighbors, check for walls, etc.
