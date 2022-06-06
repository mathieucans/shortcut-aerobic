describe('some bonus shortkut', () => {
    test('cut up to line end', () => {
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
});
