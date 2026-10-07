package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer firstcustomer = new Customer(
                "Dmytro Homon",
                "homon@gmail.com",
                1,
                PowerAgreementType.SPOTPRICE
        );
        Customer secondcustomer = new Customer(
                "Oskar Hartmann",
                "hartmann@gmail.com",
                2,
                PowerAgreementType.POWERSUPPORT
        );
        Customer thirdcustomer = new Customer(
                "Oskar Iovsa",
                "Iovsa@gmail.com",
                03,
                PowerAgreementType.NORGESPRICE
        );
        Invoice invoice1 = new Invoice(
                firstcustomer,
                "January",
                CustomerPowerUsageData.usage_month_customer1,
                MonthPowerData.powerprices_month
        );
        Invoice invoice2 = new Invoice(
                secondcustomer,
                "February",
                CustomerPowerUsageData.usage_month_customer2,
                MonthPowerData.powerprices_month
        );
        Invoice invoice3 = new Invoice(
                thirdcustomer,
                "April",
                CustomerPowerUsageData.usage_month_customer3,
                MonthPowerData.powerprices_month
        );


        invoice1.computeAmount();
        invoice2.computeAmount();
        invoice3.computeAmount();
        invoice1.printInvoice();
        invoice2.printInvoice();
        invoice3.printInvoice();
    }
}