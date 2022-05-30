using Xunit;
using FluentAssertions;

namespace dotnetcore
{
    /// <summary>
    /// Start by these koans to be friendly with running test with shortcuts
    /// </summary>
    /// Note that all short cut tips are given for resharper with Visual studio scheme
    public class Koans0BasicsStart
    {
        [Fact]
        void Koan00_One_shortcut_to_rule_them_all(){
            // Ctrl+Shift+A and search a command to toggle case
            "SHOULD BE LOWER CASE".Should().Be("should be lower case");
        }   

        [Fact]
        public void Koan01_Run_all_test_of_the_solution()
        {
            // by using Ctrl+U,L to run all test
            "Then change this to make this test pass".Should().Be("done");
        } 

        [Fact]
        public void Koan02_Run_all_test_of_this_file()
        {
            // by using Ctrl+U,R with cursor beetween two test
            "Then change this to make this test pass".Should().Be("done");
        } 
        
        [Fact]
        public void Koan03_Run_last_test_execution()
        {
            // by using Ctrl+U,U
            "Then change this to make this test pass".Should().Be("done");
        }

        [Fact]
        public void Koan04_Navigate_to_next_or_previous_test()
        {
            // by using next member command Alt+↑ or Alt+↓
            "Then change this to make this test pass".Should().Be("done");            
        }
        
        [Fact]
        public void Koan05_Run_this_test_only()
        {
            // by using Ctrl+U,R with cursor inside this test
            "Then change this to make this test pass".Should().Be("done");
        }

        [Fact]
        public void Koan06_looking_for_an_unknown_shortcut()
        {
            // you can always look for command with Ctrl+Shift+A and type your command (for exemple "Comment")
            true.Should().BeFalse();
        }
        
        [Fact]
        void Koan07_you_can_open_next_koan_by_Navigate_to_file() {
            // by using Ctrl+N and search koan01
            true.Should().BeFalse();
        }
    }
}