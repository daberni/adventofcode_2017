import org.junit.Assert
import org.junit.Test

class Day2Test {

    @Test
    fun input() {
        Assert.assertEquals("18", Day2.process("""
            5	1	9	5
            7	5	3
            2	4	6	8
            """.trimMargin()))
    }
}
