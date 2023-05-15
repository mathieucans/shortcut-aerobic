import {Koan4Bonus} from "../src/koan.4.bonus";

describe('some bonus shortcut', () => {
    test('01 - cut up to line end', () => {
        const lines = `keep --- delete me with ^K
the --- this short cuts
firsts --- works
words --- in terminal too                 
 `
        expect(lines).toEqual(`keep
the
firsts
words
 `)
    });

    test('02 - past from history', () => {
        // by using ⌘⇧V / Ctrl+Shift+V
        expect('past here an old text you have copy').toEqual(' --- works')
    });

    test('03 - got to same named test', () => {
        // by using ⌘⇧T / Ctrl+Shift+T
        expect(new Koan4Bonus().goToTest()).toEqual('go to test')
    });

    test('04 - inline method', () => {
        // Go inside method and introduce duplication by inlining method
        expect(new Koan4Bonus().inside()).toEqual('inside');
        expect(new Koan4Bonus().outside()).toEqual('outside');
    });

    test('05 - run anything0', () => {
        // by using Double ^ / Ctrl, Ctrl
        expect('then type npm run test').toEqual('all green')
    });
});
