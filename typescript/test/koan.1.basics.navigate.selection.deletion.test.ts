import ModuleA from "../src/ModuleA";

const ratio = 0.5;

describe('navigate, selection and deletion', () => {
    test('01 - This test pass, navigate to end block and delete last failing test', () => {
        // TIPS : on small keyboard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
        expect(new ModuleA().test()).toEqual('youpii');
    });

    test('02 - Deletion to next word', () => {
        // Delete all unused spaces by using delete to Word End ⌥⌦ / Ctrl+Delete
        expect('                             to much spaces kill spaces').not.toContain('    ');
    });

    test('03 - Deletion to word start word', () => {
        // Delete MouseForEver by using delete to Word Start ⌥⌫ / Ctrl+Backspace
        expect('delete the last straw!MouseForEver').not.toContain('MouseForEver');
    });

    test('04 - Delete the failing line', () => {
        let deleteUnusedLine = 'This test should pass';
        deleteUnusedLine += '*** delete me by using ⌘⌫ / Ctrl+Y ****';
        expect(deleteUnusedLine).toEqual('This test should pass');
    });

    test('05 - Extend selection', () => {
        // by using ⌥↑ | Ctrl+W
        expect(`***** SELECT ME WITH EXTEND SELECTION*****`).toEqual('selected')
    });

    test('06 - Extend selection code scope', () => {
        // by using ⌥↑ | Ctrl+W
        // extend selection depends on scope, by using ⌥↑ | Ctrl+W select only what needed in line below
        expect(new ModuleA().test()).toEqual('youpii');
        expect(`***** REPLACE ME *****`).toEqual('new ModuleA().test()')
    });

    test('07 - Select next occurrence then edit multi lines', () => {
        // by using ^G | Alt+J
        let message = `Un tiens vaut mieux que deux tu l'auras.`;
        message += `Un tiens vaut mieux que deux tu l'auras.`;
        message += `Un tiens vaut mieux que deux tu l'auras.`;
        message += `Un tiens vaut mieux que deux tu l'auras.`;
        message += `Un tiens vaut mieux que deux tu l'auras.`;
        message += `Un tiens vaut mieux que deux tu l'auras.`;
        expect(message).toEqual('ha ha ha ha ha ha ');
    });

    test('08 - Navigate to sayYes definition', () => {
        // by using ⌘B | Ctrl+B and change behaviour to make this test pass
        expect(new ModuleA().sayYes()).toEqual('yes');
    });

    test('09 - Navigate to file structure to change ratio', () => {
        // Use ⌘F12 / Ctrl+F12 to navigate to ratio declaration
        expect(3 * ratio).toEqual(6);
    });

    test('10 - edit multiple lines with clone caret', () => {
        // Use ⌥,⌥↓ / Ctrl,Ctrl+↓  to clone caret
        // Edit song to match expected lyrics
        const song
            = 'Somewhere over the rainbow'
            + 'Way up high'
            + 'And the dreams that you dream of'
            + 'Once in a lullaby, oh'
        expect(song).toEqual(
              ' > Somewhere over the rainbow\n'
            + ' > Way up high\n'
            + ' > And the dreams that you dream of\n'
            + ' > Once in a lullaby, oh\n'
        )
    });

    test('LAST - Delete this test and navigate back to first test', () => {
        // Use ⌥⌘← / Ctrl+Alt+← to navigate back
        // Use ⌥⌘→ / Ctrl+Alt+→ to navigate forward
        fail('Delete this test and navigate back to first testx');
    });
});
