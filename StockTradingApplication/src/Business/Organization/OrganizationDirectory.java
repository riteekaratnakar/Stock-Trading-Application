/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Waqar
 */
public class OrganizationDirectory {

  

    private ArrayList<Organization> OrganizationList;

    public OrganizationDirectory() {
        this.OrganizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return OrganizationList;
    }

    public void setOrganizationList(ArrayList<Organization> OrganizationList) {
        this.OrganizationList = OrganizationList;
    }

    //Create Organization
    public Organization createAndAddOrganization() {
        Organization organization = new Organization();
        OrganizationList.add(organization);
        return organization;
    }
    
     public void addOrganization( Organization organization) {
        this.OrganizationList.add(organization);
    }

  
}
