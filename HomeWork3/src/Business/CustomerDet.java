/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class CustomerDet {
    private ArrayList<Customer> customerDet;

    public CustomerDet() {
        customerDet = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDet() {
        return customerDet;
    }

    public void setCustomerDet(ArrayList<Customer> customerDet) {
        this.customerDet = customerDet;
    }

    public Customer addDetails(){
        Customer details = new Customer();
        customerDet.add(details);
        return details;
    }
}
