package combinator_pattern;

import java.time.LocalDate;

import static combinator_pattern.CustomerRegistrationValidator.*;
import static combinator_pattern.CustomerRegistrationValidator.ValidationResult.*;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0343434343434",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAnAdult())
                .and(isAnAdult())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
        if(result != SUCCESS){
            throw new IllegalStateException(result.name());
        }


    }
}
