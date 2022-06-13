import java.text.MessageFormat;

// Extract Language interface
class French {
    public String hello() {
        return "Salut";
    }
}


public class SayHello {
    private final French language;

    SayHello(French language) {

        this.language = language;
    }

    String hello() {
        return MessageFormat.format("{0} David!", this.language.hello());
    }
}
