import org.junit.Assert
import org.junit.Test

class Day8Test {

    @Test
    fun input1() {
        Assert.assertEquals("10", Day8.process("""
            b inc 5 if a > 1
            a inc 1 if b < 5
            c dec -10 if a >= 1
            c inc -20 if c == 10
            """.trimIndent()))
    }

}
