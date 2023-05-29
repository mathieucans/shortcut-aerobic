import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Koan1BasicsNavigateSelectionAndDeletion {

    private val ratio = 0.5

    @Test
    fun `01 - navigate to end block and find the key to open the door`() {
        // TIPS : on laptop keyboard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
        assertThat(ModuleA().openTheDoor("the key is at the end of this file")).isEqualTo("unlock")
    }

    @Test
    fun `02 - Deletion to next word`() {
        // Delete all unused spaces by using delete to Word End ⌥⌦ / Ctrl+Delete
        assertThat("                             to much spaces kill spaces").doesNotContain("    ")
    }

    @Test
    fun `03 - Deletion to word start word`() {
        // Delete MouseForEver by using delete to Word Start ⌥⌫ / Ctrl+Backspace
        assertThat("delete the last straw!MouseForEver").doesNotContain("MouseForEver")
    }

    @Test
    fun `04 - Delete the failing line`() {
        var deleteUnusedLine = "This test should pass"
        deleteUnusedLine += "*** delete me by using ⌘⌫ / Ctrl+Y ****"
        assertThat(deleteUnusedLine).isEqualTo("This test should pass")
    }

    @Test
    fun `05 - Extend selection`() {
        // by using ⌥↑ | Ctrl+W
        assertThat("***** SELECT ME WITH EXTEND SELECTION*****").isEqualTo("selected")
    }

    @Test
    fun `06 - Extend selection code scope`() {
        // by using ⌥↑ | Ctrl+W
        // extend selection depends on scope, by using ⌥↑ | Ctrl+W select only what needed in line below
        assertThat(ModuleA().test()).isEqualTo("youpii")
        // and paste it in the following assertion
        assertThat("***** REPLACE ME *****").isEqualTo("ModuleA().test()")
    }

    @Test
    fun `07 - edit multiple lines with clone caret`() {
        // Use ⌥,⌥↓ / Ctrl,Ctrl+↓  to clone caret (press Esc to exit multi caret edition)
        // Edit song to match expected lyrics
        val so = ("Somewhere over the rainbow"
                + "Way up high"
                + "And the dreams that you dream of"
                + "Once in a lullaby, oh"
                )
        assertThat(so).isEqualTo(
            """ > Somewhere over the rainbow
 > Way up high
 > And the dreams that you dream of
 > Once in a lullaby, oh
"""
        )
    }

    @Test
    fun `08 - Select next occurrence then edit multi lines`() {
        // by using ^G | Alt+J (press Esc to exit multi caret edition)
        var message = "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        assertThat(message).isEqualTo("ha ha ha ha ha ha ")
    }

    @Test
    fun `09 - Select all occurrences then edit multi carets`() {
        // by using ^⌘G | Ctrl+Shift+Alt+J (press Esc to exit multi caret edition)
        val message = """Lorem ipsum TO_CHANGE sit amet, consectetur adipiscing elit.
Nam TO_CHANGE dignissim sem at posuere. Donec sollicitudin est ac lorem eleifend,
eget aliquam velit consectetur. Aliquam id TO_CHANGE sit amet nisl suscipit iaculis
nec et magna. TO_CHANGE in felis ut lacus gravida faucibus. Suspendisse dictum
at sem ac semper. TO_CHANGE venenatis placerat ipsum vel bibendum. Donec et
diam nibh."""
        assertThat(message).isEqualTo(
            """Lorem ipsum allOccurences sit amet, consectetur adipiscing elit.
Nam allOccurences dignissim sem at posuere. Donec sollicitudin est ac lorem eleifend,
eget aliquam velit consectetur. Aliquam id allOccurences sit amet nisl suscipit iaculis
nec et magna. allOccurences in felis ut lacus gravida faucibus. Suspendisse dictum
at sem ac semper. allOccurences venenatis placerat ipsum vel bibendum. Donec et
diam nibh."""
        )
    }

    @Test
    fun `10 - Navigate to sayYes definition`() {
        // by using ⌘B | Ctrl+B and change behaviour to make this test pass
        assertThat(ModuleA().sayYes()).isEqualTo("yes")
    }

    @Test
    fun `11 - Navigate to file structure to change ratio`() {
        // Use ⌘F12 / Ctrl+F12 to navigate to ratio declaration
        assertThat(3 * ratio).isEqualTo(6)
    }

    @Test
    fun `12 - Navigate back and forward`() {
        // Use navigate back to find and copy the first verse of the song
        // Use ⌥⌘← / Ctrl+Alt+← to navigate back
        // Use ⌥⌘→ / Ctrl+Alt+→ to navigate forward
        assertThat(ModuleA().theFirstVerseOfTheSongIs("copy here the first verse of the song"))
            .isTrue()
    }

}
// the key is "trash your mouse"
// TIPS : on laptop keyboard, you can navigate to top of file by using ⌘A,←  / Ctrl+A, ←