import org.junit.Assert
import org.junit.Test

class Day2Test {

    @Test
    fun input() {
        Assert.assertEquals("9", Day2.process("""
            5 9 2 8
            9 4 7 3
            3 8 6 5
            """.trimMargin()))
    }
}
