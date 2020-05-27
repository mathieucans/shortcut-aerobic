import {French, SayHello} from "../src/SayHello";

describe('Generate code by using your IDE', () => {
    test('use ⌥⏎ to generate class and method ', () => {
        let buildResult = false;

        //buildResult = new RobotCode().build();

        expect(buildResult).toEqual(true);
    });

    test('extract interface Language of French to make this test pass', () => {
        // const language = English();
        let sayHello = new SayHello(new French());

        let response = sayHello.hello();

        expect(response).toEqual('Hello David!');
    });
});
