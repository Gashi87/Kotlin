package AOC.AOC_2020Day1
import java.io.File

fun findPair(input: Set<Int>, total: Int) = input.mapNotNull { number ->
    val complement = total - number
    if (complement in input) number to complement else null
}.firstOrNull()

fun findTriplet(input: Set<Int>, total: Int) = input.mapNotNull { number ->
    findPair(input, total - number)?.let { (num1, num2) ->
        Triple(number, num1, num2)
    }
}.firstOrNull()

fun main() {
    val file = File("src/main/kotlin/AOC/AOC_2020Day1/2020Day1input.txt")
    val input = HashSet(file.readLines().map { it.toInt() })

    // part 1
    findPair(input, 2020)?.let { (num1, num2) ->
        println("Resultat Part 1: ${num1 * num2}")
    } ?: println("Inga två poster hittades som summerar till 2020")

    // part 2
    findTriplet(input, 2020)?.let { (num1, num2, num3) ->
        println("Resultat Part 2: ${num1 * num2 * num3}")
    } ?: println("Inga tre poster hittades som summerar till 2020")
}
