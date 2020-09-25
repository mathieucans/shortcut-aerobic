import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Koans1BasiscsNavigateSelection {
    @Test
    void Koans11_This_test_pass_navigate_to_end_block_and_delete_last_failing_test() {
        // TIPS : on small keybopard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
        assertThat(new ModuleA().test()).isEqualTo("youpii");
    }

    @Test
    void Koans12_Deletion_to_next_word() {
        // Delete all unused spaces by using delete to Word End ⌥⌦ / Ctrl+Delete
        assertThat("                             to much spaces kill spaces").doesNotContain("    ");
    }

    @Test
    void Koans13_Deletion_to_word_start_word() {
        // Delete MouseForEver by using delete to Word Start ⌥⌫ / Ctrl+Backspace
        assertThat("delete the last straw!MouseForEver").doesNotContain("MouseForEver");
    }

    @Test
    void Koans14_Delete_the_failing_line() {
        String deleteUnusedLine = "This test should pass";
        deleteUnusedLine += "*** delete me by using ⌘⌫ / Ctrl+Y ****";
        assertThat(deleteUnusedLine).isEqualTo("This test should pass");
    }

    @Test
    void Koans15_Extend_selection() {
        // by using ⌥↑ | Ctrl+W
        assertThat("***** SELECT ME WITH EXTEND SELECTION*****").isEqualTo("selected");
    }

    @Test
    void Koans16_Extend_selection_code_scope() {
        // by using ⌥↑ | Ctrl+W
        assertThat(new ModuleA().test()).isEqualTo("youpii");
        assertThat("***** REPLACE ME *****").isEqualTo("new ModuleA().test()");
    }

    @Test
    void Koans17_Select_next_occurrence_then_edit_multi_lines() {
        // by using ^G | Alt+J
        String message = "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        assertThat(message).isEqualTo("ha ha ha ha ha ha ");
    }

    @Test
    void Koans18_Navigate_to_sayYes_definition() {
        // by using ⌘B | Ctrl+B
        assertThat(new ModuleA().sayYes()).isEqualTo("yes");
    }

    @Test
    void Koans19_Delete_this_test_and_navigate_to_top_of_file() {
        //  by using ⌘A,←
        Assertions.fail("Delete this test and navigate to top");
    }


}
