using System;
using System.Collections.Generic;
using System.Text;
using FluentAssertions;
using Xunit;

namespace dotnetcore
{
    public class Koan02_code_generation
    {
        [Fact]
        public void Koan01_generate_equality_comparer()
        {
            // Use Alt+Insrert to generate equality members
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

}
