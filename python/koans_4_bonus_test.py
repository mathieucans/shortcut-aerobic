import unittest
from unittest import TestCase


class SomeBonusShortcut(TestCase):
    def testKoan01_cut_up_to_line_end(self):
        lines=''
        lines += 'keep ' + '--- delete me with ^K'
        lines += 'the ' + '--- this short cuts'
        lines += 'firsts ' + '--- works'
        lines += 'words ' + '--- in terminal too'

        self.assertEqual(lines,'keep the firsts words ')

    def testKoan02_past_from_history(self):
        # by using ⌘⇧V / Ctrl+Shift+V
        self.assertEqual('past here an old text you have copy', ' --- works')
