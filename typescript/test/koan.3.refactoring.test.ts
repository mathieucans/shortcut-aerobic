describe('usefull short cut refactoring', () => {
    test('extract name to a variable by using ⌘⌥V', () => {
        expect('Hello name').toEqual('Hello David!');
    });

    test('extract parameter name by using ⌘⌥P', () => {
        function sayHello() {
            return 'Hello name!';
        }

        expect(sayHello()).toEqual('Hello David!');
    });

    test('extract field name by using ⌘⌥F and affect it in constructor', () => {
        class Hello {
            say() {
                return 'Hello name!';
            }
        }

        expect(new Hello().say()).toEqual('Hello David!');
    });
});
