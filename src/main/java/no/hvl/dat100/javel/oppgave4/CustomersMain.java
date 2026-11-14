package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        Customers registry = new Customers(5);

        // Create test customers based on the task description
        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);

        // 1. Test addCustomer (d)
        System.out.println("=== TESTING addCustomer ===");
        System.out.println("Added Alice (1001): " + registry.addCustomer(c1));
        System.out.println("Added Bob (1002): " + registry.addCustomer(c2));
        System.out.println("Added Charlie (1003): " + registry.addCustomer(c3));
        System.out.println("Added Diana (1004): " + registry.addCustomer(c4));
        System.out.println("Added Ethan (1005): " + registry.addCustomer(c5));

        // Try adding a 6th customer when capacity is 5 (should return false)
        Customer c6 = new Customer("Frank Castle", "frank@example.com", 1006, PowerAgreementType.SPOTPRICE);
        System.out.println("Added Frank (registry full): " + registry.addCustomer(c6));

        // 2. Test countNonNull (b)
        System.out.println("\n=== TESTING countNonNull ===");
        System.out.println("Total active customers in registry: " + registry.countNonNull());

        // 3. Test getCustomer (c)
        System.out.println("\n=== TESTING getCustomer ===");
        Customer found = registry.getCustomer(1003);
        if (found != null) {
            System.out.println("Found customer with ID 1003:\n" + found);
        } else {
            System.out.println("Customer not found.");
        }

        // 4. Test removeCustomer (e)
        System.out.println("\n=== TESTING removeCustomer ===");
        Customer removed = registry.removeCustomer(1002); // Removing Bob
        if (removed != null) {
            System.out.println("Successfully removed: " + removed.getName() + " (ID: " + removed.getCustomer_id() + ")");
        }
        System.out.println("Count after removal: " + registry.countNonNull());

        // 5. Test getCustomers (f)
        System.out.println("\n=== TESTING getCustomers (Active Array) ===");
        Customer[] activeCustomers = registry.getCustomers();
        System.out.println("Length of compressed active customers array: " + activeCustomers.length);
        for (Customer c : activeCustomers) {
            System.out.println("-> " + c.getName() + " | ID: " + c.getCustomer_id() + " | Agreement: " + c.getAgreement());
        }
    }
}
