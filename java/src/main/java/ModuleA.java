public class ModuleA {
    public String test() {
        return "youpii";
    }

    public String sayYes() {
        return "no";
    }

    public String openTheDoor(String key) {
        return "trash your mouse".equals(key) ? "unlock" : "locked";
    }

    public boolean theFirstVerseOfTheSongIs(String firstVerse) {
        return firstVerse.toLowerCase().contains("somewhere over the rainbow");
    }
}
