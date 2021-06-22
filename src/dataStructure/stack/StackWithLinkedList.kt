package dataStructure.stack

class StackWithLinkedList<T> {
    inner class Node<T>(val data: T) {
        var next: Node<T>? = null
    }

    private var top: Node<T>? = null

    fun push(data: T) {
        val node = Node(data)
        if (isEmpty()) {
            top = node
        } else {
            //remember, Stack is LIFO
            //every time new element is added, current top element becomes a previous top
            node.next = top
            top = node
        }
    }

    fun pop(): T {
        //LIFO
        if(isEmpty()) throw NoSuchElementException()
        val result = top!!.data
        top = top?.next
        return result
    }

    fun isEmpty(): Boolean = top == null

    fun peek(): T {
        if (isEmpty()) throw NoSuchElementException()
        return top!!.data
    }

}