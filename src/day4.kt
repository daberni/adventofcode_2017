import java.io.File

fun main(args: Array<String>) {
    val text = File("input/day4.txt").readText()
    println(Day4.process(text))
}

object Day4 {

    fun process(text: String): String {
        val lines = text.split("\n")

        val valids = lines.count(this::isValid)

        return valids.toString()
    }

    fun isValid(text: String): Boolean {
        return text.split(" ").groupBy { it }.all { it.value.size == 1 }
    }
}
