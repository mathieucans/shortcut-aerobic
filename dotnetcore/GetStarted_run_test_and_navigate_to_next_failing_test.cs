using System;
using Xunit;
using FluentAssertions;

namespace dotnetcore
{
    public class GetStarted_run_test_and_navigate_to_next_failing_test
    {
        [Fact]
        public void Run_all_test_of_this_file()
        {
            "by using ^⇧R with cursor beetween two test".Should().Be("done");
        } 
        
        [Fact]
        public void Run_last_test_execution()
        {
            "by using ⌘;,Y".Should().Be("done");
        }

        [Fact]
        public void Navigate_to_next_or_previous_test()
        {
            "by using ⌘↑ or ⌘↓".Should().Be("done");            
        }
        
        [Fact]
        public void Run_this_test_only()
        {
            "by using ^⇧R with cursor inside this test".Should().Be("done");
        }
        
    }
}