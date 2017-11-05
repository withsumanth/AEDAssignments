/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Sumanth
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        Employee employee = new Employee();
        UserAccount acc = new UserAccount();
        employee.setName("aa");
        acc.setUsername("1");
        acc.setPassword("1");
        acc.setRole(new AdminRole());
        acc.setEmployee(employee);
        adminOrganization.getEmployeeDirectory().getEmployeeDirectory().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(acc);
        return business;
    }
}
