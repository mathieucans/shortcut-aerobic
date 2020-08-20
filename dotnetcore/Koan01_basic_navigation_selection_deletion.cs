using System;
using System.Collections.Generic;
using System.Text;
using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Koan01_basic_navigation_selection_deletion
    {
        [Fact]
        public void Koan01_Navigate_to_end_of_file()
        {
            Assert.False(true, "by using Ctrl+END");
        }
        
        [Fact]
        public void Koan02_Delete_next_word()
        {
            Assert.False(true, "by using Ctrl+Suppr");
        }

        [Fact]
        public void Koan03_Delete_to_word_start()
        {
            Assert.False(true, "by using Ctrl+Del");
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


    }
}
