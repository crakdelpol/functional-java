package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerValidation.*;
import static combinatorpattern.CustomerValidation.ValidationResponse.*;

public interface CustomerValidation extends Function <Customer, ValidationResponse> {

    static CustomerValidation isMailValid = customer -> customer.mail.contains("@") ? SUCCESS : MAIL_NOT_VALID;

    static CustomerValidation isPhoneNumberValid = customer -> customer.phoneNumber.length() == 9 ? SUCCESS : PHONE_NOT_VALID;

    static CustomerValidation isAnAdult = customer -> Period.between(customer.dateOfBirth, LocalDate.now()).getYears() > 18 ? SUCCESS: IS_NOT_AN_ADULT;

    default CustomerValidation and(CustomerValidation other) {
        return customer -> {
            ValidationResponse validation = this.apply(customer);
            return SUCCESS.equals(validation) ? other.apply(customer) : validation;
        };
    }
    enum ValidationResponse {
        SUCCESS,
        MAIL_NOT_VALID,
        PHONE_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
