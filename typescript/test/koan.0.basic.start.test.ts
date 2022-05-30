/// Start by these koans to be friendly with running test with shortcuts
describe('Get started :  navigate to to next failing test', () => {
    test('00 - One shortcut to rule them all', () => {
        // use ⌘⇧A | Ctrl+Shift+A and search a command to toggle case
        expect("SHOULD BE LOWER CASE").toEqual("should be lower case")
    });

    test('01 - first of all, run all test of this file with cursor on top of the file', () => {
        // by using ^⇧R | Ctrl+Shift+F10
        expect('try this new shortcut koan').toBeDefined();
    });

    test('02 - make this test pass and rerun last test execution', () => {
        // by using ^R  |  Shift + F10
        expect(true).toBeFalsy();
    });

    test('Bonus : you cans also navigate to next failing test by using F2', () => {
        expect(`it's quite easier isn't it ?`).toEqual('then make this test pass');
    });

    test('03 - make this test pass and rerun only this test', () => {
        // by using ^⇧R | Crtl+Shift+F10 with cursor inside this test scope
        expect(true).toBeFalsy();
    });

    test('04 - make this test pass and rerun all test of this class', () => {
        // by using ^⇧R | Crtl+Shift+F10 with cursor between two tests
        expect(true).toBeFalsy();
    });

    test('05 - you can open run menu and select the configuration you want', () => {
        // by using ^⌥R | Shift+Alt+F10
        expect(true).toBeFalsy();
    });

    test('06 - you can open run menu and select the configuration you want', () => {
        // by using ^⌥R | Shift+Alt+F10 to run (⌥⌘R | F9 to debug)
        // TIP if you choose Edit configuration,
        // you can select one and modify it to run all test in your workspace
        // Then you will be abble to run all your project tests by using ^⌥R | Shift+Alt+F10
        expect(true).toBeFalsy();
    });

    test('07 - you can open next koan by Navigate to file', () => {
        // by using ⌘⇧O | Ctrl+Shift+N
        expect(true).toBeFalsy();
    });

});
