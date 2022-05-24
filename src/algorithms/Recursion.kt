package algorithms

fun main() {

    val i = 10
    val cntElement: Int = getCount(i)

    print(cntElement)

}

fun getCount(num: Int): Int {
    return if(num > 1)
        num * getCount(num - 1)
    else
        1
}