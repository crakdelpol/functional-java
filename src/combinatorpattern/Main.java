package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Matteo",
                "matteo.pipitone93@gmail.com",
                "34073656",
                LocalDate.of(1990, 1, 1)
        );

        System.out.println(new ValidatorService().isValid(customer));
    }
}
