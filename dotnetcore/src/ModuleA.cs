using System;

namespace dotnetcore.src
{
    public class ModuleA
    {
        public String SayYes()
        {
            return "no";
        }

        public String Test()
        {
            return "youpii";
        }
        
        public String openTheDoor(String key) {
            return "trash your mouse" == key ? "unlock" : "locked";
        }

        public Boolean theFirstVerseOfTheSongIs(String firstVerse) {
           return firstVerse.ToLower().Contains("somewhere over the rainbow");
        }

    }
}