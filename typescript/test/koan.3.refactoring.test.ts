import {French, SayHello} from "../src/SayHello";

describe('usefull short cut refactoring.', () => {
    test('replace simple quote with template string first by using ⌥⏎ / Alt+Enter', () => {
        expect('C est le déluge!').toEqual(`C'est le déluge!`);
    })

    test('extract firstname to a variable by using ⌘⌥V / Ctrl+Alt+V', () => {
        expect('Hello firstname!').toEqual('Hello David!');
    });

    test('extract parameter firstname by using ⌘⌥P / Ctrl+Alt+P', () => {
        function sayHello() {
            return `Hello firstname!`;
        }

        expect(sayHello()).toEqual('Hello David!');
    });

    test('extract field firstname by using ⌘⌥F / Ctrl+Alt+F and affect it in constructor', () => {
        class Hello {
            say() {
                return `Hello firstname!`;
            }
        }

        expect(new Hello().say()).toEqual('Hello David!');
    });

    test('extract method hello by using ⌘⌥M / Ctrl+Alt+M', () => {
        class Hello {
            constructor(private lang: string) {
            }
            say(firstName: string) {
                // Select from the following line
                let hello = '';
                switch (this.lang.toLowerCase()) {
                    case 'fr':
                        hello = 'Bonjour';
                        break;
                    case 'en':
                        hello = 'Hello';
                        break;
                }
                // to this line to extract method
                return `${hello} ${firstName}!`;
            }
        }

        expect(new Hello('fr').say('David')).toEqual('Bonjour David!');
        expect(new Hello( 'en').say('David')).toEqual('Hello David!');
        expect(new Hello('hsqlf').say('David')).toEqual(' David!');
    });


    beforeEach(() => {

    });

    test('move variables into describe scope and init it in  beforeEach function', () => {
        // TIPS : split affectation and declaration by using ⌥⏎ / Alt+Enter
        const language = new French();
        const sayHello = new SayHello(language);

        expect(sayHello.hello()).toContain(language.hello());
    });
});
