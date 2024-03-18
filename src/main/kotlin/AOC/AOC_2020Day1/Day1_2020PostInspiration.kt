package AOC.AOC_2020Day1

import java.io.File

fun main() {
    val input = HashSet(File("src/main/kotlin/AOC/AOC_2020Day1/2020Day1input.txt").readLines().map { it.toInt() })

    fun findNumbers(total: Int, n: Int) = input.toList().combinations(n).find { it.sum() == total }

    findNumbers(2020, 2)?.let { println("Resultat Part 1: ${it.reduce(Int::times)}") } ?: println("Inga två poster hittades som summerar till 2020")
    findNumbers(2020, 3)?.let { println("Resultat Part 2: ${it.reduce(Int::times)}") } ?: println("Inga tre poster hittades som summerar till 2020")
}

fun <T> List<T>.combinations(n: Int): List<List<T>> = if (n == 0) listOf(emptyList()) else flatMapIndexed { index, element -> subList(index + 1, size).combinations(n - 1).map { it + element } }
