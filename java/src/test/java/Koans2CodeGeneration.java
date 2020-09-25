import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static org.assertj.core.api.Assertions.assertThat;

class Koans2CodeGeneration {
    @Test
    void Koan01_uncomment_and_generate_class_and_method() {
        // by unsing ⌥⏎ | Alt+Enter
        // TIPS : you can navigate through error code by using F2
        String buildResult = "code";

        // Uncomment following line
        //buildResult = new RobotCode().repeat(buildResult);

        assertThat(buildResult).isEqualTo("codecode");
    }

    @Test
    void Koan02_extract_interface_Language_of_French() {
        // To extract interface, display the refactoring menu by using ^T | Ctrl+Shift+Alt+T
        // Check the methods you want to have in your interface and make English implement it by using ⌥⏎ | Alt+Enter

        // Uncomment this line
        // English language = new English();
        // Comment this line
        French language = new French();
        SayHello sayHello = new SayHello(language);

        String response = sayHello.hello();

        assertThat(response).isEqualTo("Hello David!");
    }

}


class French {
    public String hello() {
        return "Salut";
    }
}

class SayHello {
    private French language;

    SayHello(French language) {

        this.language = language;
    }

    String hello() {
        return MessageFormat.format("{0} David!", this.language.hello());
    }
}
