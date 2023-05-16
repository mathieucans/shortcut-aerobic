from unittest import TestCase

from src.koans_4_bonus import Koans4Bonus


class TestKoans4Bonus(TestCase):
    def testKoan01_cut_up_to_line_end(self):
        lines = ''
        lines += 'keep ' + '--- delete me with ^K'
        lines += 'the ' + '--- this short cuts'
        lines += 'firsts ' + '--- works'
        lines += 'words ' + '--- in terminal too'

        self.assertEqual(lines, 'keep the firsts words ')

    def testKoan02_past_from_history(self):
        # by using ⌘⇧V / Ctrl+Shift+V
        self.assertEqual('past here an old text you have copy', ' --- works')

    def testKoan03_got_to_same_named_test(self):
        # by using ⌘⇧T / Ctrl+Shift+T
        self.assertEqual(Koans4Bonus().goToTest(), 'go to test')

    def testKoan04_inline_method(self):
        # Go inside method and introduce duplication by inlining method
        self.assertEqual(Koans4Bonus().inside(), 'inside')
        self.assertEqual(Koans4Bonus().outside(), 'outside')

    def testKoan05_run_anything(self):
        # by using Double ^ / Ctrl, Ctrl
        self.assertEqual('execute the command tu run all test', 'python -m unittest discover -v')
