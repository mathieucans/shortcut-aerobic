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
}
