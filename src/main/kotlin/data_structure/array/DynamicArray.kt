package data_structure.array

import java.lang.IndexOutOfBoundsException
import java.lang.StringBuilder
import java.lang.UnsupportedOperationException
import kotlin.Array

class DynamicArray<T : Any> : Iterable<T> {

    private var arr: Array<T>? = null
    private var len = 0 //length user thinks array is
    private var capacity = 0 //actual array size
    companion object{
        const val DEFAULT_CAPACITY = 10
    }

    constructor() : this(DEFAULT_CAPACITY)

    constructor(capacity: Int) {
        if (capacity < 0) throw IllegalArgumentException("Illegal Capacity: $capacity")
        this.capacity = capacity
        arr = createEmptyArray(capacity)
    }

    fun get(index: Int): T {
        if (index < 0 || index >= len) throw IndexOutOfBoundsException()
        return arr?.get(index)!!
    }

    fun set(index: Int, value: T) {
        if (index < 0 || index >= len) throw IndexOutOfBoundsException()
        arr!![index] = value
    }

    fun clear() {
        capacity = DEFAULT_CAPACITY
        len = 0
        arr = createEmptyArray(capacity)
    }

    fun add(data: T) {
        if (len + 1 >= capacity) {
            capacity = if (capacity == 0) {
                1
            } else {
                capacity * 2
            }
            val newArr = createEmptyArray(capacity)
            for (i in arr?.indices!!) {
                newArr[i] = arr!![i]
            }
            arr = newArr
        }
        arr!![len++] = data
    }

    private fun createEmptyArray(size: Int) = arrayOfNulls<Any>(size) as Array<T>


    fun remove(obj: T): Boolean {
        val index = indexOf(obj)
        if(index == -1)
            return false
        removeAt(index)
        return true
    }

    fun removeAt(index: Int) : T {
        if(index >= len || index < 0) throw IndexOutOfBoundsException()
        val data = arr!![index]
        val newArr = createEmptyArray(--len)
        for(i in 0 until len) {
            var j = i
            if(i >= index) j++
            newArr[i] = arr!![j]
        }
        arr = newArr
        return data
    }

    fun indexOf(obj: T): Int {
        for (i in 0 until len) {
            if (arr!![i] == obj) {
                return i
            }
        }
        return -1
    }

    fun contains(obj: T) = indexOf(obj) != -1

    fun size() = len

    fun isEmpty() = size() == 0

    override fun iterator() = object : MutableIterator<T> {
        var index = 0

        override fun hasNext() = index < len


        override fun next() = arr!![index]

        override fun remove() {
            throw UnsupportedOperationException()
        }
    }

    override fun toString(): String {
        return if(isEmpty()){
            "[]"
        } else {
            var sb = StringBuilder(len).append("[")
            for(i in 0 until len - 1) {
                sb.append("${arr!![i]}, ")
            }
            sb.append("${arr!![len-1]} ]" ).toString()
        }
    }
}