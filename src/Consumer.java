public class Consumer {

    public static void main(String[] args) {

        Customer customer = new Customer("Pippi", "3406178713");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);
        greetCustomerBiConsumer.accept(customer, true);
        greetCustomerBiConsumer.accept(customer, false);
    }

    static java.util.function.Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.name+ ", thanks for registering phone number "+ customer.customerNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.name+ ", thanks for registering phone number "+ customer.customerNumber);
    }

    static java.util.function.BiConsumer<Customer, Boolean> greetCustomerBiConsumer = ((customer, showNumber) -> {
        System.out.println("Hello " + customer.name+ ", thanks for registering phone number "+ (showNumber ? customer.customerNumber : "********"));
    });
    static class Customer{
        private final String name;
        private final String customerNumber;

        Customer(String name, String customerNumber) {
            this.name = name;
            this.customerNumber = customerNumber;
        }
    }
}
