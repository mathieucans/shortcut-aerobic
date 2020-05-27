describe('usefull short cut refactoring', () => {
    test('extract variable hello and concat world by using ⌘⌥V', () => {
        expect('Hello').toEqual('Hello David!');
    });

    test('extract parameter name by using ⌘⌥P', () => {
        function sayHello() {
            return 'Hello name!';
        }

        expect(sayHello()).toEqual('Hello David!');
    });
});
