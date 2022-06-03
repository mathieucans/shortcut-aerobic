class ModuleA {
    fun test(): String {
        return "youpii"
    }

    fun sayYes(): String {
        return "No"
    }

    fun openTheDoor(key: String): String {
        return when (key) {
            "trash your mouse" -> "unlock"
            else -> "locked"
        }
    }
}
