package AOC.AOC_2018Day1
import java.io.File

class Day012018(rawInput: List<String>) {

    private val input: List<Int> = rawInput.map(String::toInt)

    fun solvePart1(): Int = input.sum()

    fun solvePart2(): Int {
        val frequencies = mutableSetOf(0)
        var sum = 0
        var index = 0

        while (true) {
            sum += input[index]
            if (!frequencies.add(sum)) {
                return sum
            }
            index = (index + 1) % input.size
        }
    }
}

fun main() {
    val data: List<String> = File("src/main/kotlin/AOC/AOC_2018Day1/2018Day1Input.txt").readLines()

    val day01 = Day012018(data)

    val part1Result = day01.solvePart1()
    val part2Result = day01.solvePart2()

    println("Part 1 result: $part1Result")
    println("Part 2 result: $part2Result")
}
