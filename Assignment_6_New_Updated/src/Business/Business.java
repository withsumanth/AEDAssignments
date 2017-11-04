/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sumanth
 */
public class Business {
    private SalesPersonDirectory salespersonDir;
    private SupplierDirectory supplierDir;
    private PasswordEncryption passEncryption;
    private AdminLoginDirectory adminLoginDirectory;
    private MarketDirectory marketDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private MarketOfferCatalogue marketOfferCatalogue;
    
    public Business(){
        salespersonDir = new SalesPersonDirectory();
        supplierDir = new SupplierDirectory();
        passEncryption = new  PasswordEncryption();
        adminLoginDirectory = new AdminLoginDirectory();
        marketDirectory  = new MarketDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        marketOfferCatalogue = new MarketOfferCatalogue();
    }

    public MarketOfferCatalogue getMarketOfferCatalogue() {
        return marketOfferCatalogue;
    }

    public void setMarketOfferCatalogue(MarketOfferCatalogue marketOfferCatalogue) {
        this.marketOfferCatalogue = marketOfferCatalogue;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public MarketDirectory getMarketDirectory() {
        return marketDirectory;
    }

    public void setMarketDirectory(MarketDirectory marketDirectory) {
        this.marketDirectory = marketDirectory;
    }

    public AdminLoginDirectory getAdminLoginDirectory() {
        return adminLoginDirectory;
    }

    public void setAdminLoginDirectory(AdminLoginDirectory adminLoginDirectory) {
        this.adminLoginDirectory = adminLoginDirectory;
    }

    public SalesPersonDirectory getSalespersonDir() {
        return salespersonDir;
    }

    public void setSalespersonDir(SalesPersonDirectory salespersonDir) {
        this.salespersonDir = salespersonDir;
    }

    public SupplierDirectory getSupplierDir() {
        return supplierDir;
    }

    public void setSupplierDir(SupplierDirectory supplierDir) {
        this.supplierDir = supplierDir;
    }

    public PasswordEncryption getPassEncryption() {
        return passEncryption;
    }

    public void setPassEncryption(PasswordEncryption passEncryption) {
        this.passEncryption = passEncryption;
    }
    
}
