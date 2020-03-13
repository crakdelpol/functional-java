package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerValidation.*;
import static combinatorpattern.CustomerValidation.ValidationResponse.SUCCESS;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Matteo",
                "matteo.pipitone93@gmail.com",
                "340736526",
                LocalDate.of(1990, 1, 1)
        );

//        System.out.println(new ValidatorService().isValid(customer));

//        combinator pattern
        ValidationResponse result = isAnAdult
                .and(isMailValid)
                .and(isPhoneNumberValid)
                .apply(customer);

        System.out.println(result);
        if(SUCCESS != result){
            throw new IllegalStateException(result.toString());
        }
    }
}
