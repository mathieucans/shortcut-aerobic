import string
from unittest import TestCase


# useful shortcuts for refactoring.
class TestKoans2Refactoring(TestCase):
    def testKoan01_extract_firstname_to_a_variable(self):
        # extract variable by selecting firstname then Ctrl + Shift + R then Extract variable
        # change the variable content to make the test pas
        self.assertEqual("Hello " + "firstname" , 'Hello David!')

    def testKoan02_extract_method_hello(self):
        # This test already passed.
        # Refactoring Hello class to extract a method that say hello
        class Hello:
            lang: string

            def __init__(self, lang: string):
                self.lang = lang

            def say(self, first_name: string):
                # Extract hello method from the following line by using Ctrl + Shift + R then Extract method
                switch = {
                    'fr': 'Bonjour',
                    'en': 'Hello'
                }
                hello = switch.get(self.lang, '')
                # to this line
                return hello + ' ' + first_name + '!'

        self.assertEqual(Hello('fr').say('David'), 'Bonjour David!')
        self.assertEqual(Hello('en').say('David'), 'Hello David!')
        self.assertEqual(Hello('hsqlf').say('David'), ' David!')

    def setUp(self):
        pass

class French:
    def hello(self):
        return 'Salut'


class SayHello:
    language: French

    def __init__(self, language: French):
        self.language = language

    def hello(self):
        return self.language.hello() + ' David!'
