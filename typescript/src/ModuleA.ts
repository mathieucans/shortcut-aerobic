export default class ModuleA {

    test() {
        return 'youpii';
    }

    sayYes() {
        return 'no';
    }

    openTheDoor(key: string) {
        return key === 'trash your mouse' ? 'unlocked' : 'locked';
    }

    theFirstVerseOfTheSongIs(firstVerse: string): boolean {
        return firstVerse.toLowerCase().includes("somewhere over the rainbow");
    }
}
