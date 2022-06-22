package imperative;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

/*
* Functional interface has many default methods and
* only one abstract method
* */
public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // Imperative approach
       /* List<Person> females = new ArrayList<>();

        for(Person person : people) {
            if(FEMALE.equals(person.gender)){
               females.add(person);
            }
        }

        for(Person female : females) {
            System.out.println(female);
        }*/

        // Declarative Approach
        people.stream()
                // predicate takes one arg and product boolean
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    @ToString
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
