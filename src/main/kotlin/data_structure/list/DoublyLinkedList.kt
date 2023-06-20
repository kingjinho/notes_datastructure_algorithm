package data_structure.list

import java.lang.IndexOutOfBoundsException

class DoublyLinkedList<T> {

    private val head = Node<T>().apply {
        prev = null
    }

    private var length = 0

    class Node<T>(var value: T? = null) {

        var prev: Node<T>? = null
        var next: Node<T>? = null
    }


    fun addFirst(value: T) {
        addAt(0, value)
    }

    fun removeFirst() {
        removeAt(0)
    }

    fun addLast(value: T) {
        addAt(if (length == 0) 0 else length, value)
    }

    fun removeLast() {
        removeAt(length - 1)
    }

    fun addAt(index: Int, value: T) {
        indexCheck(index)
        val newElement = Node(value)
        var count = index
        var temp = head.next

        when (index) {
            0 -> {
                head.next = newElement
                newElement.prev = head
                newElement.next = temp
                temp?.prev = newElement
            }
            else -> {
                while (--count > 0) {
                    temp = temp?.next
                }
                val next = temp?.next
                newElement.next = next
                newElement.prev = temp
                temp?.next = newElement
                next?.prev = newElement
            }
        }
        length++
    }

    fun removeAt(index: Int) {
        indexCheck(index)
        if (length == 0) {
            throw IndexOutOfBoundsException("Current length: $length, index: $index")
        }
        var temp = head.next
        var count = index

        when (index) {
            0 -> {
                head.next = temp?.next
                temp?.prev = head
            }
            else -> {
                while (--count > 0) {
                    temp = temp?.next
                }
                val next = temp?.next?.next
                temp?.next = next
                next?.prev = temp
            }
        }
        length--
    }

    fun elementAt(index: Int): Node<T>? {
        indexCheck(index)
        var count = index
        var temp = head.next
        while (--count > 0) {
            temp = temp?.next
        }
        return temp?.next
    }

    fun firstElement() = elementAt(0)

    fun lastElement() = elementAt(length - 1)


    fun length() = length

    private fun indexCheck(index: Int) {
        if (index < 0 || index > length) {
            throw IndexOutOfBoundsException("Current length: $length, index: $index")
        }
    }
}