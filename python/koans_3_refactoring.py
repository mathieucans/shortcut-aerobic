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

    def test03_extract_field_firstname_and_affect_it_in_constructor(self):
        # extract field by selecting firstname and by using ⌘⌥F | Ctrl+Alt+F
        class Hello:
            def say(self):
                return 'Hello firstname!';

        self.assertEqual(Hello().say(), 'Hello David!')

    def test04_extract_method_hello(self):
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
#
#
# beforeEach(() => {
#
# });
#
# test('05 - move variables into describe scope and init it in beforeEach function', () => {
#                                                                                          // TIPS : split affectation and declaration by using ⌥⏎ / Alt+Enter
#                                                                                                                                                    // then use move Statement up by using ⌘⇧↑ / Ctrl+Shift+Up
# const language = new French();
# const sayHello = new SayHello(language);
#
# expect(sayHello.hello()).toContain(language.hello());
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
# class French {
# hello() {
# return 'Salut';
# }
# }
#
# class SayHello {
# constructor(private language: French) {
#
# }
#
# hello() {
# return `${this.language.hello()} David!`;
# }
# }
