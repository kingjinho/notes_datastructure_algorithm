package data_structure.hash_table

class HashMap<K, V> {

    companion object {
        class Entry<K, V>(
            private val hash: Int,
            private val index: Int,
            private val key: K,
            private var value: V,
            private var next: Entry<K, V>?
        )
    }

    private var bucket: Array<Entry<K, V>?>

    constructor() : this(10)

    constructor(size: Int) {
        assert(size > 0) { println("Size should be greater than 0") }
        bucket = arrayOfNulls<Entry<K, V>>(size)
    }

    fun put(key: K, value: V) {
        if (bucket[bucket.lastIndex] != null) {
            increaseBucket()
        }
        val hash = key.hashCode()

    }

    fun remove(key: K) {

    }

    fun replace(key: K, value: V) {
        put(key, value)
    }

    fun get(key: K) {
        val hash = key.hashCode()
        val index =
    }

    private fun increaseBucket() {
        val bucket = this.bucket
        this.bucket = arrayOfNulls<Entry<K, V>>(bucket.size + bucket.size shr 1)
        for (index in bucket.indices) {
            this.bucket[index] = bucket[index]
        }
    }

}