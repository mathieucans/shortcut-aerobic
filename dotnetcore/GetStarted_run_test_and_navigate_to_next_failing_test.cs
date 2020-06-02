using System;
using Xunit;

namespace dotnetcore
{
    public class GetStarted_run_test_and_navigate_to_next_failing_test
    {
        [Fact]
        public void Run_all_test_of_this_file()
        {
            Assert.Equal("by using ^⇧R with cursor beetween two test", "done");
        } 
        
        [Fact]
        public void Run_this_test_only()
        {
            Assert.Equal("Make this test pass", "done");
        }
        
        [Fact]
        public void Run_last_test_execution()
        {
            Assert.Equal("Make this test pass", "done");
        }
    }
}