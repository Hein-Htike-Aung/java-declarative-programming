package _supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        /*==============*/
        System.out.println(getDBConnectionUrl());

        /*==============*/
        System.out.println(getDBConnectionUrlFunction.get());
    }

    // Supplier take No arg and product 1 result
    static Supplier<List<String>> getDBConnectionUrlFunction =
            () -> List.of("Jdbc://localhost:5432/users");

    // Imperative
    static String getDBConnectionUrl () {
        return "Jdbc://localhost:5432/users";
    }
}
