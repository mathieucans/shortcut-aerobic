import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Koan2GenerateCodeByUsingYourIde {
    @Test
    fun `01 - uncomment and generate class and method`(){
        // by unsing ⌥⏎ | Alt+Enter
        // TIPS : you can navigate through error code by using F2
        var buildResult = "code"

        //buildResult = RobotCode().repeat(buildResult)

        assertThat(buildResult).isEqualTo("codecode")
    }

    @Test
    fun `02 - surround with try catch`()  {
        // Surround the following line with try catch by using ⌥⌘T | Ctrl+Alt+T
        throw  Exception("surround me with try catch")
    }

    @Test
    fun `03 - extract interface Language from French`(){
        // Extract interface Language of French and generate English langage.
        // Then change SayHello parameter and field type to speak english.
        // Tips : To extract interface, display the refactoring menu by using ^T | Ctrl+Shift+Alt+T
        // Check the methods you want to have in your interface and make English implement it by using ⌥⏎ | Alt+Enter

        // val language = English()             // Uncomment this line
        val language = French()                 // Comment this line

        val sayHello = SayHello(language)

        val response = sayHello.hello()

        assertThat(response).isEqualTo("Hello David!")
    }
}

// extract Language interface
class French {
    fun hello(): String {
        return "Salut"
    }
}

class SayHello(private val language: French) {
    fun hello(): String {
        return "${this.language.hello()} David!"
    }
}
