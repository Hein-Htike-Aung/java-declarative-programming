package streams;

import java.util.Arrays;

public class _Reduce {
    public static void main(String[] args) {

        reduceArray();
    }

    private static void reduceArray() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};

//        int sum = Arrays.stream(integers)
//                .reduce(0, (a, b) -> a + b);
        int sum = Arrays.stream(integers)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }


}
