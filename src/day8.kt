import java.io.File

fun main(args: Array<String>) {
    val text = File("input/day8.txt").readText()
    println(Day8.process(text))
}

object Day8 {

    fun process(text: String): String {
        val instructions = text.split("\n").map {
            val parts = it.split(" ")
            Instruction(parts[0], parts[1], parts[2].toInt(), parts[4], parts[5], parts[6].toInt())
        }

        val registers = mutableMapOf<String, Int>()
        instructions.forEach {
            val conditionalRegisterValue = registers.getOrPut(it.conditionRegister, { 0 })
            val conditionMet = when (it.condition) {
                "<" -> conditionalRegisterValue < it.conditionValue
                "<=" -> conditionalRegisterValue <= it.conditionValue
                "==" -> conditionalRegisterValue == it.conditionValue
                ">=" -> conditionalRegisterValue >= it.conditionValue
                ">" -> conditionalRegisterValue > it.conditionValue
                "!=" -> conditionalRegisterValue != it.conditionValue
                else -> throw IllegalArgumentException(it.condition)
            }

            val value = registers.getOrPut(it.register, { 0 })
            if (conditionMet) {
                when (it.instruction) {
                    "inc" -> registers.put(it.register, value + it.value)
                    "dec" -> registers.put(it.register, value - it.value)
                }
            }
        }

        return registers.maxBy { it.value }!!.value.toString()
    }
}

data class Instruction(val register: String, val instruction: String, val value: Int, val conditionRegister: String, val condition: String, val conditionValue: Int)

