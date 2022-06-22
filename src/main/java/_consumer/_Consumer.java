package _consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "09343434");

        /*=============*/
        greetCustomer(maria);

        /*=============*/
        greetCustomerFunction.accept(maria);

        /*=============*/
        greetCustomerFunctionV2.accept(maria, false);
    }

    // Consumer take 1 arg and return void
    static Consumer<Customer> greetCustomerFunction =
            customer -> System.out.println("Hello " + customer.customerName
                    + " thanks for registering phone Number " + customer.customerPhoneNumber);

    // BiConsumer
    static BiConsumer<Customer, Boolean> greetCustomerFunctionV2 =
            (customer, showPhoneNumber)  -> System.out.println("Hello " + customer.customerName
                    + " thanks for registering phone Number " + (showPhoneNumber ? customer.customerPhoneNumber : "****"));


    // Imperative
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + " thanks for registering phone Number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
