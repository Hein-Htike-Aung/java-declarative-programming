package lambdas;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.function.*;

public class _Lambdas {

    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isBlank()) {
                throw new IllegalArgumentException("name is blank");
            }
            return name.toUpperCase() + " is " + age;
        };

        System.out.println(upperCaseName.apply("Xiaoting", 20));
    }
}
