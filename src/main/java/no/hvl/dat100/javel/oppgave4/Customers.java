package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    public Customers(int size) {

        customers = new Customer[size];

    }
    public int countNonNull() {
        int count = 0;
        for (Customer i : customers) {
            if (i != null) {
                count++;
            }
        }
        return count;
    }
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;
        for (Customer i : customers) {
            if (i != null && i.getCustomerId() == customer_id) {
                funnet = true;
                c = i;
                break;
            }
        }
        return c;
    }
    public boolean addCustomer(Customer c) {

        boolean inserted = false;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
                break;
            }
        }
        return inserted;
    }
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                c = customers[i];
                customers[i] = null;
                deleted = true;
                break;
            }
        }
        return c;
    }
    public Customer[] getCustomers() {

        Customer[] customers = null;
        customers = new Customer[countNonNull()];
        int j = 0;
        for (Customer i : this.customers) {
            if (i != null) {
                customers[j] = i;
                j++;
            }
        }
        return customers;
    }
}