from unittest import TestCase


class TestKoans0BasicsStart(TestCase):
    def test_koan00_transform_to_lowercase(self):
        # Start by these koans to be friendly with running test with shortcuts
        # To configure shortcuts in VSCode:
        # 1. Open Keyboard Shortcuts (Ctrl+K Ctrl+S or Cmd+K Cmd+S on Mac)
        # 2. Search for "Transform to Uppercase", "Transform to Lowercase", and "Transform to Title Case"
        # 3. Set the following shortcuts:
        #    - Ctrl+K Ctrl+U for Uppercase
        #    - Ctrl+K Ctrl+L for Lowercase
        #    - Ctrl+K Ctrl+T for Title Case

        # Use Ctrl+K Ctrl+L to transform the selected text to lowercase
        self.assertEqual("should be lower case", "SHOULD BE LOWER CASE")
        # Use Ctrl+K Ctrl+U to transform the selected text to uppercase
        self.assertEqual("SHOULD BE UPPER CASE", "should be upper case")
        # Use Ctrl+K Ctrl+T to transform the selected text to title case
        self.assertEqual("Should Be Title Case", "should be title case")
    
    def test_koan01_first_of_all_run_all_test_of_this_file_with_cursor_on_top_of_the_file(self):
        # by using Ctrl T + Ctrl F
        self.assertEqual("Then change this to make this test pass", True)

    def test_koan02_first_of_all_run_all_test(self):
        # by using Ctrl T + Ctrl T
        self.assertEqual("Then change this to make this test pass", True)

    def test_koan03_you_can_open_next_koan_by_Navigate_to_file(self):
        # by using Ctrl + P
        self.assertEqual(True, False)