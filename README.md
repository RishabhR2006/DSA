# Data Structures and Algorithms — Java, Semester 3

Java programs from the **Data Structures and Algorithms** course in Semester 3 of B.Tech CSE.
Each data structure is written by hand, from arrays and recursion to linked lists, stacks, binary trees and graphs.

## Contents

| Folder | Programs | Concepts |
|---|---|---|
| [`01-arrays`](01-arrays) | read and print an array, insert at an index (user input and predefined array), delete every occurrence of a value, reverse a string | fixed-size arrays, shifting elements |
| [`02-searching`](02-searching) | linear search, binary search | O(n) vs O(log n) search |
| [`03-sorting`](03-sorting) | bubble sort | comparison sorting |
| [`04-recursion`](04-recursion) | print 1..N, sum of natural numbers, factorial, Fibonacci series, Nth Fibonacci term | recursion |
| [`05-linked-lists`](05-linked-lists) | basics, search, insert before a node, delete at a position, reverse, full singly linked list operations, circular linked list operations | nodes and links, head and tail |
| [`06-stack`](06-stack) | array-based stack with recursive display and search | last in, first out; overflow and underflow |
| [`07-trees`](07-trees) | binary tree with inorder, preorder and postorder traversal | tree traversal |
| [`08-graphs`](08-graphs) | directed graph with an adjacency list: add and remove vertices and edges, BFS, DFS, in-degree and out-degree | graph representation and traversal |

## How to run

You need a JDK (Java 8 or newer). Every file is a standalone program with its own `main` method:

```
cd 05-linked-lists
javac LinkedListReverse.java
java LinkedListReverse
```

Output:

```
1 2 3 4
4 3 2 1
```

The programs in `01-arrays`, `02-searching`, `03-sorting` and `04-recursion` ask for input; the linked list, stack, tree and graph programs run a built-in example.
