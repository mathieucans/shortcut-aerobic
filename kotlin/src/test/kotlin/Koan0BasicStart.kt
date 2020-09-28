import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class `Koans 0 - Basics - Get started - navigate to to next failing test` {

    @Test
    fun `01 - first of all, run all test of this file with cursor on top of the file by using ^⇧R | Ctrl+Shift+F10`() {
        assertThat("Then change this to make this test pass").isEqualTo(true)
    }

    @Test
    fun `02 - make this test pass and rerun last test execution by using ^R  |  Shift + F10`() {
        assertThat(true).isFalse()
    }

    @Test
    fun `03 - make this test pass and rerun only this test by using ^⇧R | Crtl+Shift+F10 with cursor inside this test scope`() {
        assertThat(true).isFalse()
    }

    @Test
    fun `04 - make this test pass and rerun all test by using ^⇧R | Crtl+Shift+F10 with cursor between two tests`() {
        assertThat(true).isFalse()
    }

    @Test
    fun `05 - you can open run menu by using ^⌥R | Shift+Alt+F10 and select the configuration you want`() {
        assertThat(true).isFalse()
    }

    @Test
    fun `06 - you can open next koan by Navigate to file by using ⌘⇧O | Ctrl+Shift+N`() {
        assertThat(true).isFalse()
    }


}
