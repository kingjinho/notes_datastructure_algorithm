# Tree

## What is tree?
1. `non-linear data structure`(not stored in sequential manner, cannot traverse every element in a single run)
2. Data is `stored hierarchically`
3. Recursive style


4. Collection of entities called `nodes`, nodes are by connected by `edges`.
5. Each node may or may not have child node(s)
6. First node is called `root`
   

7. If nodes are connected, parent-child relationship will form.
8. nodes that do not have child called `leaves`
9. Height? length of the `Longest path to a leaf from given node`
   

10. Height of the tree? Maximum height and maximum depth
11. Depth? length of the `path to its root`
12. Level? Set of all nodes at given depth (root node is level 0)
    

13. Skew - every node has only one child (only left: left skew, right: right skew)




## Examples of trees
- Family tree
- Organization Structure
- DOM tree in HTML  
- Possible routes from home to destination
    - From home, we have 3 routes, and each route has another 2 routes, and each has another 5 routes to destination!


## Types of trees

### Binary Tree
    - Each node has at most 2 children
    - `Strict binary tree:` each node has either 0 or 2 children
    - `Full binary tree:` each node has 2 children + all leaves are at the same level
    - `Complete binary tree:` every level except possibly the last, is completely filled, 
      and all nodes are as far left as possible (used in heap)
```kotlin

class BinaryTree<T>(private var data: T?) {

   private var left: BinaryTree<T>? = null
   private var right: BinaryTree<T>? = null
   
      ...
   
}
```      



#### Implementation of Binary Tree

1. Basic Operation of Binary Trees
   - Traverse (3 main steps: Current Node, Left Child Node, Right Child Node) through recursion
   - Insert
   - Delete
   - Search
   
#### Traverse
1. 3 ways
   - Preorder(DLR)
     - Process Root, Left Child Node, Right Child Node proceed further through recursion
   - Inorder(LDR)
     - Left Child Node, Root Node and Right Child Node
   - Postorder(LRD)
      - Left Child Node, Right Child Node and Root
   - Additional 
      - Level Order : From Breadth First Traversal(BFS Algorithm)
         - Root, process all nodes at the same level, repeat until it's done
   


---

### Binary Search Trees

- Binary Trees
- Mainly used for searching
- `Impose restriction` on what can be stored
- O(log n) for wost case average search operation


- Property of Binary Search Trees (`Restriction`)
    - Left subtree data < root node data
    - Right subtree data > root node data
    - `Above does not mean that root has to be the biggest numbers!!!`
    - Has distinct value(what is duplicates?)
    - Meaning `this is a sorted data structure`
    - Left and Right subtree should also be binary search trees
    - `Same as regular binary trees, but this times a restricion on data`
    

- Operations on Binary Search Trees
    - Find min/max
    - Insert
    - Delete and others
    - Find element


- Things to know about Binary Search Trees
    - Inorder traversal(LDR) of Binary Search tree :point_right: sorted list
    - Skip searching when element we search is less than left or right trees
        - Saving time
    - Basic operations take time proportional to the height of the tree




### Links
[Everything you need to know about tree data structures](https://www.freecodecamp.org/news/all-you-need-to-know-about-tree-data-structures-bceacb85490c/)

[Data Structure and Algorithms Made Easy](https://www.google.com/search?q=data+structures+and+algorithms+made+easy)