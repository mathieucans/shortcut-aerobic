import string
from unittest import TestCase


# useful shortcuts for refactoring.
class Koans3Refactoring(TestCase):
    def testKoan01_extract_firstname_to_a_variable(self):
        # Replace with template string by using ⌥⏎ / Alt+Enter
        # Then extract firstname variable by using ⌘⌥V | Ctrl+Alt+V
        # And make this test pass
        self.assertEqual('Hello firstname!', 'Hello David!');

    def testKoan02_extract_parameter_firstname(self):
        # Extract firstname as parameter inside the sayHello function by using ⌘⌥P | Ctrl+Alt+P
        def sayHello():
            return 'Hello firstname!'

        self.assertEqual(sayHello(), 'Hello David!')

    def testKoan03_extract_field_firstname_and_affect_it_in_constructor(self):
        # extract field by selecting firstname and by using ⌘⌥F | Ctrl+Alt+F
        class Hello:
            def say(self):
                return 'Hello firstname!';

        self.assertEqual(Hello().say(), 'Hello David!')

    def testKoan04_extract_method_hello(self):
        # This test already passed.
        # Refactoring Hello class to extract a method that say hello
        class Hello:
            lang: string

            def __init__(self, lang: string):
                self.lang = lang

            def say(self, firstName: string):
                # Extract hello method from the following line by using ⌘⌥M | Ctrl+Alt+M
                switch = {
                    'fr': 'Bonjour',
                    'en': 'Hello'
                }
                hello = switch.get(self.lang, '')
                # to this line
                return hello + ' ' + firstName + '!'

        self.assertEqual(Hello('fr').say('David'), 'Bonjour David!')
        self.assertEqual(Hello('en').say('David'), 'Hello David!')
        self.assertEqual(Hello('hsqlf').say('David'), ' David!')


    def setUp(self):
        pass

    def testKoan05_move_variables_into_class_scope_and_init_it_in_setUp_function(self):
        # TIPS : extract field by selecting language and by using ⌘⌥F | Ctrl+Alt+F
        # then use move Statement up by using ⌘⇧↑ / Ctrl+Shift+Up
        language = French()
        sayHello = SayHello(language)

        self.assertIn(language.hello(), sayHello.hello())
# });
#
# test('06 - change parameter order', () => {
#                                           // invert word1 and word2
#                                                     // Use ⇧⌥⌘← / Ctrl+Shift+Alt+← to navigate back
#                                                                                                // Use ⇧⌥⌘→ / Ctrl+Shift+Alt+→ to navigate forward
# function say2Words(word1: string, word2: string): string {
# return word1 + word2;
# }
#
# expect(say2Words(' World', 'Hello')).toEqual('Hello World');
# })
#
# test('07 - change for loop to get index', () => {
#                                                 // Change for loop to get index ⌥⏎ / Alt+Enter
# // then use index to fix test
# for (const item of [1, 2, 3, 4, 5]) {
# expect(item % 2).toBe(0)
# }
# })
# });
#
class French :
    def hello(self):
        return 'Salut'
class SayHello :
    language: French
    def __init__(self, language: French) :
        self.language = language

    def hello(self) :
        return self.language.hello() + ' David!'
