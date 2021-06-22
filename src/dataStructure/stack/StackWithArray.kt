package dataStructure.stack

class StackWithArray {
    private val size = 1000
    private val arr = IntArray(size)
    private var top = -1

    fun pop(): Pair<Boolean, Int> {
        if(top == -1) {
            return Pair(false, Int.MAX_VALUE)
        }
        return Pair(true, arr[top--])
    }

    fun push(num : Int): Pair<Boolean, Int> {
        if(top == arr.size - 1) {
            return Pair(false, Int.MAX_VALUE)
        }
        arr[top++] = num
        return Pair(true, top)
    }

    fun isEmpty(): Boolean = top == -1

    fun peek(): Int {
        return when (top) {
            -1 -> Int.MAX_VALUE
            else -> arr[top]
        }
    }
}