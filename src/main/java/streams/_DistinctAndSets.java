package streams;

import beans.Person;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _DistinctAndSets {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);

        List<Integer> distinct = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        Set<Integer> setDistinct = new HashSet<>(numbers);

        System.out.println(distinct);
        System.out.println(setDistinct);

    }

}
