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
    }
}