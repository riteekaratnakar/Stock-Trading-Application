/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author Waqar
 */
public class PurchasedShares {

    String companyName;
    int noPurchasedShares;
    int atPrice;
    int total;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNoPurchasedShares() {
        return noPurchasedShares;
    }

    public void setNoPurchasedShares(int noPurchasedShares) {
        this.noPurchasedShares = noPurchasedShares;
    }

    public int getAtPrice() {
        return atPrice;
    }

    public void setAtPrice(int atPrice) {
        this.atPrice = atPrice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
