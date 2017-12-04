import org.junit.Assert
import org.junit.Test

class Day4Test {

    @Test
    fun input1() {
        Assert.assertEquals("1", Day4.process("abcde fghij"))
    }

    @Test
    fun input2() {
        Assert.assertEquals("0", Day4.process("abcde xyz ecdab"))
    }

    @Test
    fun input3() {
        Assert.assertEquals("1", Day4.process("a ab abc abd abf abj"))
    }

    @Test
    fun input4() {
        Assert.assertEquals("1", Day4.process("iiii oiii ooii oooi oooo"))
    }

    @Test
    fun input5() {
        Assert.assertEquals("0", Day4.process("oiii ioii iioi iiio"))
    }

}
