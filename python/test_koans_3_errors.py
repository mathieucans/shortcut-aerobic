from unittest import TestCase


# useful shortcuts for refactoring.
class TestKoans3Errors(TestCase):
    def testKoan01_follow_errors_then_delete_them(self):
        # follow errors by using F8 then delete them
        #
        #
        #
        self.assertEqual("pass" + delete_me"", "pass")
        #
        #
        #
        self.assertEqual("pass" + delete_me"", "pass")
        #
        #
        #
        self.assertEqual("pass" + delete_me"", "pass")

    def testKoan02_quick_fix_to_import(self):
        # follow errors by using F8 then quick fix the import by using Ctrl + ; and select Add "from module..."
        self.assert_equal(IMPORT_ME_1, "hello")
        self.assert_equal(IMPORT_ME_2, "world")
        self.assert_equal(IMPORT_ME_3, "!")

    def testKoan03_quick_fix_to_search_import(self):
        # follow errors by using F8 then quick fix the import by using Ctrl + ; and select "Search for additional..."
        self.assert_equal(IMPORT_LONG_NAME, "hello world !")

