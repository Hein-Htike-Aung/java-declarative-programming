package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _JoiningString {

    public static void main(String[] args) {

        joiningStringWithStream();
    }

    private static void joiningStringWithStream() {
        List<String> people = List.of("anna", "john", "marcos", "helena", "yasmin");

        String namesString = people.stream()
                .map(names -> names.substring(0, 1).toUpperCase() + names.substring(1))
                .collect(Collectors.joining(", "));

        System.out.println(namesString);

    }
}
