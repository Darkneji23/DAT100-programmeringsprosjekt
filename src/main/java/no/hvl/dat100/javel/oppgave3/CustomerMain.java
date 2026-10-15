package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();
        Customer firstCustomer = new Customer("Dmytro Homon", "dmytro@example.com", 1001, PowerAgreementType.SPOTPRICE);
        System.out.println(firstCustomer.toString());
        System.out.println();
        System.out.println(firstCustomer.getName() + " has agreement type: " + firstCustomer.getAgreement());
        System.out.println();
        firstCustomer.setAgreement(PowerAgreementType.NORGESPRICE);
        System.out.println(firstCustomer.getName() + " has agreement type: " + firstCustomer.getAgreement());
    }
}