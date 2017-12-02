import java.io.File

fun main(args: Array<String>) {
    val text = File("input/day1.txt").readText()
    println(Day1.process(text))
}

object Day1 {

    fun process(text: String): String {
        val integers = text.map { it.toString().toInt() }
        val list = integers + integers.subList(0, integers.size / 2)
        val set = list.windowed(integers.size / 2 + 1, transform = {
            Pair(it.first(), it.last())
        })

        val sum = set.filter { it.first == it.second }.map { it.first }.sum()

        return sum.toString()
    }

}
