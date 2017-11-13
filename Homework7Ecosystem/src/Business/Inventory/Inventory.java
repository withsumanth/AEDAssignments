/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;

/**
 *
 * @author Sumanth
 */
public class Inventory {
    Employee employee;
    private int quantity;
    Enterprise.EnterPriseType type;

    public Enterprise.EnterPriseType getType() {
        return type;
    }

    public void setType(Enterprise.EnterPriseType type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
