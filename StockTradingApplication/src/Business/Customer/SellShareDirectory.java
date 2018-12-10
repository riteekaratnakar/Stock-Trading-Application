/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Waqar
 */
public class SellShareDirectory {

    private ArrayList<SellShare> selledSharesList;

    public SellShareDirectory() {
        selledSharesList = new ArrayList<SellShare>();
    }

    public ArrayList<SellShare> getSelledSharesList() {
        return selledSharesList;
    }

    public void setSelledSharesList(ArrayList<SellShare> selledSharesList) {
        this.selledSharesList = selledSharesList;
    }

    public SellShare createAndAddSellShares() {
        SellShare sellShare = new SellShare();
        selledSharesList.add(sellShare);
        return sellShare;
    }
}
