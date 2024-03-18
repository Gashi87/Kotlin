package AOC.AOC_2017Day1
import java.io.File
//  Inspirerad av Jan Bina "https://github.com/janbina/advent-of-code-2017/blob/master/src/Day01.kt"

fun part1(input: String): Int {
    return (input + input.first())
        .zipWithNext()
        .filter { it.first == it.second }
        .sumBy { it.first.toString().toInt() }
}

fun part2(input: String): Int {
    return input
        .zip(input.substring(input.length / 2) + input)
        .filter { it.first == it.second }
        .sumBy { it.first.toString().toInt() }
}

fun main() {
    val data: List<String> =
        File("src/main/kotlin/AOC/AOC_2017Day1/2017Day1input.txt").readLines()


    val input = data.first()

    val part1Result = part1(input)
    println("Part 1: $part1Result")

    val part2Result = part2(input)
    println("Part 2: $part2Result")
}
