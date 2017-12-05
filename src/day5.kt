import java.io.File

fun main(args: Array<String>) {
    val text = File("input/day5.txt").readText()
    println(Day5.process(text))
}

object Day5 {

    fun process(text: String): String {
        val stack = text.split("\n")
        val numbers = stack.map(String::toInt).toMutableList()

        var turns = 0
        var currentIndex = 0
        while (currentIndex < numbers.size && currentIndex >= 0) {
            currentIndex = inBounds(numbers, currentIndex)
            turns++
        }

        return turns.toString()
    }

    private fun inBounds(numbers: MutableList<Int>, currentIndex: Int): Int {
        val offset = numbers[currentIndex]++
        return currentIndex + offset
    }

}
