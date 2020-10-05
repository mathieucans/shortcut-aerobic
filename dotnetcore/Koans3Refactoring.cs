using System;
using System.Collections.Generic;
using System.Text;
using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Koans3Refactoring
    {
        [Fact]
        void Koan01_extract_firstname_to_a_variable()
        {
            // extract variable by using Ctrl+R,V and replace the text
            "Hello firstname!".Should().Be("Hello David!");
        }

        [Fact]
        void Koan02_extract_parameter_firstname()
        {
            // Extract parameter inside the SayHello function by selecting firstname and using Ctrl+R,P
            SayHello().Should().Be("Hello David!");
            SayHello().Should().Be("Hello Vincent!");
        }

        String SayHello()
        {
            return "Hello firstname!";
        }

        [Fact]
        void Koan03_extract_field_firstname_and_affect_it_in_constructor()
        {
            // extract field by selecting firstname and by using Ctrl+R,F
            // Choose constructor initialization
            // then extract parameter to make test pass
            new HelloForKoan03().say().Should().Be("Hello David!");
            new HelloForKoan03().say().Should().Be("Hello Vincent!");
        }

        class HelloForKoan03
        {
            public String say()
            {
                return "Hello firstname!";
            }
        }

        [Fact]
        void Koan04_extract_method_hello()
        {
            // by using ⌘⌥M | Ctrl+Alt+M
            new HelloForKoan04("fr").say("David").Should().Be("Bonjour David!");
            new HelloForKoan04("en").say("David").Should().Be("HelloForKoan04 David!");
            new HelloForKoan04("hsqlf").say("David").Should().Be(" David!");

        }

        class HelloForKoan04
        {
            private String lang;

            public HelloForKoan04(String lang)
            {
                this.lang = lang;
            }

            public String say(String firstName)
            {
                // Select from the following line
                String hello = "";
                switch (this.lang.ToLower())
                {
                    case "fr":
                        hello = "Bonjour";
                        break;
                    case "en":
                        hello = "Hello";
                        break;
                }

                // to this line to extract method
                return hello + " " + firstName + "!";
            }
        }
    }
}
