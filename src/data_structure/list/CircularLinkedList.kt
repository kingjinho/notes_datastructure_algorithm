package data_structure.list

import java.lang.IndexOutOfBoundsException

class CircularLinkedList<T> {

    val head = Node<T>()
    var length = 0

    class Node<T>(var value: T? = null) {
        var next: Node<T>? = null
    }


    fun addFirst(value: T) {
        addAt(0, value)
    }

    fun addLast(value: T) {
        addAt(length, value)
    }

    fun addAt(index: Int, value: T) {
        if (isInvalidIndex(index)) {
            throw IndexOutOfBoundsException("cannot add, current Length: $length, index: $index")
        }

        val newElement = Node(value)
        var count = if (index == 0) length else index
        var temp = head.next

        when (index) {
            0 -> {
                head.next = newElement
                newElement.next = temp
                if (isEmpty()) {
                    newElement.next = newElement
                    length++
                    return
                }
                //added, but still length is not added
                while (--count > 0) {
                    temp = temp?.next
                }
                temp?.next = newElement
            }
            else -> {
                while (--count > 0) {
                    temp = temp?.next
                }
                val next = temp?.next
                temp?.next = newElement
                newElement.next = if (length == index) head.next else next
            }
        }
        length++
    }

    fun removeFirst() {
        removeAt(0)
    }

    fun removeLast() {
        removeAt(length - 1)
    }

    fun removeAt(index: Int) {
        if (isInvalidIndex(index) || length == 0) {
            throw IndexOutOfBoundsException("cannot remove, current Length: $length, index: $index")
        }

        var temp = head.next
        var count = if (index == length || index == 0) length else index

        when (index) {
            0 -> {
                if (length == 1) {
                    head.next = null
                    length--
                    return
                }
                val next = temp?.next
                head.next = next
                //by the time head.next changed, the length of the linked list decreases
                while (--count > 0) {
                    temp = temp?.next
                }
                temp?.next = head.next
            }
            else -> {
                while (--count > 0) {
                    temp = temp?.next
                }
                val nodeAtIndex = temp?.next
                val next = nodeAtIndex?.next
                temp?.next = next
            }
        }

        length--
    }

    fun firstElement(): Node<T>? {
        return elementAt(0)
    }

    fun lastElement(): Node<T>? {
        return elementAt(length - 1)
    }

    fun elementAt(index: Int): Node<T>? {
        var temp = head.next
        var count = index
        while (count > 0) {
            count--
            temp = temp?.next
        }
        return temp
    }

    fun length() = length

    fun isEmpty() = length == 0

    fun isInvalidIndex(index: Int) = index < 0 || index > length


    private fun printElement(node: Node<T>?) {
        println(node!!.value)
        if (hasNext(node)) {
            printElement(node.next)
        }
    }

    fun printAll() {
        if (length == 0) {
            println("Length of Circular linked list is 0")
            return
        }
        printElement(head.next)
    }

    fun hasNext(element: Node<T>?) = element?.next != head.next
}