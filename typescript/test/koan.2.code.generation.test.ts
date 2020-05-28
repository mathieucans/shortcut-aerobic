import {French, SayHello} from "../src/SayHello";

describe('Generate code by using your IDE', () => {
    test('Uncomment and generate class and method by unsing ⌥⏎ / Alt+Enter', () => {
        // TIPS : you can navigate through error code by using F2
        let buildResult = "code";

        //buildResult = new RobotCode().repeat(buildResult);

        expect(buildResult).toEqual("codecode");
    });

    test('extract interface Language of French by using ^T / Ctrl+Shift+Alt+T', () => {
        // TIPS : Navigate to French implementation by using ⌘B / Ctrl+B
        // const language = English();
        let sayHello = new SayHello(new French());

        let response = sayHello.hello();

        expect(response).toEqual('Hello David!');
    });
});
