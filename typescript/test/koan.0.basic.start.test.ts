describe('how to navigate to to next failing test', () => {
    test('first of all : run all test by using ^⇧R', () => {
        expect('try this new shortcut koan').toBeDefined();
    });

    test('use ⌘4 and arrow to select the first failing test', () => {
        expect('then press ⌘⏎, ␛ to navigate to source').toEqual('then make this test pass');
    });
});
