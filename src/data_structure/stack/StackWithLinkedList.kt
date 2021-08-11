package data_structure.stack

class StackWithLinkedList<T> {
    inner class Node<T>(val value: T) {
        var prev: Node<T>? = null
    }

    private var top: Node<T>? = null

    fun push(value: T) {
        val node = Node(value)
        if (isEmpty()) {
            top = node
        } else {
            //remember, Stack is LIFO
            //every time new element is added, current top element becomes a previous top
            node.prev = top
            top = node
        }
    }

    fun pop(): T {
        //LIFO
        if(isEmpty()) throw NoSuchElementException()
        val result = top!!.value
        top = top?.prev
        return result
    }

    fun isEmpty(): Boolean = top == null

    fun peek(): T {
        if (isEmpty()) throw NoSuchElementException()
        return top!!.value
    }

}