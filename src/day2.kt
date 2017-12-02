import java.io.File
import java.util.regex.Pattern

fun main(args: Array<String>) {
    val text = File("input/day2.txt").readText()
    println(Day2.process(text))
}

object Day2 {

    fun process(text: String): String {
        val lines = text.split("\n")

        val checksum = lines.map {
            val strings = it.split(Pattern.compile("\\s")).filter { it.isNotEmpty() }
            val numbers = strings.map { it.trim().toInt() }
            val difference = numbers.max()!! - numbers.min()!!
            difference
        }.sum()

        return checksum.toString()
    }

}
