describe('usefull shortcuts for refactoring.', () => {
    test('Bonus : replace simple quote with template string first by using ⌥⏎ / Alt+Enter', () => {
        expect('C est le déluge!').toEqual(`C'est le déluge!`);
    });

    test('01 - extract firstname to a variable', () => {
        // extract variable by using ⌘⌥V | Ctrl+Alt+V
        expect('Hello firstname!').toEqual('Hello David!');
    });

    test('02 - extract parameter firstname', () => {
        // Extract parameter inside the sayHello function by using ⌘⌥P | Ctrl+Alt+P
        function sayHello() {
            return `Hello firstname!`;
        }

        expect(sayHello()).toEqual('Hello David!');
    });

    test('03 - extract field firstname and affect it in constructor', () => {
        // extract field by selecting firstname and by using ⌘⌥F | Ctrl+Alt+F
        // Choose constructor initialization
        // then extract parameter to make test pass
        class Hello {
            say() {
                return `Hello firstname!`;
            }
        }

        expect(new Hello().say()).toEqual('Hello David!');
    });

    test('04 - extract method hello', () => {
        class Hello {
            constructor(private lang: string) {
            }
            say(firstName: string) {
                // // Extract method from the following line by using ⌘⌥M | Ctrl+Alt+M
                let hello = '';
                switch (this.lang.toLowerCase()) {
                    case 'fr':
                        hello = 'Bonjour';
                        break;
                    case 'en':
                        hello = 'Hello';
                        break;
                }
                // to this line
                return `${hello} ${firstName}!`;
            }
        }

        expect(new Hello('fr').say('David')).toEqual('Bonjour David!');
        expect(new Hello( 'en').say('David')).toEqual('Hello David!');
        expect(new Hello('hsqlf').say('David')).toEqual(' David!');
    });


    beforeEach(() => {

    });

    test('05 - move variables into describe scope and init it in  beforeEach function', () => {
        // TIPS : split affectation and declaration by using ⌥⏎ / Alt+Enter
        // then use move Statement up by using ⌘⇧↑ / Ctrl+Shift+Up
        const language = new French();
        const sayHello = new SayHello(language);

        expect(sayHello.hello()).toContain(language.hello());
    });
});

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
