package combinatorpattern;

import java.time.LocalDate;

public class Customer {

    public final String name;
    public final String mail;
    public final String phoneNumber;
    public final LocalDate dateOfBirth;

    public Customer(String name, String mail, String phoneNumber, LocalDate dateOfBirth) {
        this.name = name;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
}
