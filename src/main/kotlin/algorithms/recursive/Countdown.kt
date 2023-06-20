package algorithms.recursive

fun countdown(number: Int) {
    if(number > 0) {
        println(number)
        countdown(number - 1)
    }
}