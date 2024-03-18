import java.io.File

// Inspirerad av "https://github.com/guelo/adventOfCode2020/blob/master/src/main/kotlin/day1/Day1.kt"
fun main() {
    val file = File("src/main/kotlin/AOC/AOC_2020Day1/2020Day1input.txt")
    val input = HashSet(file.readLines().map { it.toInt() })

    fun addUpto(total: Int) = input.filter { input.contains(total - it) }

    fun threeAddUpTo(total: Int) = input.filter { addUpto(total - it).isNotEmpty() }

    // part 1
    println(addUpto(2020).let { it[0] * it[1] })
    // part2
    println(threeAddUpTo(2020).let { it[0] * it[1] * it[2] })
}