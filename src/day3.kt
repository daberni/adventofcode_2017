import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println(Day3.process("100"))
}

object Day3 {

    fun process(text: String): String {
        val field = text.toInt()


        val chain = buildChain(field)
        return chain.toString()


        val order = ceil(0.5 * (sqrt(field.toDouble()) - 1)).toInt()
        val baseValue = baseValueOfOrder(order)

        val firstShortest = baseValue + order
        val secondShortest = firstShortest + order * 2
        val thirdShortest = secondShortest + order * 2
        val fourthShortest = thirdShortest + order * 2
        val shortests = listOf(firstShortest, secondShortest, thirdShortest, fourthShortest)

        val additionalDistance = shortests.map { Math.abs(field - it) }.min()!!

        val totalDistance = order + additionalDistance

        return totalDistance.toString()
    }


    private fun buildChain(value: Int): List<Int> {

        var current = 1
        var order = 1
        var position = 0

        var index = 1
        val chain = mutableListOf(1)
        while (current < value) {
            if (index == order * 2 * 4) {
                order++
                position = 0


                /*
            } else if ((position - 1) % (order * 2) == 0) {
                position++
                chain[index - 2] + chain[index - 1]
                */
            } else {
                position++
            }

            val boxLength = order * 2 * 4
            val previousBoxLength = (order - 1) * 2 * 4

            current = when {
                chain.size > 1 -> chain[index - 2] + chain[index - 1]
                chain.size > 0 -> chain[index - 1]
                else -> throw IllegalStateException()
            }
            chain.add(index++, current)
        }

        return chain.toList()
    }

    private fun baseValueOfOrder(order: Int) = (1 + 2 * (order - 1)).toDouble().pow(2).toInt()

}
