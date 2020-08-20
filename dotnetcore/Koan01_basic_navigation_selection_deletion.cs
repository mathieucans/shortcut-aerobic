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
            "by using Ctrl+END".Should().Be("done");
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
        public void Koan06_Select_next_occurence()
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
    }
}