import java.io.File

fun main(args: Array<String>) {
    val text = File("input/day6.txt").readText()
    println(Day6.process(text))
}

object Day6 {

    fun process(text: String): String {
        var banks = text.split("\t").map(String::toInt)
        val configurations = mutableListOf<List<Int>>()
        var cycles = 0

        while (!configurations.contains(banks)) {
            configurations.add(banks)
            banks = nextMemory(banks)
            cycles++
        }


        return cycles.toString()
    }

    private fun nextMemory(banks: List<Int>): List<Int> {
        val nextBanks = banks.toMutableList()

        val blocks = banks.max()!!
        var index = banks.indexOf(blocks)
        nextBanks[index] = 0

        (index + 1 .. blocks + index).forEach {
            nextBanks[it % banks.size]++
        }

        return nextBanks
    }

}
