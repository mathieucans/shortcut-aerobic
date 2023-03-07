import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Koan3UsefulShortcutForRefactoring {
    @Test
    fun `01 - extract firstname to a variable`() {
        // Extract firstname variable by using ⌘⌥V | Ctrl+Alt+V
        // And make this test pass
        assertThat("Hello firstname!").isEqualTo("Hello David!")
    }

    @Test
    fun `02 - extract parameter firstname`() {
        // Extract firstname as parameter inside the sayHello function by using ⌘⌥P | Ctrl+Alt+P
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
        // This test already passed.
        // Refactoring Hello class to extract a method that say hello
        class Hello(private val lang: String) {
            fun say(firstName: String): String {
                // Extract method from the following line by using ⌘⌥M | Ctrl+Alt+M
                var hello = ""
                when (this.lang.toLowerCase()) {
                    "fr" -> hello = "Bonjour"
                    "en" -> hello = "Hello"
                }
                // to this line
                return "$hello ${firstName}!"
            }
        }

        assertThat(Hello("fr").say("David")).isEqualTo("Bonjour David!")
        assertThat(Hello("en").say("David")).isEqualTo("Hello David!")
        assertThat(Hello("unknown language").say("David")).isEqualTo(" David!")
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

    @Test
    fun `06 - change parameter order`() {
        // invert word1 and word2 parameters
        // Use ⇧⌥⌘← / Ctrl+Shift+Alt+← to move element left
        // Use ⇧⌥⌘→ / Ctrl+Shift+Alt+→ to move element right
        fun say2Words(word1: String, word2: String): String {
            return word1 + word2
        }

        assertThat(say2Words(" World", "Hello")).isEqualTo("Hello World")
    }
}
