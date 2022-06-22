package _predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        /*=============*/
        System.out.println(
                "is Phone Number start with 07 and has 5 Chars -> " +
                        isPhoneNumberValid("07234")
        );

        /*=============*/
        System.out.println(
                "is Phone Number start with 07 and has 5 Chars -> " +
                        isPhoneNumberValidFunction.test("07234")
        );

        /*=============*/
        System.out.println(
                "is Phone Number start with 07 and has 5 Chars -> " +
                        isPhoneNumberValidFunction.and(containsNumber3).test("07234")
        );

        /*=============*/
        System.out.println(
                "is Phone Number start with 07 or has 5 Chars -> " +
                        isPhoneNumberValidFunction.or(containsNumber3).test("333")
        );
    }

    // Predicate takes 1 arg and product boolean
    static Predicate<String> isPhoneNumberValidFunction =
            (phoneNumber) -> phoneNumber.startsWith("07") && phoneNumber.length() == 5;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");

    // Imperative
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 5;
    }
}
