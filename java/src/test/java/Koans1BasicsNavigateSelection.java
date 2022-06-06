import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Koans1BasicsNavigateSelection {

    private final double ratio = 0.5;

    @Test
    void Koan01_navigate_to_end_block_and_find_the_key_to_open_the_door() {
        // TIPS : on laptop keyboard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
        assertThat(new ModuleA().openTheDoor("the key is at the end of this file")).isEqualTo("unlock");
    }

    @Test
    void Koan02_deletion_to_next_word() {
        // Delete all unused spaces by using delete to Word End ⌥⌦ / Ctrl+Delete
        assertThat("                             to much spaces kill spaces").doesNotContain("    ");
    }

    @Test
    void Koan03_deletion_to_word_start_word() {
        // Delete MouseForEver by using delete to Word Start ⌥⌫ / Ctrl+Backspace
        assertThat("delete the last straw!MouseForEver").doesNotContain("MouseForEver");
    }

    @Test
    void Koan04_delete_the_failing_line() {
        String deleteUnusedLine = "This test should pass";
        deleteUnusedLine += "*** delete me by using ⌘⌫ / Ctrl+Y ****";
        assertThat(deleteUnusedLine).isEqualTo("This test should pass");
    }

    @Test
    void Koan05_extend_selection() {
        // by using ⌥↑ | Ctrl+W
        assertThat("***** SELECT ME WITH EXTEND SELECTION*****").isEqualTo("selected");
    }

    @Test
    void Koan06_extend_selection_code_scope() {
        // extend selection depends on scope, by using ⌥↑ | Ctrl+W select only what needed in line below
        assertThat(new ModuleA().test()).isEqualTo("youpii");
        // and paste it in the folowing assertion
        assertThat("**** REPLACE ME ****").isEqualTo("new ModuleA().test()");
    }

    @Test
    void Koan07_edit_multiple_lines_with_clone_caret() {
        // Use ⌥,⌥↓ / Ctrl,Ctrl+↓  to clone caret (press Esc to exit multi caret edition)
        // Edit song to match expected lyrics
        String song
                = "Somewhere over the rainbow"
                + "Way up high"
                + "And the dreams that you dream of"
                + "Once in a lullaby, oh"
                ;
        assertThat(song).isEqualTo(" > Somewhere over the rainbow\n"
                + " > Way up high\n"
                + " > And the dreams that you dream of\n"
                + " > Once in a lullaby, oh\n"
        );
    }

    @Test
    void Koan08_select_next_occurrence_then_edit_multi_lines() {
        // by using ^G | Alt+J (press Esc to exit multi caret edition)
        String message = "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        assertThat(message).isEqualTo("ha ha ha ha ha ha ");
    }

    @Test
    void Koan09_navigate_to_sayYes_definition() {
        // by using ⌘B | Ctrl+B and change behaviour to make this test pass
        assertThat(new ModuleA().sayYes()).isEqualTo("yes");
    }

    @Test
    void Koan10_Navigate_to_file_structure_to_change_ratio() {
        // Use ⌘F12 / Ctrl+F12 to navigate to ratio declaration
        assertThat(3 * ratio).isEqualTo(6);
    }

    @Test
    void Koan11_Navigate_back_and_forward() {
        // Use navigate back to find and copy the first verse of the song
        // Use ⌥⌘← / Ctrl+Alt+← to navigate back
        // Use ⌥⌘→ / Ctrl+Alt+→ to navigate forward
        assertThat(new ModuleA().theFirstVerseOfTheSongIs("copy here the first verse of the song"))
                .isTrue();
    }
}
// the key is "trash your mouse"
// TIPS : on laptop keyboard, you can navigate to top of file by using ⌘A,←  / Ctrl+A, ←

