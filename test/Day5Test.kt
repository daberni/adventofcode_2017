import org.junit.Assert
import org.junit.Test

class Day5Test {

    @Test
    fun input1() {
        Assert.assertEquals("5", Day5.process("""
            0
            3
            0
            1
            -3""".trimIndent()))
    }

}
