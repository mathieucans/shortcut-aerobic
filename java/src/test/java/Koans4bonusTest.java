import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Koans4bonusTest {
    @Test
    public void cut_up_to_line_end() {
        String lines = "keep " + "--- delete me with ^K"
        + "the " + "--- this short couts"
        + "firsts " + "--- works in terminal too"
        + "words";

        assertThat(lines).isEqualTo("keep the firsts words");
    }

    @Test
    public void past_from_history() {
        // by using ⌘⇧V / Ctrl+Shift+V
        assertThat("past here an old text you have copy").isEqualTo(" + \"--- delete me with ^K\"");
    }
}
