class Koan4bonus {
    fun goToTest(): String {
        // by using ⌘⇧T / Ctrl+Shift+T
        return "remove me, uncomment the following line and go back to test"
        // return "go to test";
    }

    fun inside(): String {
        // Inline following method with ⌥⌘N / Ctrl+Alt+N
        // and change returned string for inside requirement
        return inLineMe()
    }

    fun outside(): String {
        return inLineMe()
    }

    private fun inLineMe() = "outside"

}
