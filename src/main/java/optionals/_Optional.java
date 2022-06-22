package optionals;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable(null);

        /*======= map, orElse ========*/
        hello
                .map(String::toUpperCase)
                .orElse("World");

        Person person = new Person("James", null);

        Optional.ofNullable(person.getEmail())
                .map(String::toUpperCase)
                .orElse("There is no email for " + person.name);

        /*======= orElseGet =======*/
        hello
                .orElseGet(() -> {
                    // Logic
                    return "default value";
                });

        /*======== orElseThrow ======*/
        hello
                .orElseThrow(() -> {
                    throw new IllegalStateException("sdf");
                });

        /*======= ifPresent =======*/
        hello
                .ifPresent(System.out::println);

        /*======= ifPresentOrElse =======*/
        hello
                .ifPresentOrElse(System.out::println, () -> {
                    System.out.println("There is no Value");
                });


    }

    @Getter
    @AllArgsConstructor
    static class Person {
        private final String name;
        private final String email;

    }
}
