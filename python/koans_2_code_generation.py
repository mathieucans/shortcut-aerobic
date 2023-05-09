from unittest import TestCase

# Generate code by using your IDE
class Koans2CodeGeneration(TestCase):
    def testKoan01_uncomment_and_generate_class_and_method(self):
        # by using ⌥⏎ | Alt+Enter
        #TIPS : you can navigate through error code by using F2
        buildResult = "code"

        #buildResult = new RobotCode().repeat(buildResult);

        self.assertEqual(buildResult,"codecode")


    def testKoan02_surround_with_try_except(self):
        # Surround the following line with try except by using ⌥⌘T | Ctrl+Alt+T
        raise Exception('surround me with try except')

#
# test('03 - extract interface Language from French', () => {
# // Extract interface Language of French and generate English langage.
# // Then change SayHello parameter and field type to speak english.
# // Tips : To extract interface, display the refactoring menu by using ^T | Ctrl+Shift+Alt+T
# // Check the methods you want to have in your interface and make English implement it by using ⌥⏎ | Alt+Enter
#
# // const language = new English();      // Uncomment this line
# const language = new French();          // Comment this line
#
# let sayHello = new SayHello(language);
#
# let response = sayHello.hello();
#
# expect(response).toEqual('Hello David!');
# });
# });
#
# // Extract language interface
# class French {
# hello() {
# return 'Salut';
# }
# }
#
# class SayHello {
# constructor(private readonly language: French) {
#
# }
#
# hello() {
# return `${this.language.hello()} David!`;
# }
# }
#
