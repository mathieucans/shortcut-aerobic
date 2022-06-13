import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class Koans2GenerateCodeByUsingYourIde {
    @Test
    void Koan01_uncomment_and_generate_class_and_method() {
        // by using ⌥⏎ | Alt+Enter
        // TIPS : you can navigate through error code by using F2
        String buildResult = "code";

        // Uncomment following line
        //buildResult = new RobotCode().repeat(buildResult);

        assertThat(buildResult).isEqualTo("codecode");
    }

    @Test
    void Koan02_surround_with_try_catch() throws Exception {
        // Surround the following line with try catch by using ⌥⌘T | Ctrl+Alt+T
        throw new Exception("surround me with try catch");
    }

    @Test
    void Koan03_extract_interface_Language_of_French() {
        // Extract interface Language of French and generate English langage.
        // Then change SayHello parameter and field type to speak english.
        // Tips : To extract interface, display the refactoring menu by using ^T | Ctrl+Shift+Alt+T
        // Check the methods you want to have in your interface and make English implement it by using ⌥⏎ | Alt+Enter

        // English language = new English();              // Uncomment this line
        French language = new French();                   // Comment this line

        SayHello sayHello = new SayHello(language);

        String response = sayHello.hello();

        assertThat(response).isEqualTo("Hello David!");
    }

}

