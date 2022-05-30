
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
            "by using Ctrl+Suppr".Should().Be("done");
        }

        [Fact]
        public void Koan03_Delete_to_word_start()
        {
            "by using Ctrl+Del".Should().Be("");
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
            "***** SELECT ME WITH EXTEND SELECTION WITH Ctrl+W*****".Should().Be("selected");
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
            // by using Ctrl+B
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
        void Koan11_delete_this_test_and_navigate_to_top_of_file() {
            // TIPS on laptop keyboard you can using Ctrl+A,←
            // You can delete the folowing line by using Ctrl+L that cut the entire line
            Assert.False(true,"Delete this test and navigate to top");
        }

    }
}