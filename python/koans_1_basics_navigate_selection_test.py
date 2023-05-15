from unittest import TestCase

from ModuleA import ModuleA


class Koans1BasicsNavigateSelection(TestCase):
    @staticmethod
    def ratio(): return 0.5

    def test_koan01_navigate_to_end_block_and_find_the_key_to_open_the_door(self):
        # TIPS : on laptop keyboard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
        self.assertEqual(
            ModuleA().open_the_door("the key is at the end of this file"),
            "unlock")

    def test_koan02_deletion_to_next_word(self):
        # Delete all unused spaces by using delete to Word End ⌥⌦ / Ctrl+Delete
        self.assertTrue("    " not in "Delete spaces after me:                             to much spaces kill spaces")

    def test_Koan03_deletion_to_word_start_word(self):
        # Delete MouseForEver by using delete to Word Start ⌥⌫ / Ctrl+Backspace
        self.assertTrue("MouseForEver" not in "delete the last straw!MouseForEver")

    def test_koan04_delete_the_failing_line(self):
        delete_unused_line = "This test should pass"
        delete_unused_line += "*** delete me by using ⌘⌫ / Ctrl+Y ****"
        self.assertEqual(delete_unused_line, "This test should pass")

    def test_koan05_extend_selection(self):
        # by using ⌥↑ | Ctrl+W
        self.assertEqual("***** SELECT ME WITH EXTEND SELECTION*****", "selected")

    def test_koan06_extend_selection_code_scope(self):
        # extend selection depends on scope, by using ⌥↑ | Ctrl+W select only what needed in line below
        self.assertEqual(ModuleA().test(), "youpii")
        # and paste it in the following assertion
        self.assertEqual("**** REPLACE ME ****", "ModuleA().test()")

    def test_koan07_edit_multiple_lines_with_clone_caret(self):
        # Use ⌥,⌥↓ / Ctrl,Ctrl+↓  to clone caret (press Esc to exit multi caret edition)
        # Edit song to match expected lyrics
        song = ""
        song += "Somewhere over the rainbow"
        song += "Way up high"
        song += "And the dreams that you dream of"
        song += "Once in a lullaby, oh"

        self.assertEqual(song, " > Somewhere over the rainbow\n"
                         + " > Way up high\n"
                         + " > And the dreams that you dream of\n"
                         + " > Once in a lullaby, oh\n")

    def test_koan08_select_next_occurrence_then_edit_multi_lines(self):
        # by using ^G | Alt+J (press Esc to exit multi caret edition)
        message = "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        message += "Un tiens vaut mieux que deux tu l'auras."
        self.assertEqual(message, "ha ha ha ha ha ha ")

    def test_koan09_select_all_occurrences_then_edit_multi_carets(self):
        # by using ^⌘G | Ctrl+Shift+Alt+J (press Esc to exit multi caret edition)
        message = "Lorem ipsum TO_CHANGE sit amet, consectetur adipiscing elit.\n"
        message += "Nam TO_CHANGE dignissim sem at posuere. Donec sollicitudin est ac lorem eleife,\n"
        message += "eget aliquam velit consectetur. Aliquam id TO_CHANGE sit amet nisl suscipit iaculis\n"
        message += "nec et magna. TO_CHANGE in felis ut lacus gravida faucibus. Suspendisse dictum\n"
        message += "at sem ac semper. TO_CHANGE venenatis placerat ipsum vel bibendum. Donec et\n"
        message += "diam nibh.\n"

        expected = "Lorem ipsum allOccurences sit amet, consectetur adipiscing elit.\n"
        expected += "Nam allOccurences dignissim sem at posuere. Donec sollicitudin est ac lorem eleife,\n"
        expected += "eget aliquam velit consectetur. Aliquam id allOccurences sit amet nisl suscipit iaculis\n"
        expected += "nec et magna. allOccurences in felis ut lacus gravida faucibus. Suspendisse dictum\n"
        expected += "at sem ac semper. allOccurences venenatis placerat ipsum vel bibendum. Donec et\n"
        expected += "diam nibh.\n"
        self.assertEqual(message, expected)

    def test_koan10_navigate_to_sayyes_definition(self):
        # by using ⌘B | Ctrl+B and change behaviour to make this test pass
        self.assertEqual(ModuleA().sayYes(), "yes")

    def test_koan11_navigate_to_file_structure_to_change_ratio(self):
        # Use ⌘F12 / Ctrl+F12 to navigate to ratio declaration
        self.assertEqual(3 * self.ratio(), 6)

    def test_koan12_navigate_back_and_forward(self):
        # Use navigate back to find and copy the first verse of the song
        self.assertTrue(ModuleA().theFirstVerseOfTheSongIs("copy here the first verse of the song"))

# the key is "trash your mouse"
# TIPS : on laptop keyboard, you can navigate to top of file by using ⌘A,←  / Ctrl+A, ←
