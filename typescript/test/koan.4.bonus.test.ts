import {Koan4Bonus} from "../src/koan.4.bonus";

describe('some bonus shortkut', () => {
    test('01 - cut up to line end', () => {
        const lines = `keep --- delete me with ^K
the --- this short couts
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

    test('04 - run anything0', () => {
        // by using Double ^ / Ctrl, Ctrl
        expect('then type npm run test').toEqual('all green')
    });
});
