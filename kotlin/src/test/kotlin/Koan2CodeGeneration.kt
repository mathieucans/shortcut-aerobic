import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class `Koans 2 - Generate code by using your IDE` {
    @Test
    fun `01 - uncomment and generate class and method by unsing ⌥⏎ | Alt+Enter`(){
        // TIPS : you can navigate through error code by using F2
        var buildResult = "code"

        //buildResult = new RobotCode().repeat(buildResult)

        assertThat(buildResult).isEqualTo("codecode")
    }

    @Test
    fun `02 - extract interface Language of French by using ^T | Ctrl+Shift+Alt+T`(){
        // Uncomment this line
        // const language = English()
        // Comment this line
        val language = French()
        val sayHello = SayHello(language)

        val response = sayHello.hello()

        assertThat(response).isEqualTo("Hello David!")
    }
}


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
