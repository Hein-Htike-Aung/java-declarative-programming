package streams;

import beans.Person;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.Comparator;
import java.util.List;

public class _MinMax {

    @SneakyThrows
    public static void main(String[] args) {

//        min();

//        max();

//        youngestPerson(MockData.getPeople());
//
//        oldestPerson(MockData.getPeople());
    }

    private static void min() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);

        Integer min = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(min);
    }

    private static void max() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);

        Integer max = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(max);
    }


    private static void youngestPerson(List<Person> people) {
        Person person = people.stream()
                .min(Comparator.comparing(Person::getAge))
                .get();
        System.out.println(person);
    }

    private static void oldestPerson(List<Person> people) {
        Person person = people.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();
        System.out.println(person);
    }
}
