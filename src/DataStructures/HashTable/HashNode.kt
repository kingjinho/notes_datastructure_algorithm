package DataStructures.HashTable

class HashNode<K,V>(var key: K, var value: V) {
    lateinit var next : HashNode<K, V>
}