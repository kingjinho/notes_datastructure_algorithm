package algorithms.recursive

fun step(steps: Int): Int {
    return if(steps < 0) {
        0
    } else if(steps == 1 || steps == 0) {
        1
    } else {
        step(steps - 1) + step(steps - 2) + step(steps - 3)
    }
}