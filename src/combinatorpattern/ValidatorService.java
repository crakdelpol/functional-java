package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class ValidatorService {

    private boolean isValidMail(String mail){
        return mail.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.length() == 8;
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer){
        return isValidMail(customer.mail)
                && isValidPhoneNumber(customer.phoneNumber)
                && isAdult(customer.dateOfBirth);
    }
}
