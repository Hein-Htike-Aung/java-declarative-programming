package streams;

import beans.Car;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Filtering {

    @SneakyThrows
    public static void main(String[] args) {

        carsLessThen20k(MockData.getCars());

//        dropWhile();

//        takeWhile();

//        findFirst ();

//        findAny();

//        allMatch();

//        anyMatch();

//        noneMatch();

    }

    public static void carsLessThen20k(List<Car> cars) {

        cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .filter(car -> car.getPrice() < 20_000)
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void dropWhile() {
        Stream.of(2, 4, 6, 7, 8, 9, 10)
                // as long as conditions are satisfied, it won't take action
                .dropWhile(num -> num % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }

    public static void takeWhile() {
        Stream.of(2, 4, 6, 7, 8, 9, 10)
                // if condition is not satisfied, it won't take action
                .takeWhile(num -> num % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }

    public static void findFirst() {
        int[] numbers = {1, 2, 3, 4, 5, 5, 8};
        int number = Arrays.stream(numbers)
                .filter(n -> n == 10)
                .findFirst()
                .orElse(-1);
        System.out.println(number);
    }

    public static void findAny() {
        int[] numbers = {1, 2, 3, 4, 5, 5, 8};
        int number = Arrays.stream(numbers)
                .filter(n -> n == 5)
                .findAny()
                .orElse(-1);
        System.out.println(number);
    }

    public static void allMatch() {
        int[] even = {2, 4, 6, 8};
        boolean isAllEven = Arrays.stream(even)
                .allMatch(n -> n % 2 == 0);
        System.out.println(isAllEven);
    }

    public static void anyMatch() {
        int[] even = {1, 5, 8, 3, 7};
        boolean evenContains = Arrays.stream(even)
                .anyMatch(n -> n % 2 == 0);
        System.out.println(evenContains);
    }

    public static void noneMatch() {
        int[] numbers = {1, 5, 3, 7};
        boolean notContainsEven = Arrays.stream(numbers)
                .noneMatch(n -> n % 2 == 0);
        System.out.println(notContainsEven);
    }
}
