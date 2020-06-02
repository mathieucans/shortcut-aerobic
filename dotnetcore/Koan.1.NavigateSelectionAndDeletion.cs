using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Navigate_selection_and_deletion
    {
        [Fact]
        public void navigate_to_end_of_file()
        {
            "This test pass, use ⌘⌥] to navigate to end block and delete last failing test".Should().Be("done");
        }

        [Fact]
        public void Deletion_to_next_word()
        {
            // Delete all unused spaces by using delete to Word End ⌥⌦ / Ctrl+Delete
            "                             to much spaces kill spaces".Should().NotBe("    ");
        }

        [Fact]
        public void Deletion_to_word_start_work()
        {
            // Delete MouseForEver by using delete to Word Start ⌥⌫ / Ctrl+Backspace
            "delete the last straw!MouseForEver".Should().NotBe("MouseForEver");
        }

        [Fact]
        public void Delete_the_failing_line()
        {
            var deleteUnusedLine = "This test should pass";
            deleteUnusedLine += "*** delete me by using ⌘⌫ / Ctrl+Y ****";
            deleteUnusedLine.Should().Be("This test should pass");
        }

        [Fact]
        public void Extend_selection()
        {
            "****SELECT ME WITH EXTEND SELECTION * ****".Should().Be("selected");
        }

        [Fact]
        public void Extend_selection_code_scope_by_using()
        {
            new ModuleA().test().Should().Be("youpii");
            "*****REPLACE ME * ****".Should().Be("new ModuleA().test()");
        }

        [Fact]
        public void Select_next_occurrence_then_edit_multi_lines()
        {
            var message = "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message += "Un tiens vaut mieux que deux tu l'auras.";
            message.Should().Be("ha ha ha ha ha ha ");
        }

        public class ModuleA
        {
            public string test()
            {
                return "youpii";
            }

            public string sayYes()
            {
                throw new System.NotImplementedException();
            }
        }

        [Fact]
        public void Delete_this_test_and_navigate_to_to_of_file()
        {
            "Delete this test and navigate to top".Should().BeEmpty();
        }

        [Fact]
        public void Navigate_to_sayYes_definition_by_using() {
            new ModuleA().sayYes().Should().Be("yes");
        }
}

}