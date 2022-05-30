# Search algorithm
- Find something within data structure
    - max value from array
    - min value from array
- example
    - Linear algorithm
        - Start from the start
        - O(n)
    - Using hashmap
        - O(1)
    
## Binary Search
- `Find value from an ordered list or array`
- For each step, range is divided by half
- An example of divide-and-conquer
- `If data is sorted, it's good to find better algorithm`

1. Find mid
2. If value at mid is less or greater than a value that we look for, confine area(left or right)
3. Repeat 1,2 until we find value