package algorithms.recursive

fun main() {

    val i = 100000
    val factorialWithRecursive: Int = generalRecursive(i)
    val factorialWithTailRecursive = tailRecursive(i, 0)

    println(factorialWithRecursive)
    println(factorialWithTailRecursive)

}

private fun generalRecursive(num: Int): Int {
    return if(num > 1)
        num + generalRecursive(num - 1)
    else
        1
}

private fun tailRecursive(n: Int, fac: Int): Int {
    return if(n >= 1)
        tailRecursive(n - 1, n + fac)
    else
        fac
}

