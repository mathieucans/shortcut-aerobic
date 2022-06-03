
using dotnetcore.src;
using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Koans1BasicNavigationSelectionDeletion
    {
        [Fact]
        void Koan01_navigate_to_end_block_and_find_the_key_to_open_the_door() {
            // Use Ctrl+END
            // TIPS : on laptop keyboard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
            new ModuleA().openTheDoor("the key is at the end of this file").Should().Be("unlock");
        }

        [Fact]
        public void Koan02_Delete_next_word()
        {
            // Delete all unused spaces by using delete to Word by using Ctrl+Suppr
            "                             to much spaces kill spaces".Should().Be("to much spaces kill spaces");
        }

        [Fact]
        public void Koan03_Delete_to_word_start()
        {
            // Delete MouseForEver by using delete to Word Start 
            "delete the last straw!MouseForEver".Should().Be("delete the last straw!");
        }

        [Fact]
        public void Koan04_Delete_the_failing_line()
        {
            var deleteUnusedLine = "This test should pass";
            deleteUnusedLine += "*** delete me by using Ctrl+L ****";
            deleteUnusedLine.Should().Be("This test should pass");
        }

        [Fact]
        public void Koan05_Extend_selection()
        {
            // by using Ctrl+W / Ctrl+Alt+Right
            "***** SELECT ME WITH EXTEND SELECTION *****".Should().Be("selected");
        }

        [Fact]
        void Koan06_extend_selection_code_scope() {
            // extend selection depends on scope, by using Ctrl+W select only what needed in line below
            new ModuleA().Test().Should().Be("youpii");
            // and paste it in the folowing assertion
            "**** REPLACE ME ****".Should().Be("new ModuleA().test()");
        }

        [Fact]
        public void Koan07_edit_multiple_lines_with_clone_caret() {
            // Use Ctrl+Alt+↓ to clone caret
            // Edit song to match expected lyrics
            var song
                    = "Somewhere over the rainbow"
                    + "Way up high"
                    + "And the dreams that you dream of"
                    + "Once in a lullaby, oh"
                    ;
            song.Should().Be(" > Somewhere over the rainbow\n"
                    + " > Way up high\n"
                    + " > And the dreams that you dream of\n"
                    + " > Once in a lullaby, oh\n"
            );
        }

        [Fact]
        public void Koan08_Select_next_occurence()
        {
            // Next occurence selection is not available neither in Visual Studio nor Resharper
            // To enable this amazing feature install NextOccurence extension to VisualStudio https://marketplace.visualstudio.com/items?itemName=thomaswelen.SelectNextOccurrence
            // Then map next Occurence to your favorite short cut (Intellij programers use Alt+J on windows)
            var message = "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message.Should().Be("ha ha ha ha ha ha ");
        }

        [Fact]
        public void Koan09_Navigate_to_sayYes_definition()
        {
            // by using Ctrl+B and change behaviour to make this test pass
            new ModuleA().SayYes().Should().Be("yes");
        }

        [Fact]
        public void Koan10_Navigate_to_ModuleA_class()
        {
            "by using Ctrl+Alt+Shift+N".Should().Be("done");
        }
        
        [Fact]
        public void Koan11_Navigate_to_ModuleA_file()
        {
            "by using Ctrl+Shift+N".Should().Be("done");
        }

        [Fact]
        void Koan12_Navigate_back_and_forward() {
            // Use navigate back to find and copy the first verse of the song
            // Use ⌥⌘← / Ctrl+Alt+← to navigate back
            // Use ⌥⌘→ / Ctrl+Alt+→ to navigate forward
            new ModuleA().theFirstVerseOfTheSongIs("copy here the first verse of the song")
                    .Should().Be(true);
        }
    }
}
// the key is "trash your mouse"
// TIPS : on laptop keyboard, you can navigate to top of file by using ⌘A,←  / Ctrl+A, ←
