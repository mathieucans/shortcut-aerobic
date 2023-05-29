import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Koan4BonusTest {
    @Test
    fun `01 - cut up to line end`() {
        val lines = ("keep " + "--- delete me with ^K"
                + "the " + "--- this short couts"
                + "firsts " + "--- works in terminal too"
                + "words")
        assertThat(lines).isEqualTo("keep the firsts words")
    }

    @Test
    fun `02 - past from history`() {
        // by using ⌘⇧V / Ctrl+Shift+V
        assertThat("past here an old text you have copy").isEqualTo(" + \"--- delete me with ^K\"")
    }

    @Test
    fun `03 - got to same named test`() {
        // by using ⌘⇧T / Ctrl+Shift+T
        assertThat(Koan4Bonus().goToTest()).isEqualTo("go to test")
    }

    @Test
    fun `04 - inline method`()  {
        // Go inside method and introduce duplication by inlining method
        assertThat(Koan4Bonus().inside()).isEqualTo("inside")
        assertThat(Koan4Bonus().outside()).isEqualTo("outside")
    }

    @Test
    fun `05 - run anything`() {
        // by using Double ^ / Ctrl, Ctrl
        assertThat("then type gradle test").isEqualTo("all green")
    }
}
