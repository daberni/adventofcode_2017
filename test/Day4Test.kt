import org.junit.Assert
import org.junit.Test

class Day4Test {

    @Test
    fun input1() {
        Assert.assertEquals("1", Day4.process("aa bb cc dd ee"))
    }

    @Test
    fun input2() {
        Assert.assertEquals("0", Day4.process("aa bb cc dd aa"))
    }

    @Test
    fun input3() {
        Assert.assertEquals("1", Day4.process("aa bb cc dd aaa"))
    }

}
