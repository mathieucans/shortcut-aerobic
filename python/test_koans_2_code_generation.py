from unittest import TestCase


# Generate code by using your IDE
class TestKoans2CodeGeneration(TestCase):
    def testKoan01_uncomment_and_generate_class_and_method(self):
        # by using ⌥⏎ | Alt+Enter
        # TIPS : you can navigate through error code by using F2
        build_result = "code"

        # build_result = new RobotCode().repeat(buildResult);

        self.assertEqual(build_result, "codecode")

    def testKoan02_surround_with_try_except(self):
        # Surround the following line with try except by using ⌥⌘T | Ctrl+Alt+T
        raise Exception('surround me with try except')

    def testKoan03_extract_abstract_class_Language_from_French(self):
        # Extract abstract class Language of French and generate English langage.
        # Then change SayHello parameter and field type to speak english.
        # Tips : To extract superclass, display the refactoring menu by using ^T | Ctrl+Shift+Alt+T
        # Check the methods you want to have in your abstract class and make English
        # implement it by using ⌥⏎ | Alt+Enter

        # language = English()     # Uncomment this line
        language = French()  # Comment this line

        say_hello = SayHello(language)

        response = say_hello.hello()

        self.assertEqual(response, "Hello David!")


# Extract language interface from language
class French:
    def hello(self):
        return 'Salut'


class SayHello:
    language: French

    def __init__(self, language: French):
        self.language = language

    def hello(self):
        return self.language.hello() + " David!"
