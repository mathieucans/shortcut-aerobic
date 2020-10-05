using Xunit;
using FluentAssertions;

namespace dotnetcore
{
    /// <summary>
    /// Start by theses koans to be friendly with running test with shortcuts
    /// </summary>
    /// Not that all short cut tips are given for resharper with Visual studio scheme
    public class GetStarted_run_test_and_navigate_to_next_failing_test
    {
        [Fact]
        public void Koan01_Run_all_test_of_the_solution()
        {
            "by using Ctrl+U,L to run all test".Should().Be("done");
        } 

        [Fact]
        public void Koan02_Run_all_test_of_this_file()
        {
            "by using Ctrl+U,R with cursor beetween two test".Should().Be("done");
        } 
        
        [Fact]
        public void Koan03_Run_last_test_execution()
        {
            "by using Ctrl+U,U".Should().Be("done");
        }

        [Fact]
        public void Koan04_Navigate_to_next_or_previous_test()
        {
            "by using next member command Alt+↑ or Alt+↓".Should().Be("done");            
        }
        
        [Fact]
        public void Koan05_Run_this_test_only()
        {
            "by using Ctrl+U,R with cursor inside this test".Should().Be("done");
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