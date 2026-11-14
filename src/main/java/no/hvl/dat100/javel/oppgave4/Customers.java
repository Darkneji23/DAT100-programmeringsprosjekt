package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        this.customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;
        for(Customer customer : customers){
            if(customer != null)
                count++;
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                return customers[i]; // Сразу возвращаем найденного клиента
            }
        }
        return null;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                return true;
            }
        }
        return false;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                Customer c = customers[i]; 
                customers[i] = null;       
                return c;                  
            }
        }
        return null; // Если не нашли
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {
        int count = countNonNull();
        Customer[] activeCustomers = new Customer[count];
    
        int index = 0;
        for (Customer customer : this.customers) {
            if (customer != null) {
                activeCustomers[index] = customer;
                index++;
            }
        }
        return activeCustomers;
    }
}