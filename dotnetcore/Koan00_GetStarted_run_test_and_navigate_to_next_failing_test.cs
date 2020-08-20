using System;
using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Koan00_GetStarted_run_test_and_navigate_to_next_failing_test
    {
        [Fact]
        public void Koan01_run_all_of_the_solution()
        {
            "by using Ctrl+U,L".Should().Be("done");
        } 

        [Fact]
        public void Koan02_run_all_test_of_this_file()
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
            "by using Alt+↑ or Alt+↓".Should().Be("done");            
        }
        
        [Fact]
        public void Koan05_Run_this_test_only()
        {
            "by using ^⇧R with cursor inside this".Should().Be("done");
        }
        
    }
}