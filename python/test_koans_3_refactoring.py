import string
from unittest import TestCase


# useful shortcuts for refactoring.
class TestKoans3Refactoring(TestCase):
    def testKoan01_extract_firstname_to_a_variable(self):
        # Replace with template string by using ⌥⏎ / Alt+Enter
        # Then extract firstname variable by using ⌘⌥V | Ctrl+Alt+V
        # And make this test pass
        self.assertEqual('Hello firstname!', 'Hello David!')

    def testKoan02_extract_parameter_firstname(self):
        # Extract firstname as parameter inside the sayHello function by using ⌘⌥P | Ctrl+Alt+P
        def say_hello():
            return 'Hello firstname!'

        self.assertEqual(say_hello(), 'Hello David!')

    def testKoan03_extract_field_firstname_and_affect_it_in_constructor(self):
        # extract field by selecting firstname and by using ⌘⌥F | Ctrl+Alt+F
        class Hello:
            def say(self):
                return 'Hello firstname!'

        self.assertEqual(Hello().say(), 'Hello David!')

    def testKoan04_extract_method_hello(self):
        # This test already passed.
        # Refactoring Hello class to extract a method that say hello
        class Hello:
            lang: string

            def __init__(self, lang: string):
                self.lang = lang

            def say(self, first_name: string):
                # Extract hello method from the following line by using ⌘⌥M | Ctrl+Alt+M
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

    def testKoan05_move_variables_into_class_scope_and_init_it_in_setUp_function(self):
        # TIPS : extract field by selecting language and by using ⌘⌥F | Ctrl+Alt+F
        # then use move Statement up by using ⌘⇧↑ / Ctrl+Shift+Up
        language = French()
        say_hello = SayHello(language)

        self.assertIn(language.hello(), say_hello.hello())


class French:
    def hello(self):
        return 'Salut'


class SayHello:
    language: French

    def __init__(self, language: French):
        self.language = language

    def hello(self):
        return self.language.hello() + ' David!'
