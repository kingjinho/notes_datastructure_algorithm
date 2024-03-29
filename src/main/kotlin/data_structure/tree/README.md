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

## terms

- Node: data stored
- Root Node: first node
- Leaf Node: end of the node
- parent-children relationship
- Depth: from selected node to root
- `Height: maximum length of from node to leaf node`
- subtree: tree under certain node
    - recursive!

## Examples of trees

- Family tree
- Organization Structure
- DOM tree in HTML
- JSON, YAML
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
- O(log n) for wost case average algorithms.search operation


- Property of Binary Search Trees (`Restriction`)
    - Left subtree data < root node data
    - Right subtree data > root node data
    - `Above does not mean that root has to be the biggest numbers!!!`
    - Has distinct value(what is duplicates?)
    - Meaning `this is a sorted data structure`
    - Left and Right subtree should also be binary algorithms.search trees
    - `Same as regular binary trees, but this times a restricion on data`


- Operations on Binary Search Trees
    - Find min/max
    - Insert
    - Delete and others
    - Find element


- Things to know about Binary Search Trees
    - Inorder traversal(LDR) of Binary Search tree :point_right: sorted list
    - Skip searching when element we algorithms.search is less than left or right trees
        - Saving time
    - Basic operations take time proportional to the height of the tree


- Delete
    - More complicate than other operations
        - Element to be deleted may be either leaf or not
    - Consider some cases
        - When it is leaf :point_right: set null
        - What it is not leaf :point_right: one it has only one child, or 2 children

    1. One child
        - Set child to parent node
    2. 2 Children
        - `Set the smallest value from the right node`
        - `Set the largest value from the left node`
        - `Reason?`
            - In Binary Search Tree, One primary condition that has to be applied for every node is
              `Left node must be less than parent, while right node must be greater than parent`
            - all nodes stemming from left is smaller than parent no matter what
            - all nodes stemming from right is greater than parent no matter what
            - The smallest from the right, the largest from the left are the ones that are close to parent the most

## Difference between sorted array vs BST

|sorted array| BST   |
|------------|-------|
|in general, sort before search|no need to sort|
|newly added data may not be sorted|newly added data is placed in sorted position|
|O(logN)after sort|O(logN)|
|add, remove: O(N)| O(logN)|
|Simple|Complex data structure|
|one big chunk of memory|more than one chunk of memory|

## Red-Black tree

- Each node is either red or black
- Data stored in each node is 1 bit size data
    - 2 types of node
- `Self-balancing tree`
    - to minimize height of the tree
    - when to balance? add & remove
    - searching is faster than BST
- Balance? between red and black

1. Properties
    - every node is either red or black
    - root node is always black
    - every leaf node(NIL) is black
    - children of red node are always black
    - `number of black nodes between leaf node and a certain node is always the same`
        - black height

2. effects on black height
    - leaf node does not contain data
    - black depth: number of black nodes between root and a node
    - black height: number of black nodes between a node and a leaf
    - `the biggest depth is always less than 2 times the smallest depth`

3. Add & Remove
    - `Adding and removing element could break its properties`
    - After that, restructure tree to restore its properties
    - not 100%, but it guarantees O(logN) in searching
    - O(logN) for adding and removing element
        - add or remove: O(logN): due to its assurance of depth
        - tree rotation: O(1)
        - change color: O(1)
    - 4 adding strategies & 6 removing strategy
    
4. Add
- add, just like BST
- new element is always red
- new element is always attached to the leaf
- `recursive from leaf to root`
    - tree rotation,
    - change color
    - differ by 4 situations(strategies)
    


    

### Links

[Everything you need to know about tree data structures](https://www.freecodecamp.org/news/all-you-need-to-know-about-tree-data-structures-bceacb85490c/)

[Data Structure and Algorithms Made Easy](https://www.google.com/search?q=data+structures+and+algorithms+made+easy)