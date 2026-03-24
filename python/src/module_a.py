class ModuleA:

    def test(self):
        return "youpii"

    def sayYes(self):
        return "no"

    def theFirstVerseOfTheSongIs(self, first_verse):
        return "somewhere over the rainbow" in first_verse.lower()

    def open_the_door(self, key):
        if "trash your mouse" == key:
            return "unlock"
        return "locked"


IMPORT_ME_1 = "hello"
IMPORT_ME_2 = "world"
IMPORT_ME_3 = "!"

IMPORT_ME_BUT_I_HAVE_A_VERY_LONG_NAME = "hello world !"