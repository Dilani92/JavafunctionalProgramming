package org.example;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria" , "12345"));

        greetCustomerConsumer.accept(new Customer("Amali" , "097667"));

        greetCustomerBiConsumer.accept(new Customer("Jho" , "097667") , false);
    }

    //BiConsumer
    static BiConsumer<Customer , Boolean> greetCustomerBiConsumer = (customer , showPhoneNumber) ->
            System.out.println("Consumer Hello " + customer.customerName +
                    " thanks for registering phone number "
                    + (showPhoneNumber ? (customer.customerPhoneNumber) : "*******"));

    //Consumer Function
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Consumer Hello " + customer.customerName +
            " thanks for registering phone number " +
            customer.customerPhoneNumber);


    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                " thanks for registering phone number " +
                customer.customerPhoneNumber);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
