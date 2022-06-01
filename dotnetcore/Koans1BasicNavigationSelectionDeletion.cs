
using dotnetcore.src;
using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Koans1BasicNavigationSelectionDeletion
    {
        [Fact]
        void Koan01_this_test_pass_navigate_to_end_block_and_delete_last_failing_test() {
            // Use Ctrl+END
            // TIPS : on laptop keyboard, you can navigate to end of file by using ⌘A,→  / Ctrl+A, →
            true.Should().BeTrue();
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
        public void Koan07_Select_next_occurence()
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
        public void Koan08_Navigate_to_sayYes_definition()
        {
            // by using Ctrl+B and change behaviour to make this test pass
            new ModuleA().SayYes().Should().Be("yes");
        }

        [Fact]
        public void Koan09_Navigate_to_ModuleA_class()
        {
            "by using Ctrl+Alt+Shift+N".Should().Be("done");
        }
        
        [Fact]
        public void Koan10_Navigate_to_ModuleA_file()
        {
            "by using Ctrl+Shift+N".Should().Be("done");
        }

        [Fact]
        public void Koan11_edit_multiple_lines_with_clone_caret() {
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
        void KoanLAST_delete_this_test_and_navigate_back_to_first_test() {
            // Use CTRL + - to navigate back
            // Use CTRL + SHIFT + - to navigate forward
            Assert.False(true,"Delete this test and navigate back to first test");
        }

    }
}