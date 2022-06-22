package streams;

import beans.Car;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class _StatisticsWithStreams {

    @SneakyThrows
    public static void main(String[] args) {

//        count(MockData.getCars());

//        min(MockData.getCars());

//        max(MockData.getCars());

//        average(MockData.getCars());

//        sum(MockData.getCars());

        statistics(MockData.getCars());
    }

    private static void count(List<Car> cars) {

        long count = cars.stream()
                .filter(car -> car.getMake().equalsIgnoreCase("Ford"))
                .count();
        System.out.println(count);

    }

    private static void min(List<Car> cars) {
        double cheapestCar = cars.stream()
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(0);
        System.out.println(cheapestCar);
    }

    private static void max(List<Car> cars) {
        double mostExpensiveCar = cars.stream()
                .mapToDouble(Car::getPrice)
                .max()
                .orElse(0);
        System.out.println(mostExpensiveCar);
    }

    private static void average(List<Car> cars) {

        double average = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);
        System.out.println(average);
    }

    private static void sum(List<Car> cars) {

        double sum = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        System.out.println(BigDecimal.valueOf(sum));
    }

    private static void statistics(List<Car> cars) {
        DoubleSummaryStatistics statistics = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();

        System.out.println("Count -> " + statistics.getCount());
        System.out.println("Max -> " + statistics.getMax());
        System.out.println("Min -> " + statistics.getMin());
        System.out.println("Sum -> " + BigDecimal.valueOf(statistics.getSum()));
        System.out.println("Average -> " + statistics.getAverage());

    }

}
