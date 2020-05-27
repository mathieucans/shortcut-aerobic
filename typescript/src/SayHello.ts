export class French {
    hello() {
        return 'Salut';
    }
}

export class SayHello {
    constructor(private language: French) {

    }

    hello() {
        return `${this.language.hello()} David!`;
    }
}
