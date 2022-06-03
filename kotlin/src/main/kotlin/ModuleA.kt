class ModuleA {
    fun test(): String {
        return "youpii"
    }

    fun sayYes(): String {
        return "Yes"
    }

    fun openTheDoor(key: String): String {
        return when (key) {
            "trash your mouse" -> "unlock"
            else -> "locked"
        }
    }

    fun theFirstVerseOfTheSongIs(firstVerse: String): Boolean {
        return firstVerse.toLowerCase().contains("somewhere over the rainbow")
    }
}
