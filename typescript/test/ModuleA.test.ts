import ModuleA from "../src/moduleA";

describe('My test', () => {
    test('first test', () => {
        const test = new ModuleA().test();

        expect(test).toEqual("youpii");
    });
});
