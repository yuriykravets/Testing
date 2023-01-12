import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TotallerTest {

    @Test
    fun `should Be Able To Add 3 And 4`() {
        val test = Totaller()

        assertEquals(3, test.add(3))
        assertEquals(7, test.add(4))
        assertEquals(8, test.add(1))
        assertEquals(8, test.total)

    }

}