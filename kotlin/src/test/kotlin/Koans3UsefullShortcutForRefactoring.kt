import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Koans3UsefullShortcutForRefactoring {
    @Test
    fun `01 - extract firstname to a variable`() {
        // Extract firstname variable by using ⌘⌥V | Ctrl+Alt+V
        // And make this test pass
        assertThat("Hello firstname!").isEqualTo("Hello David!")
    }

    @Test
    fun `02 - extract parameter firstname`() {
        // Extract parameter inside the sayHello function by using ⌘⌥P | Ctrl+Alt+P
        fun sayHello(): String {
            return "Hello firstname!"
        }

        assertThat(sayHello()).isEqualTo("Hello David!")
    }

    @Test
    fun `03 - extract field firstname and affect it in constructor`() {
        // extract field by selecting firstname and by using ⌘⌥F | Ctrl+Alt+F
        // Choose constructor initialization
        // then extract parameter to make test pass
        class Hello {
            fun say(): String {
                return "Hello firstname!"
            }
        }

        assertThat(Hello().say()).isEqualTo("Hello David!")
    }

    @Test
    fun `04 - extract method hello`() {
        class Hello(private val lang: String) {
            fun say(firstName: String): String {
                // Extract method from the following line by using ⌘⌥M | Ctrl+Alt+M
                var hello = ""
                when (this.lang.toLowerCase()) {
                    "fr" -> hello = "Bonjour"
                    "en" -> hello = "Hello"
                }
                // to this line
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
    fun `05 - move variables into describe scope and init it in  beforeEach function`() {
        // TIPS : split affectation and declaration by using ⌥⏎ | Alt+Enter
        // then use move Statement up by using ⌘⇧↑ | Ctrl+Shift+Up
        val language = French()
        val sayHello = SayHello(language)

        assertThat(sayHello.hello()).contains(language.hello())
    }
}
