describe('Generate code by using your IDE', () => {
    test('01 - uncomment and generate class and method', () => {
        // by unsing ⌥⏎ | Alt+Enter
        // TIPS : you can navigate through error code by using F2
        let buildResult = "code";

        //buildResult = new RobotCode().repeat(buildResult);

        expect(buildResult).toEqual("codecode");
    });

    test('02 - surround with try catch', () => {
        // Surround the following line with try catch by using ⌥⌘T | Ctrl+Alt+T
        throw new Error('surround me with try catch');
    });

    test('03 - extract interface Language from French', () => {
        // Extract interface Language of French and generate English langage.
        // Then change SayHello parameter and field type to speak english.
        // Tips : To extract interface, display the refactoring menu by using ^T | Ctrl+Shift+Alt+T
        // Check the methods you want to have in your interface and make English implement it by using ⌥⏎ | Alt+Enter

        // const language = new English();      // Uncomment this line
        const language = new French();          // Comment this line

        let sayHello = new SayHello(language);

        let response = sayHello.hello();

        expect(response).toEqual('Hello David!');
    });
});

// Extract language interface
class French {
    hello() {
        return 'Salut';
    }
}

class SayHello {
    constructor(private language: French) {

    }

    hello() {
        return `${this.language.hello()} David!`;
    }
}
