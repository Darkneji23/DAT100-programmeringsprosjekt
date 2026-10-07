package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();
        Customers customers = new Customers(10);
        Customer alice = new Customer(
                "Dmytro Homon",
                "Homon@gmail.com",
                01,
                PowerAgreementType.SPOTPRICE
        );
        Customer oskarH = new Customer(
                "Oskar Hartmann",
                "Hartmann@gmail.com",
                02,
                PowerAgreementType.NORGESPRICE
        );
        Customer oskarI = new Customer(
                "Oskar Iovsa",
                "Iovsa@gmail.com",
                03,
                PowerAgreementType.POWERSUPPORT
        );
        Customer ella = new Customer(
                "Ella Anderson",
                "Anderson@gmail.com",
                05,
                PowerAgreementType.POWERSUPPORT
        );
        System.out.println(customers.addCustomer(alice));
        System.out.println(customers.addCustomer(oskarH));
        System.out.println(customers.addCustomer(oskarI));
        System.out.println(customers.addCustomer(ella));
        System.out.println("Number of customers: " + customers.countNonNull());
        System.out.println();
        Customer customer = customers.getCustomer(02);
        System.out.println(customer);
        System.out.println();
        Customer[] allCustomers = customers.getCustomers();
        for (Customer c : allCustomers) {
            System.out.println(c);
        }
        System.out.println();
        Customer removed = customers.removeCustomer(05);
        System.out.println("Removed:");
        System.out.println(removed);
        System.out.println();
        System.out.println("Number of customers: " + customers.countNonNull());
        System.out.println();
        Customer[] remainingCustomers = customers.getCustomers();
        for (Customer c : remainingCustomers) {
            System.out.println(c);
        }
    }
}
