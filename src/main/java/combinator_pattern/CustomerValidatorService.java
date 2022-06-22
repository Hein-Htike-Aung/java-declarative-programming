package combinator_pattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValue(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValue(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValue(customer.getEmail()) &&
                isPhoneNumberValue(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }
}
