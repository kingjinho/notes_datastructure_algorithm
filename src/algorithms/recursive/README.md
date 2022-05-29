# Recursive

## Tail Recursive

1. Tail call
    - Call another function at the end of a function
      - No other call after a function
    - `Tail call and stack frame`
        - Why does stack frame exist?
            - To save data using
        - in Tail call case, a function has no further execution
        - thus, tail call does not use data saved in previous stack frame
        - Compiler use optimization to not create stack frame
            - Up to compiler, But jvm does not support tail call optimization
   
2. Tail Recursive
   - `Factorial recursive is not tail recursive`
    ```kotlin
    fun getCount(num: Int): Int {
        return if(num > 1)
            num * getCount(num - 1)
        else
            1
    }
    ```    
    - It is at the end of a function, but this is not the last thing a function does
        - `has to multiply by n`
        - `n is still in stack frame`
    - 
    ```kotlin
      private fun tailRecursive(n: Int, fac: Int): Int {
         return if(n > 1)
            tailRecursive(n - 1, n * fac)
         else
            fac
      }
     
      ```
   - Less intuitive than normal recursive
   - Use it to optimize(overhead of stack frame)
   - Easy to convert it to for loop
    