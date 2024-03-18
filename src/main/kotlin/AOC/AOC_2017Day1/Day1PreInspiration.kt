package AOC.AOC_2017Day1
import java.io.File
import java.util.*

/* Del 1
Denna funktion tar en sträng (sequence) och loopar genom varje siffra.
Den jämför varje siffra med nästa siffra i sekvensen och adderar siffran till summan om de är lika.
Funktionen returnerar den beräknade summan.
 */

fun calculateSum(sequence: String): Int {
    var sum = 0
    for (i in sequence.indices) {
        if (sequence[i] == sequence[(i + 1) % sequence.length]) {
            sum += sequence[i].toString().toInt()
        }
    }
    return sum
}

/* Del 2
Denna funktion tar in en sträng (input) och loopar genom första halvan av siffrorna.
Den jämför varje siffra med siffran på motsatt position genom sekvensen och adderar dubbla värdet av siffran till summan om de är lika.
Funktionen returnerar den beräknade summan.
 */
fun getHalfwaySum(input: String): Int {
    var sum = 0
    val halfway = input.length / 2
    for (i in 0 until halfway) {
        val current = input[i]
        val opposite = input[i + halfway]
        if (current == opposite) {
            sum += 2 * current.toString().toInt()
        }
    }
    return sum
}

fun main() {
    val data: List<String> = File("src/main/kotlin/AOC/AOC_2017Day1/2017Day1input.txt").readLines()
    val sequence = data.first()

    val sum = calculateSum(sequence)
    println("Sum: $sum")

    val halfwaySum = getHalfwaySum(sequence)
    println("Halfway sum: $halfwaySum")
}


