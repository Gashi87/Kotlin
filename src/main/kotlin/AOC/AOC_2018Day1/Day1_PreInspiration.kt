package AOC.AOC_2018Day1

import java.io.File

fun del1Lösning(){
    val items = File("src/main/kotlin/AOC/AOC_2018Day1/2018Day1Input.txt").readLines().map { it.toInt() }

    val results = items.reduce { a, b -> a + b }
    println(results)
}
fun del2Lösning() {
    var sum = 0
    var values = File("src/main/kotlin/AOC/AOC_2018Day1/2018Day1Input.txt").readLines().map { it.toInt() }
    val seen: MutableSet<Int> = mutableSetOf()
    while (!seen.contains(sum)) {
        seen.add(sum)
        if (values.isEmpty()) {
            values = File("src/main/kotlin/AOC/AOC_2018Day1/2018Day1Input.txt").readLines().map { it.toInt() }
        }
        sum = sum + values[0]
        values = values.drop(1)
    }
    println(sum)
}
fun main() {
    println(del1Lösning())

    println(del2Lösning())
}