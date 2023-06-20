# What is Queue?
- An ordered linear list that insertion happens on one end and deletion happens on the other end
- FIFO
- Stack -> LIFO

- Similar to stack
    - Cannot access random elements in the queue

- Two Operation
  1. Enqueue - Insert
  2. Dequeue - Delete

- `Popping element from the front, pushing element from the back`

## Big-O Notation

1. Search
    - `Find value, not getting the value at x index`
    - O(n) on average
2. Insert
    - `Pushing the element from the back(rear)`
    - O(1) on average
3. Delete
    - `Popping element from the front`
    - O(1) on average



## Priority Queue
1. Abstract Data Type
2. Similar to regular queue, but each element additionally has a "priority"
3. An element with high priority is served before an element with low priority
4. Often implemented with heaps, but they are conceptually different
   - Why using heaps? improve performance of insertion and deletion(log n)
   - Linked list, Array, Heap 
5. ADT
    - isEmpty( )
    - insertWithPriority( )
    - pullHighestPriority( ): Remove
6. Difference between regular Queue and Priority Queue
    - The ordering is intrinsic
    - The shortest path algorithms: Dijkstra's algorithm
7. Usage
    - Job Scheduling
8. Two types
    - Ascending Priority Queue
    - Descending Priority Queue
    - These are based on which priority we should deal with first

    