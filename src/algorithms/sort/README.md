# Sort

- Why sort?
    - `to use more efficient algorithm`
    - to read better
- Stability of sort algorithm
    - Do data with same key change after sort
    - In general, it does not matter
        - People don't usually care about it
    - Some sort algorithms guarantee stability
        - Some don't
- Algorithms that must know how to implement and explain
    - Bubble sort
    - Selection sort

- Algorithms that at least know how to explain
    - Quick sort
    - Merge sort
    - Heap sort
    
## Algorithm comparison

|sort|average|worst|memory|stability|
|-------|-------|-----|------|---------|
|bubble|O(n^2)|O(n^2)|O(1) |O|
|selection|O(n^2)|O(n^2)|O(1) |X|
|insertion|O(n^2)|O(n^2)|O(1) |O|
|quick|O(N logN)|O(n^2)|O(logN)-recursive(stack) |X|
|merge|O(N logN)|O(N logN)|O(n)-heap|O|
|heap|O(N logN)|O(N logN)|O(1)|X|

## What algorithm to choose
- Quick in general
- Simple case: Bubble
- Can never be slow
    - Merge or Heap
    - These are slower than quick sort, but still O(n logN) on worst case


## Bubble sort
- The easiest
- Compare adjacent two and sort
- As iterating through an array, the biggest(or smallest) element will move to the end(or front)
- Stable

![bubble sort](./res/bubble-sort.gif)

