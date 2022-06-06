import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Koans4bonusTest {
    @Test
    public void Koan01_cut_up_to_line_end() {
        String lines = "keep " + "--- delete me with ^K"
        + "the " + "--- this short couts"
        + "firsts " + "--- works in terminal too"
        + "words";

        assertThat(lines).isEqualTo("keep the firsts words");
    }

    @Test
    public void Koan02_past_from_history() {
        // by using ⌘⇧V / Ctrl+Shift+V
        assertThat("past here an old text you have copy").isEqualTo(" + \"--- delete me with ^K\"");
    }

    @Test
    public void Koan03_got_to_same_named_test() {
        // by using ⌘⇧T / Ctrl+Shift+T
        assertThat(new Koans4bonus().goToTest()).isEqualTo("go to test");
    }

    @Test
    public void Koan04_run_anything() {
        // by using Double ^ / Ctrl, Ctrl
        assertThat("then type gradle test").isEqualTo("all green");
    }
}
