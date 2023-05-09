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
        def sayHello() :
           return 'Hello firstname!'

        self.assertEqual(sayHello(),'Hello David!')
#
# test('03 - extract field firstname and affect it in constructor', () => {
#                                                                         // extract field by selecting firstname and by using ⌘⌥F | Ctrl+Alt+F
#                                                                                                                                // Choose constructor initialization
#                                                                                                                                                      // then extract parameter to make test pass
# class Hello {
# say() {
# return `Hello firstname!`;
# }
# }
#
# expect(new Hello().say()).toEqual('Hello David!');
# });
#
# test('04 - extract method hello', () => {
#                                         // This test already passed.
#                                                              // Refactoring Hello class to extract a method that say hello
# class Hello {
# constructor(private lang: string) {
# }
#
# say(firstName: string) {
#                        // // Extract method from the following line by using ⌘⌥M | Ctrl+Alt+M
# let hello = '';
# switch (this.lang.toLowerCase()) {
#     case 'fr': \
# hello = 'Bonjour';
# break;
# case 'en':
# hello = 'Hello';
# break;
# }
# // to this line
# return `${hello} ${firstName}!`;
# }
# }
#
# expect(new Hello('fr').say('David')).toEqual('Bonjour David!');
# expect(new Hello('en').say('David')).toEqual('Hello David!');
# expect(new Hello('hsqlf').say('David')).toEqual(' David!');
# });
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
