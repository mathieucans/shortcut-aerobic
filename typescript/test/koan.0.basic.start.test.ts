describe('Get started :  navigate to to next failing test', () => {
    test('first of all : run all test of this file by using ^⇧R with cursor on top of the file', () => {
        expect('try this new shortcut koan').toBeDefined();
    });

    test('use ⌘4 and arrow to select the first failing test', () => {
        expect('then press ⌘⏎, ␛ to navigate to source').toEqual('then make this test pass');
    });

    test('you cans also navigate to next failing test by using F2', () => {
        expect(`it's quite easier isn't it ?`).toEqual('then make this test pass');
    });

    test('make this test pass and rerun last test execution by using ^R', () => {
        expect(true).toBeFalsy();
    });

    test('make this test pass and rerun only this test by using ^⇧R with cursor in the test scope', () => {
        expect(true).toBeFalsy();
    });

    test('make this test pass and rerun all test by using ^⇧R with cursor between two tests', () => {
        expect(true).toBeFalsy();
    });

});
