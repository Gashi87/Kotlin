package AOC.AOC_2020Day1

import java.io.File
// Inspirerad av "https://todd.ginsberg.com/post/advent-of-code/2018/day1/"
class Day01(rawInput: List<String>) {

    private val input: List<Int> = rawInput.map { it.toInt() }

    fun solvePart1(): Int =
        input.sum()

    fun solvePart2(): Int {
        val frequencies = mutableSetOf(0)
        var sum = 0
        return input.toInfiniteSequence()
            .map {
                sum += it
                sum
            }
            .first { !frequencies.add(it) }
    }

    private fun <T> List<T>.toInfiniteSequence(): Sequence<T> = sequence {
        if (this@toInfiniteSequence.isEmpty()) {
            return@sequence
        }
        while (true) {
            yieldAll(this@toInfiniteSequence)
        }
    }
}
fun main() {
    val data: List<String> =
        File("src/main/kotlin/AOC/AOC_2018Day1/2018Day1Input.txt").readLines()

    val day01 = Day01(data)

    val part1Result = day01.solvePart1()
    val part2Result = day01.solvePart2()

    println("Part 1 result: $part1Result")
    println("Part 2 result: $part2Result")
}



