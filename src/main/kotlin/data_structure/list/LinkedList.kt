package data_structure.list

import java.lang.IndexOutOfBoundsException

class LinkedList<T> {

    private val head = Node()
    private var length = 0

    private inner class Node(var value: T? = null) {
        var next: Node? = null
    }

    fun addFirst(value: T) {
        val node = Node(value)
        val temp = head.next
        head.next = node
        node.next = temp
        length++
    }

    fun removeFirst() {
        if (length == 0) {
            throw IndexOutOfBoundsException("Current Length : $length")
        }
        val first = head.next
        val second = first!!.next
        head.next = second
        length--
    }

    fun addLast(value: T) {
        var temp = head.next
        if (temp == null) {
            addFirst(value)
            return
        }
        val newElement = Node(value)

        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = newElement
        length++
    }

    fun removeLast() {
        if (length == 0) {
            throw IndexOutOfBoundsException("Current Length : $length")
        }
        if (length == 1) {
            removeFirst()
            return
        }
        var temp = head.next
        var index = length
        while (--index > 1) {
            temp = temp?.next
        }
        temp?.next = null
        length--
    }

    fun addAt(index: Int, value: T) {
        val lastIndex = findLastIndex()
        if (index < 0 || index > lastIndex + 1 || length == 0) {
            throw IndexOutOfBoundsException("Current Length : $length, Index requested : $index")
        }
        when (index) {
            0 -> addFirst(value)
            lastIndex + 1 -> addLast(value)
            else -> {
                var count = index
                var temp = head.next
                val newElement = Node(value)
                while (--count != 0) {
                    temp = temp?.next
                }
                val prevNext = temp?.next
                temp?.next = newElement
                newElement.next = prevNext
            }
        }
        length++
    }

    fun removeAt(index: Int) {
        var lastIndex = findLastIndex()
        if (index < 0 || index > lastIndex || length == 0) {
            throw IndexOutOfBoundsException("Current Length : $length, Index requested : $index")
        }
        when(index) {
            0 -> removeFirst()
            lastIndex -> removeLast()
            else -> {
                var prev = head.next
                while(--lastIndex > 1) {
                    prev = head.next
                }
                val next = prev?.next?.next
                prev?.next = next
            }
        }
    }

    private fun findLastIndex() = length - 1

    fun get() {

    }

    fun length() = length
}