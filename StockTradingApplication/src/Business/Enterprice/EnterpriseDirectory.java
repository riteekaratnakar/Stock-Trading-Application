/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprice;

import java.util.ArrayList;
import Utility.Constant.EnterpriseType;

/**
 *
 * @author Waqar
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    //Create enterprise
    public void createAndAddEnterprise(String name, EnterpriseType type, String country) {
        
        Enterprise enterprise = new Enterprise(name, type, country);
        enterpriseList.add(enterprise);
    }


}
