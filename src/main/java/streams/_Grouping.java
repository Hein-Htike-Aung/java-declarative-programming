package streams;

import beans.Car;
import beans.Person;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _Grouping {

    @SneakyThrows
    public static void main(String[] args) {
//        groupingBy(MockData.getCars());

        groupingAndCounting(MockData.getCars());
    }

    public static void groupingBy(List<Car> cars) {
        Map<String, List<Car>> carMakeBy = cars.stream()
                .collect(Collectors.groupingBy(Car::getMake));

        carMakeBy.forEach((makeBy, carList) -> {
            System.out.println("====" + makeBy);
            carList.stream()
                    .map(Car::getModel)
                    .forEach(model -> System.out.println("\t\t" + model));
        });
    }

    private static void groupingAndCounting(List<Car> cars) {

        Map<String, Long> carsMakeByList = cars.stream()
                .map(Car::getMake)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(carsMakeByList);
    }
}
