describe('Get started :  navigate to to next failing test', () => {
    test('first of all : run all test of this file by using ^⇧R', () => {
        expect('try this new shortcut koan').toBeDefined();
    });

    test('use ⌘4 and arrow to select the first failing test', () => {
        expect('then press ⌘⏎, ␛ to navigate to source').toEqual('then make this test pass');
    });

    test('you cans also navigate to next failing test by using F2', () => {
        expect(`it's quite easier isn't it ?`).toEqual('then make this test pass');
    });
});
