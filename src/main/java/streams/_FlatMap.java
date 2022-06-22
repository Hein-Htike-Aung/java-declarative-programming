package streams;

import beans.Person;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _FlatMap {

    @SneakyThrows
    public static void main(String[] args) {

//        flatMapWithList(arrayListOfNames);

//        flatMapWithNumberList(arrayListOfNumbers);

//        flatMapWithOptional();

//        flatMapLikeMap(MockData.getPeople());

//        flatMapWithGrouping(MockData.getPeople());

    }

    private static void flatMapWithList(List<List<String>> arrayListOfNames) {

        List<String> names = arrayListOfNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        names.forEach(System.out::println);
    }

    private static void flatMapWithNumberList(List<List<Integer>> arrayListOfNumbers) {
        List<Integer> sortedNumber = arrayListOfNumbers.stream()
                .flatMap(List::stream)
                .filter(num -> num <= 5)
                .sorted()
                .collect(Collectors.toList());

        sortedNumber.forEach(System.out::println);
    }


    private static void flatMapWithOptional() {
        List<Optional<String>> optionals = List.of(
                Optional.of("Amigos"),
                Optional.of("Code")
        );

        List<String> names = optionals.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        names.forEach(System.out::println);
    }

    private static void flatMapLikeMap(List<Person> people) {

        Stream<String> names = people.stream()
                .flatMap(person -> Stream.of(person.getFirstName() + person.getLastName()));

        names.forEach(System.out::println);
    }


    private static void flatMapWithGrouping(List<Person> people) {
        Map<String, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        List<Person> youngPeople = groupByGender.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .filter(person -> person.getAge() < 18)
                )
                .collect(Collectors.toList());

        youngPeople.forEach(System.out::println);
    }

    private static final List<List<String>> arrayListOfNames = List.of(
            List.of("Mariam", "Alex", "Ismail"),
            List.of("John", "Alesha", "Andre"),
            List.of("Susy", "Ali")
    );

    private static final List<List<Integer>> arrayListOfNumbers = List.of(
            List.of(2, 4, 6, 8, 10),
            List.of(1, 3, 5, 7, 9)
    );
}
