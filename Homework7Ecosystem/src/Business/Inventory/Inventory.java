/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;
import Business.Disease.Disease;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Vaccine.Vaccine;

/**
 *
 * @author Sumanth
 */
public class Inventory {
    private Employee employee;
    private int quantity;
    private Vaccine vaccine;
    private Disease disease;
    private Enterprise.EnterPriseType type;

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

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
