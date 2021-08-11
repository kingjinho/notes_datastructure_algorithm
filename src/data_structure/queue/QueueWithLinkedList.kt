package data_structure.queue

import java.lang.Exception

class QueueWithLinkedList {

    inner class Node(val value: Int) {
        var prev: Node? = null
    }

    private var front: Node? = null
    private var rear: Node? = null


    fun enqueue(value: Int) {
        val node = Node(value)

        when {
            isEmpty() -> {
                //for the first time
                front = node
                rear = front
                return
            }
            rear!!.prev == null -> {
                //second
                rear = node
                rear!!.prev = front
            }
            else -> {
                //the rest
                node.prev = rear!!
                rear = node
            }
        }
    }

    fun dequeue(): Int {
        //isEmpty check
        if (isEmpty()) {
            throw Exception("UnderFlow")
        }
        val temp = front!!.value
        front = front?.prev!!
        return temp
    }

    fun isEmpty() = front == null && rear == null

    fun size(): Int = 0

}