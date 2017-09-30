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
public class CustomerDet extends Airlines{
    private ArrayList<Customer> Customer;

    public ArrayList<Customer> getCustomer() {
        return Customer;
    }

    public void setCustomer(ArrayList<Customer> Customer) {
        this.Customer = Customer;
    }
    
}
