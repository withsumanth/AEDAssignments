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
public class Supplier {
    private String suppName;
    private String suppUserName;
    private String suppPassword;
    private String suppAccStatus;
    private ProductCatalog productCatalag;
    private String suppRole;

    public Supplier() {
        productCatalag = new ProductCatalog();
    }

    public ProductCatalog getProductCatalag() {
        return productCatalag;
    }

    public void setProductCatalag(ProductCatalog productCatalag) {
        this.productCatalag = productCatalag;
    }
    
    public String getSuppRole() {
        return suppRole;
    }

    public void setSuppRole(String suppRole) {
        this.suppRole = suppRole;
    }
    
    public String getSuppAccStatus() {
        return suppAccStatus;
    }

    public void setSuppAccStatus(String suppAccStatus) {
        this.suppAccStatus = suppAccStatus;
    }

    public String getSuppUserName() {
        return suppUserName;
    }

    public void setSuppUserName(String suppUserName) {
        this.suppUserName = suppUserName;
    }

    public String getSuppPassword() {
        return suppPassword;
    }

    public void setSuppPassword(String suppPassword) {
        this.suppPassword = suppPassword;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    @Override
    public String toString() {
        return suppName; //To change body of generated methods, choose Tools | Templates.
    }
}
