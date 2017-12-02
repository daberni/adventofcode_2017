import org.junit.Assert
import org.junit.Test

class Day1Test {

    @Test
    fun input1() {
        Assert.assertEquals("6", Day1.process("1212"))
    }

    @Test
    fun input2() {
        Assert.assertEquals("0", Day1.process("1221"))
    }

    @Test
    fun input3() {
        Assert.assertEquals("4", Day1.process("123425"))
    }

    @Test
    fun input4() {
        Assert.assertEquals("12", Day1.process("123123"))
    }

    @Test
    fun input5() {
        Assert.assertEquals("4", Day1.process("12131415"))
    }
}
