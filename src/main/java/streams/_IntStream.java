package streams;

import beans.Person;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.List;
import java.util.stream.IntStream;

public class _IntStream {

    @SneakyThrows
    public static void main(String[] args) {

//        range();

//        loopThroughPeople(MockData.getPeople());

//        iterate();

    }

    private static void range() {
        IntStream.range(0,5)
                .forEach(value -> System.out.print(value + " "));

        System.out.println();

        IntStream.rangeClosed(0,5)
                .forEach(value -> System.out.print(value + " "));
    }

    private static void loopThroughPeople(List<Person> people) {
        IntStream.range(0, people.size())
                .forEach(index -> {
                    System.out.println(people.get(index));
                });
    }

    private static void iterate() {
        IntStream.iterate(0, value -> value + 2)
                .limit(10)
                .forEach(value -> System.out.print(value + " "));
    }

}
