import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class `Koans 3 - usefull short cut refactoring` {
    @Test
    fun `extract firstname to a variable by using ⌘⌥V | Ctrl+Alt+V`() {
        assertThat("Hello firstname!").isEqualTo("Hello David!")
    }

    @Test
    fun `extract parameter firstname by using ⌘⌥P | Ctrl+Alt+P`() {
        fun sayHello(): String {
            return "Hello firstname!"
        }

        assertThat(sayHello()).isEqualTo("Hello David!")
    }

    @Test
    fun `extract field firstname by using ⌘⌥F | Ctrl+Alt+F and affect it in constructor`() {
        class Hello {
            fun say(): String {
                return "Hello firstname!"
            }
        }

        assertThat(Hello().say()).isEqualTo("Hello David!")
    }

    @Test
    fun `extract method hello by using ⌘⌥M | Ctrl+Alt+M`() {
        class Hello(private val lang: String) {
            fun say(firstName: String): String {
                // Select from the following line
                var hello = ""
                when (this.lang.toLowerCase()) {
                    "fr" -> hello = "Bonjour"
                    "en" -> hello = "Hello"
                }
                // to this line to extract method
                return "${hello} ${firstName}!"
            }
        }

        assertThat(Hello("fr").say("David")).isEqualTo("Bonjour David!")
        assertThat(Hello("en").say("David")).isEqualTo("Hello David!")
        assertThat(Hello("hsqlf").say("David")).isEqualTo(" David!")
    }


    @BeforeEach
    fun beforeEach() {

    }

    @Test
    fun `move variables into describe scope and init it in  beforeEach function`() {
        // TIPS : split affectation and declaration by using ⌥⏎ | Alt+Enter
        // then use move Statement up by using ⌘⇧↑ | Ctrl+Shift+Up
        val language = French()
        val sayHello = SayHello(language)

        assertThat(sayHello.hello()).contains(language.hello())
    }
}
