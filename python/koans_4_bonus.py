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
