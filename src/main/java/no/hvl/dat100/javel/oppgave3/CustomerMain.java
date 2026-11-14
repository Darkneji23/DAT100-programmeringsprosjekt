package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();
        Customer dima = new Customer("Dima", "dg318842@gmail.com", 1001, PowerAgreementType.POWERSUPPORT );
        Customer ella = new Customer("Ella", "jennilarosa@gmail.com", 1002, PowerAgreementType.SPOTPRICE );
        Customer misha = new Customer("Misha", "misha@gmail.com", 1003, PowerAgreementType.NORGESPRICE );
        System.out.println(misha);
        System.out.println(ella);
        System.out.println(dima);
    }
}
