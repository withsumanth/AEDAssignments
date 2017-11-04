/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author JAI JINENDRA
 */
public class SalesPerson {
    
    private String salesPersonName;
    private String salesUserName;
    private String salesPassword;
    private String salesAccountStatus;
    private String salesPersonRole;

    public String getSalesPersonRole() {
        return salesPersonRole;
    }

    public void setSalesPersonRole(String salesPersonRole) {
        this.salesPersonRole = salesPersonRole;
    }

    public String getSalesAccountStatus() {
        return salesAccountStatus;
    }

    public void setSalesAccountStatus(String salesAccountStatus) {
        this.salesAccountStatus = salesAccountStatus;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public String getSalesUserName() {
        return salesUserName;
    }

    public void setSalesUserName(String salesUserName) {
        this.salesUserName = salesUserName;
    }

    public String getSalesPassword() {
        return salesPassword;
    }

    public void setSalesPassword(String salesPassword) {
        this.salesPassword = salesPassword;
    }
    
    @Override
    public String toString(){
        return salesPersonName;
    }
}
