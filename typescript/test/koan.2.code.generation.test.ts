describe('Generate code by using your IDE', () => {
    test('Uncomment and generate class and method by unsing ⌥⏎ / Alt+Enter', () => {
        // TIPS : you can navigate through error code by using F2
        let buildResult = "code";

        //buildResult = new RobotCode().repeat(buildResult);

        expect(buildResult).toEqual("codecode");
    });

    test('extract interface Language of French by using ^T / Ctrl+Shift+Alt+T', () => {
        // Uncomment this line
        // const language = new English();
        // Comment this line
        const language = new French();
        let sayHello = new SayHello(language);

        let response = sayHello.hello();

        expect(response).toEqual('Hello David!');
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
