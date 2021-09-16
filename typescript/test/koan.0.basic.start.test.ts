describe('Get started :  navigate to to next failing test', () => {
    test('first of all : run all test of this file with cursor on top of the file by using ^⇧R / Ctrl+Shift+F10', () => {
        expect('try this new shortcut koan').toBeDefined();
    });

    test('make this test pass and rerun last test execution by using ^R / Shift + F10', () => {
        expect(true).toBeFalsy();
    });

    test('you cans also navigate to next failing test by using F2', () => {
        expect(`it's quite easier isn't it ?`).toEqual('then make this test pass');
    });

    test('make this test pass and rerun only this test by using ^⇧R / Crtl+Shift+F10 with cursor inside this test scope', () => {
        expect(true).toBeFalsy();
    });

    test('make this test pass and rerun all test by using ^⇧R / Crtl+Shift+F10 with cursor between two tests', () => {
        expect(true).toBeFalsy();
    });

    test('you can open run menu by using ^⌥R | Shift+Alt+F10 and select the configuration you want', () => {
        // TIP if you choose Edit configuration,
        // you can select one and modify it to run all test in your workspace
        // Then you will be abble to run all your project tests by using ^⌥R | Shift+Alt+F10
        expect(true).toBeFalsy();
    });

    test('you can open next koan by Navigate to file by using ⌘⇧O / Ctrl+Shift+N', () => {
        expect(true).toBeFalsy();
    });

});
