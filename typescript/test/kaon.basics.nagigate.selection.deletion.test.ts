import ModuleA from "../src/moduleA";

describe('navigate, selection and deletion', () => {
    /// Navigate to end block by using ⌘⌥]
    test('This is a test in one line', () => {
        expect(new ModuleA().test()).toEqual('youpii');
    });

    test('deletion', () => {
        // Delete all unused spaces by using delete tow Word End ⌥⌦ / Ctrl+Delete
        expect('                             to much spaces kill spaces').not.toContain('    ');

        /// Delete this line by using ⌘⌫



    });

    test('Delete this test and navigate to begin block by using ⌘⌥[', () => {
        fail('Delete this test and navigate to top');
    });
});
