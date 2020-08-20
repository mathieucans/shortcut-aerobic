using System;
using Xunit;

namespace dotnetcore
{
    public class GetStarted_run_test_and_navigate_to_next_failing_test
    {

        [Fact]
        public void Koan01_run_all_of_the_solution()
        {
            Assert.Equal("by using Ctrl+U,L", "done");
        } 

        [Fact]
        public void Koan02_run_all_test_of_this_file()
        {
            Assert.Equal("by using Ctrl+U,R with cursor beetween two test", "done");
        } 
        
        [Fact]
        public void Koan03_Run_last_test_execution()
        {
            Assert.Equal("by using Ctrl+U,Y", "done");
        }

        [Fact]
        public void Koan04_Navigate_to_next_or_previous_test()
        {
            Assert.Equal("by using Alt+↑ or Alt+↓", "done");            
        }
        
        [Fact]
        public void Koan05_Run_this_test_only()
        {
            Assert.Equal("by using ^⇧R with cursor inside this test", "done");
        }
        
    }
}