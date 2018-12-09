/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Waqar
 */
public class CustomerDirectory {

    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    //Create enterprise
    public Customer createAndAddCustomer() {

        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }

}
