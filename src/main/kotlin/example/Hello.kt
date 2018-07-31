package example

fun main(args: Array<String>) {
    val set1 = setOf(1, 2, 3, 4)
    val set2 = setOf(3, 5, 7)

    println("plus: " + set1.plus(set2))
    println("minus: " + set1.minus(set2))
    println("intersect: " + set1.intersect(set2))
    println("union: " + set1.union(set2))

}

