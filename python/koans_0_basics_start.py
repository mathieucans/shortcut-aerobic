from unittest import TestCase


class Koans0BasicsStart(TestCase):

    def test_koan00_one_shortcut_to_rule_them_all(self):
        # use ⌘⇧A | Ctrl+Shift+A and search a command to toggle case
        self.assertEqual("SHOULD BE LOWER CASE", "should be lower case")

    def test_koan01_first_of_all_run_all_test_of_this_file_with_cursor_on_top_of_the_file(self):
        # by using ^⇧R | Ctrl+Shift+F10
        self.assertEqual("Then change this to make this test pass", True);
