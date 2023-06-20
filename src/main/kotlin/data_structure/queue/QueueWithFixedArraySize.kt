package data_structure.queue

enum class Result {
    FULL,
    EMPTY,
    SUCCESS
}

class QueueWithArray2 {

    private val initialIndex = -1
    private val array = IntArray(10)
    private var front = initialIndex
    private var rear = initialIndex

    fun enqueue(value: Int): Pair<Boolean, Result> {
        //if array is full
        if ((rear + 1) % size() == front) {
            return Pair(false, Result.FULL)
        }

        //starting
        if (front == initialIndex) {
            front++
        }
        array[++rear % size()] = value
        return Pair(true, Result.SUCCESS)
    }

    fun dequeue(): Pair<Boolean, Int> {
        if (isEmpty()) {
            return Pair(false, Int.MAX_VALUE)
        }
        val temp = array[front]
        array[front] = Int.MAX_VALUE

        //if only one element
        if (rear == front) {
            rear = initialIndex
            front = initialIndex
        } else {
            front = (front + 1) % size()
        }

        return Pair(true, temp)
    }

    fun isEmpty() = front == initialIndex

    fun isFull() = (rear + 1) % size() == front

    fun front() : Int {
        if (isEmpty()) {
            throw NoSuchElementException()
        }
        return array[front]
    }

    fun size() = array.size
}