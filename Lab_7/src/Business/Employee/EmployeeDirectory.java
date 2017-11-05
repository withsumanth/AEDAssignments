/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeDirectory;
    
    public EmployeeDirectory(){
        employeeDirectory = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(ArrayList<Employee> employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public Employee createEmployee(String name){
        Employee emp = new Employee();
        emp.setName(name);
        employeeDirectory.add(emp);
        return emp;
    }
}
