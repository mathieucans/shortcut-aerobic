export class Koan4Bonus {
    goToTest() {
        // by using ⌘⇧T / Ctrl+Shift+T
        throw 'remove me and go back to test'
        return 'go to test'
    }

    inside() {
        // Inline following method with ⌥⌘N / Ctrl+Alt+N
        // and change returned string for inside requirement
        return this.inlinedMe();
    }

    outside() {
        return this.inlinedMe();
    }

    private inlinedMe() {
        return 'outside';
    }
}
