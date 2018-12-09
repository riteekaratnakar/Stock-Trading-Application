/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import javax.swing.JTextField;

/**
 *
 * @author Waqar
 */
public class Organization {

    OrganizationDirectory organizationDirectory;
   
    String compnayType;
    String companyName;
    int totalNoOfshares;
    int faceValue;
    int shareVale;

    public Organization() {
        //organizationDirectory = new OrganizationDirectory();
    }
   

    public String getCompnayType() {
        return compnayType;
    }

    public void setCompnayType(String compnayType) {
        this.compnayType = compnayType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTotalNoOfshares() {
        return totalNoOfshares;
    }

    public void setTotalNoOfshares(int totalNoOfshares) {
        this.totalNoOfshares = totalNoOfshares;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getShareVale() {
        return shareVale;
    }

    public void setShareVale(int shareVale) {
        this.shareVale = shareVale;
    }

    @Override
    public String toString() {
        return this.companyName; //To change body of generated methods, choose Tools | Templates.
    }
    


}
