import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println(Day3.process("325489"))
}

object Day3 {

    fun process(text: String): String {
        val field = text.toInt()
        val order = ceil(0.5 * (sqrt(field.toDouble()) - 1)).toInt()
        val baseValue =  (1 + 2 * (order - 1)).toDouble().pow(2).toInt()

        val firstShortest = baseValue + order
        val secondShortest = firstShortest + order * 2
        val thirdShortest = secondShortest + order * 2
        val fourthShortest = thirdShortest + order * 2
        val shortests = listOf(firstShortest, secondShortest, thirdShortest, fourthShortest)

        val additionalDistance = shortests.map { Math.abs(field - it) }.min()!!

        val totalDistance = order + additionalDistance

        return totalDistance.toString()
    }

}
