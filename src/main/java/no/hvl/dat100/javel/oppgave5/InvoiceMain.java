package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();
        double[][] usage1 = CustomerPowerUsageData.usage_month_customer1;
        double[][] usage2 = CustomerPowerUsageData.usage_month_customer2;
        double[][] usage3 = CustomerPowerUsageData.usage_month_customer3;
        double[][] prices = MonthPowerData.powerprices_month;
        Customers registry = new Customers(5);
        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);
        System.out.println("Added Alice (1001): " + registry.addCustomer(c1));
        System.out.println("Added Bob (1002): " + registry.addCustomer(c2));
        System.out.println("Added Charlie (1003): " + registry.addCustomer(c3));
        System.out.println("Added Diana (1004): " + registry.addCustomer(c4));
        System.out.println("Added Ethan (1005): " + registry.addCustomer(c5));
        Invoice c1Invoice = new Invoice(c1, "February", usage1, prices);
        Invoice c2Invoice = new Invoice(c2, "March", usage2, prices);
        Invoice c3Invoice = new Invoice(c3, "February", usage3, prices);
        c1Invoice.printInvoice();
        System.out.println("======================================");
        Invoice[] invoices = {c1Invoice, c2Invoice, c3Invoice};
        Invoices.processInvoices(invoices);
    }
}
