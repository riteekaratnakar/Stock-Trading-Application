/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Waqar
 */
public class PurchasedSharesDirectory {

    private ArrayList<PurchasedShares> purchasedSharesList;

    public PurchasedSharesDirectory() {
        purchasedSharesList = new ArrayList<PurchasedShares>();
    }

    public ArrayList<PurchasedShares> getPurchasedSharesList() {
        return purchasedSharesList;
    }

    public void setPurchasedSharesList(ArrayList<PurchasedShares> purchasedSharesList) {
        this.purchasedSharesList = purchasedSharesList;
    }
    //Create enterprise

    public PurchasedShares createAndAddPurchasedShares() {
        PurchasedShares purchasedShares = new PurchasedShares();
        purchasedSharesList.add(purchasedShares);
        return purchasedShares;
    }
    
   public PurchasedShares sellPurchasedShares(){
       PurchasedShares purchasedShares = new PurchasedShares();
       purchasedSharesList.remove(purchasedShares);
       return purchasedShares;
    }
}
