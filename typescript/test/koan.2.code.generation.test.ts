import {French, SayHello} from "../src/SayHello";

describe('Generate code by using your IDE', () => {
    test('Uncomment and generate class and method by unsing ⌥⏎ / Alt+Enter', () => {
        let buildResult = false;

        //buildResult = new RobotCode().build();

        expect(buildResult).toEqual(true);
    });

    test('extract interface Language of French by using ^T / Ctrl+Shift+Alt+T', () => {
        // const language = English();
        let sayHello = new SayHello(new French());

        let response = sayHello.hello();

        expect(response).toEqual('Hello David!');
    });
});
