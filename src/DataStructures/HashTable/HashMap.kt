package DataStructures.HashTable

class HashMap<K, V> {
    var bucket = arrayListOf<HashNode<K, V>>()

    val numBuckets = 10;
    var size: Int = 0

    constructor() {
        for (num in 0..numBuckets) {
            bucket.add(null)
        }
    }
}