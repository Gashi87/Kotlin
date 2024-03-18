package AOC.AOC_2017Day1
import java.io.File

fun calculateSum(input: String, part: Int): Int {
    var sum = 0
    val halfway = input.length / 2
    for (i in input.indices) {
        val current = input[i]
        val compareIndex = if (part == 1) (i + 1) % input.length else (i + halfway) % input.length
        val opposite = input[compareIndex]
        if (current == opposite) {
            sum += current.toString().toInt()
        }
    }
    return sum
}

fun main() {
    val data: List<String> = File("src/main/kotlin/AOC/AOC_2017Day1/2017Day1input.txt").readLines()
    val input = data.first()

    val part1Result = calculateSum(input, 1)
    println("Part 1: $part1Result")

    val part2Result = calculateSum(input, 2)
    println("Part 2: $part2Result")
}
