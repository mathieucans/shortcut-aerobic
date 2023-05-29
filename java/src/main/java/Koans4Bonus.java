public class Koans4Bonus {
    public String goToTest() {
        // by using ⌘⇧T / Ctrl+Shift+T
        return "remove me, uncomment the following line and go back to test";
        // return "go to test";
    }

    public String inside() {
        // Inline following method with ⌥⌘N / Ctrl+Alt+N
        // and change returned string for inside requirement
        return inLineMe();
    }
    public String outside() {
        return inLineMe();
    }

    private String inLineMe() {
        return "outside";
    }
}
