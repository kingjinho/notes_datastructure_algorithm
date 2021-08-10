package dataStructure.queue

import java.lang.Exception

class QueueWithArrayWithIssue {

    private val arr = IntArray(10)
    private var front = 0
    private var rear = 0


    fun enqueue(value: Int): Pair<Boolean, Int> {
        if (!isEmpty()) {
            return Pair(false, Int.MAX_VALUE)
        }
        arr[rear++] = value
        return Pair(true, value)
    }

    fun dequeue(): Pair<Boolean, Int> {
        if (isEmpty()) {
            return Pair(false, Int.MAX_VALUE)
        }
        val value = arr[front]
        arr[front++] = Int.MAX_VALUE
        return Pair(true, value)
    }

    fun front() = arr[front]

    fun size() = arr.size

    fun isEmpty() = rear == 0

}