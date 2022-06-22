package streams;

import beans.Person;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _Sorting {

    @SneakyThrows
    public static void main(String[] args) {

//        sortedByName(MockData.getPeople());

//        sortedByNameReversed(MockData.getPeople());


    }

    private static void sortedByName(List<Person> people) {

        List<Person> personList = people.stream()
                .sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getGender))
                .collect(Collectors.toList());

        personList.forEach(System.out::println);
    }

    private static void sortedByNameReversed(List<Person> people) {

        List<Person> personList = people.stream()
                .sorted(Comparator.comparing(Person::getFirstName).reversed())
                .collect(Collectors.toList());

        personList.forEach(System.out::println);
    }
}
