import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class `Koan 1 - navigate, selection and deletion` {

    @Test
    fun `01 - This test pass, navigate to end block and delete last failing test`() {
        // TIPS : on small keybopard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
        assertThat(ModuleA().test()).isEqualTo("youpii");
    }

    @Test
    fun `02 - Deletion to next word`() {
        // Delete all unused spaces by using delete to Word End ⌥⌦ / Ctrl+Delete
        assertThat("                             to much spaces kill spaces").doesNotContain("    ");
    }

    @Test
    fun `03 - Deletion to word start word`() {
        // Delete MouseForEver by using delete to Word Start ⌥⌫ / Ctrl+Backspace
        assertThat("delete the last straw!MouseForEver").doesNotContain("MouseForEver");
    }

    @Test
    fun `04 - Delete the failing line`() {
        var deleteUnusedLine = "This test should pass";
        deleteUnusedLine += "*** delete me by using ⌘⌫ / Ctrl+Y ****";
        assertThat(deleteUnusedLine).isEqualTo("This test should pass");
    }

    @Test
    fun `05 - Extend selection by using ⌥↑ | Ctrl+W`() {
        assertThat("***** SELECT ME WITH EXTEND SELECTION*****").isEqualTo("selected")
    }

    @Test
    fun `06 - Extend selection code scope by using ⌥↑ | Ctrl+W`() {
        assertThat(ModuleA ().test()).isEqualTo("youpii");
        assertThat("***** REPLACE ME *****").isEqualTo("new ModuleA().test()")
    }

    @Test
    fun `07 - Select next occurrence by using ^G | Alt+J then edit multi lines`() {
        var message = "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        message += "Un tiens vaut mieux que deux tu l'auras.";
        assertThat(message).isEqualTo("ha ha ha ha ha ha ");
    }

    @Test
    fun `08 - Navigate to sayYes definition by using ⌘B | Ctrl+B`() {
        assertThat(ModuleA ().sayYes()).isEqualTo("yes");
    }

    @Test
    fun `09 - Delete this test and navigate to to of file by using ⌘A,←`() {
        Assertions.fail<String>("Delete this test and navigate to top");
    }

}
