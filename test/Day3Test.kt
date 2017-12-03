import org.junit.Assert
import org.junit.Test

class Day3Test {

    @Test
    fun input1() {
        Assert.assertEquals("0", Day3.process("1"))
    }

    @Test
    fun input2() {
        Assert.assertEquals("3", Day3.process("12"))
    }

    @Test
    fun input3() {
        Assert.assertEquals("2", Day3.process("23"))
    }

    @Test
    fun input4() {
        Assert.assertEquals("31", Day3.process("1024"))
    }

}
