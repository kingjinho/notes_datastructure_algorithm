package algorithms.recursive

fun main() {

    val array = intArrayOf(9,8,7,6,5)
    algorithms.sort.quickSort(array, 0, 4)
    println(array.toString())
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

