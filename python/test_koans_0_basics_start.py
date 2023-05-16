from unittest import TestCase


# Start by these koans to be friendly with running test with shortcuts
class Koans0BasicsStart(TestCase):

    def test_koan00_one_shortcut_to_rule_them_all(self):
        # use ⌘⇧A | Ctrl+Shift+A and search a command to toggle case
        self.assertEqual("SHOULD BE LOWER CASE", "should be lower case")

    def test_koan01_first_of_all_run_all_test_of_this_file_with_cursor_on_top_of_the_file(self):
        # by using ^⇧R | Ctrl+Shift+F10
        self.assertEqual("Then change this to make this test pass", True)

    def test_koan02_make_this_test_pass_and_rerun_last_test_execution(self):
        # by using  ^R  |  Shift + F10
        self.assertEqual(True, False)

    def test_koan03_make_this_test_pass_and_run_only_this_testself(self):
        # by using ^⇧R | Crtl+Shift+F10 with cursor inside this test scope
        self.assertEqual(True, False)

    def test_koan04_make_this_test_pass_and_rerun_all_test_of_this_class(self):
        # by using ^⇧R | Crtl+Shift+F10 with cursor between two tests
        self.assertEqual(True, False)

    def test_koan05_you_can_open_run_menu_and_select_the_configuration_you_want(self):
        # by using ^⌥R | Shift + Alt + F10 and select the configuration you want
        self.assertEqual(True, False)

    def test_koan06_you_can_run_all_tests_by_open_run_menu_and_modify_a_configuration(self):
        # by using ^⌥R | Shift + Alt + F10
        # TIP if you choose Edit configuration,
        # you can select one and modify it to run all test in your workspace
        # Then you will be abble to run all your project tests by using ^⌥R | Shift + Alt + F10
        self.assertEqual(True, False)

    def test_koan07_you_can_open_next_koan_by_Navigate_to_file(self):
        # by using ⌘⇧O | Ctrl + Shift + N
        self.assertEqual(True, False)
