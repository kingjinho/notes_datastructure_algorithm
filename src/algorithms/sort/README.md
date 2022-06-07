# Sort

- Why sort?
    - `to use more efficient algorithm`
    - to read better
- Stability of sort algorithm
    - a.k.a Do data with same key change after sort?
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
- `Compare adjacent two and sort`
- `As iterating through an array, the biggest(or smallest) element will move to the end(or front)`
- Stable

![bubble sort](./res/bubble-sort.gif)

## Selection sort

- The easiest
- `Not stable because it can possibly move first index with same value to the last`
- `remember index and after each round, swap`
- Select an index which contains smallest(or largest) and swap
- space, time complexity: same as bubble

![selection sort](./res/selection-sort.gif)

## Insertion sort

- Go through the indices that had previously visited from big to small
    - While going through indices(n-1 to 0), compare and swap
    - if swap does not occur, skip all the following iteration
- Stable

![insertion sort](./res/insertion-sort.gif)

## Quick sort

- widely used
- unstable
- divide-and-conquer
- recursive

## Merge sort

- `Merge sorted arrays`
- Should not sort original array
- `divide array recursively until sub-array contains only 1 element, and merge`
![merge sort](./res/merge-sort.gif)