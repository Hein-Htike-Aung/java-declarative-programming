package _functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment = incrementByOne(0);
        System.out.println(increment);

        /*=======================*/
        int increment2 = incrementByOneFunction.apply(4);
        System.out.println(increment2);

        /*=======================*/
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        /*=======================*/
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        int multiply2 = addBy1AndThenMultiplyBy10.apply(7);
        System.out.println(multiply2);

        /*=======================*/
        int addBy1AndThenMultiply = incrementByOneAndMultiplyFunction.apply(7, 10);
        System.out.println(addBy1AndThenMultiply);
    }

    // Declarative
    // Takes 1 arg and produces 1 result
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    // Takes 2 arg and produces 1 result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (num, numToMultiply) ->
                    (num + 1) * numToMultiply;

    // Imperative
    static int incrementByOne(int num) {
        return num + 1;
    }

    static int incrementByOneAndMultiply(int num, int numToMultiply) {
        return (num + 1) * numToMultiply;
    }
}
