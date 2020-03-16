# OpenX_recruitment_project
Small project for OpenX recruitment process.

## Task
The task was to create simple structure that is tree-like. While creating this structure 
I made following assumptions:
- Tree is not self organized nor has any specific qualities (like AVL / RBT)
- Tree only has left and right nodes
- While using this structure we have access to nodes
- This tree does not have a set properties

## Available  classes
### Node
This class creates core for solution. We can add left nodes, right nodes and manipulate value that it inside\
We have at our disposal getters and getters for left Node, right Node and value that Node holds.
### Tree
This class provides functionality required to finish the task. 
It allows to:

- calculateMedian()
- calculateSum()
- calculateAvg()

As it init value it that Node as acts as if this Node is root of a tree. We can change internal root anytime using
- changeRoot(Node node)

method.

## Tests
All used test are in "test" directory.


