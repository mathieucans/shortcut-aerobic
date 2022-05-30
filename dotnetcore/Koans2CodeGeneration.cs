using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Koans2CodeGeneration
    {
        [Fact]
        void Koan01_uncomment_and_generate_class_and_method() {
            var buildResult = "code";
            // Uncomment following line
            // buildResult = new RobotCode().repeat(buildResult);

            // Generate class and method by unsing Alt+Enter
            // TIPS : you can navigate through error code by using Shift+Alt+PgDown

            buildResult.Should().Be("codecode");
        }

        [Fact]
        public void Koan02_extract_interface_by_using_refactoring_short_cut()
        {
            // Extract interface Language of French by using Ctrl+Shift+R
            // Uncomment this line
            // var language = new English();
            // Comment this line
            var language  = new French();
            var sayHello = new SayHello(language);

            var response = sayHello.Hello();
            
            (response).Should().Be("Hello David!");
        }

        [Fact]
        public void Koan03_generate_equality_comparer()
        {
            // Place cursor on class name and use Alt+Insert to generate equality members
            new Person("Pierre", "Dupont").Should().Be(new Person("Pierre", "Dupont"));
        }

        public class Person
        {
            private readonly string _firstName;
            private readonly string _lastName;

            public Person(string firstName, string lastName)
            {
                _firstName = firstName;
                _lastName = lastName;
            }

            public override string ToString()
            {
                return $"{nameof(_firstName)}: {_firstName}, {nameof(_lastName)}: {_lastName}";
            }
        }

       
    }

    public class SayHello
    {
        private readonly French _language;

        public SayHello(French language)
        {
            _language = language;
        }

        public string Hello()
        {
            return _language.GetHello() + " David!";
        }
    }

    public class French
    {
        public string GetHello()
        {
            return "Bonjour";
        }
    }
}