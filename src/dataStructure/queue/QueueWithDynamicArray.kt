package dataStructure.queue

class QueueWithDynamicArray {

    private val initialIndex = -1
    private var array = IntArray(10)
    private var front = initialIndex
    private var rear = initialIndex

    fun enqueue(value: Int) {
        if (isFull()) {
            resize()
        }

        if (front == initialIndex) {
            front++
        }
        array[++rear % size()] = value

    }

    fun dequeue(): Int {
        if (isEmpty()) {
            throw StackUnderFlowError()
        }
        val value = array[front]
        array[front] = Int.MAX_VALUE

        if (front == rear) {
            front = initialIndex
            rear = initialIndex
        } else {
            front = (front + 1) % size()
        }
        return value
    }

    fun isEmpty() = front == initialIndex
    fun isFull() = (rear + 1) % size() == front
    fun size() = array.size


    private fun resize() {
        val initialCapacity = array.size
        var temp = IntArray(array.size * 2)

        //in case of where front < rear, we don't need
        if (front > rear) {
            for (i in 0 until front) {
                temp[i + initialCapacity] = array[i]
                temp[i] = Int.MAX_VALUE
            }
            rear += initialCapacity
        }
        array = temp
    }

}

class StackUnderFlowError : Exception()