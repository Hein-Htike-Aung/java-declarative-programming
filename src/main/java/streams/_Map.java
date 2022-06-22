package streams;

import beans.Person;
import beans.PersonDTO;
import lombok.SneakyThrows;
import mockdata.MockData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Map {

    @SneakyThrows
    public static void main(String[] args) {

        transformToDTO(MockData.getPeople());

    }

    private static void transformToDTO(List<Person> people) {

        List<PersonDTO> personDTOS = people.stream()
                .map(PersonDTO::map)
                .collect(Collectors.toList());

        personDTOS.forEach(System.out::println);
    }

}
