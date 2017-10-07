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
public class CustomerDir {
    ArrayList<Customer> customerDir = new ArrayList<Customer>();

    public ArrayList<Customer> getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(ArrayList<Customer> customerDir) {
        this.customerDir = customerDir;
    }

    
    public Customer addDetails(){
        Customer customer = new Customer();
        customerDir.add(customer);
        return customer;
    }
    
    public void deleteDetails(Customer customer){
        customerDir.remove(customer);
    }
}
