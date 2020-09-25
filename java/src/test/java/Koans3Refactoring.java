import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Koans3Refactoring {
    @Test
    void Koan01_extract_firstname_to_a_variable() {
        // extract variable by using ⌘⌥V | Ctrl+Alt+V and replace the text
        assertThat("Hello firstname!").isEqualTo("Hello David!");
    }

    @Test
    void Koan02_extract_parameter_firstname() {
        // Extract parameter inside the sayHello function by selecting firstname and using ⌘⌥V | Ctrl+Alt+V
        assertThat(sayHello()).isEqualTo("Hello David!");
        assertThat(sayHello()).isEqualTo("Hello Vincent!");
    }

    String sayHello() {
        return "Hello firstname!";
    }

    @Test
    void Koan03_extract_field_firstname_and_affect_it_in_constructor() {
        // extract field by selecting firstname and by using ⌘⌥F | Ctrl+Alt+F
        // Choose constructor initialization
        // then extract parameter to make test pass
        class Hello {
            String say() {
                return "Hello firstname!";
            }
        }

        assertThat(new Hello().say()).isEqualTo("Hello David!");
        assertThat(new Hello().say()).isEqualTo("Hello Vincent!");
    }

    @Test
    void Koan04_extract_method_hello() {
        // by using ⌘⌥M | Ctrl+Alt+M
        class Hello {
            private String lang;

            public Hello(String lang) {
                this.lang = lang;
            }
            String say(String firstName) {
                // Select from the following line
                String hello = "";
                switch (this.lang.toLowerCase()) {
                    case "fr" : hello = "Bonjour"; break;
                    case "en" : hello = "Hello"; break;
                }
                // to this line to extract method
                return hello + " " + firstName + "!";
            }
        }

        assertThat(new Hello("fr").say("David")).isEqualTo("Bonjour David!");
        assertThat(new Hello("en").say("David")).isEqualTo("Hello David!");
        assertThat(new Hello("hsqlf").say("David")).isEqualTo(" David!");
    }


    @BeforeEach
    void beforeEach() {

    }

    @Test
    void Koan05_move_variables_into_describe_scope_and_init_it_in__beforeEach_function() {
        // TIPS : split affectation and declaration by using ⌥⏎ | Alt+Enter
        // then use move Statement up by using ⌘⇧↑ | Ctrl+Shift+Up
        French language = new  French();
        SayHello sayHello = new SayHello(language);

        assertThat(sayHello.hello()).contains(language.hello());
    }
}
