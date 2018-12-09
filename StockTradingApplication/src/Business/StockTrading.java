/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author Waqar
 */
public class StockTrading {

    private static StockTrading instance;
    private ArrayList<Network> networkList;
    

    private StockTrading() {
        networkList = new ArrayList<Network>();
    }

    public static StockTrading getInstance() {
        if (instance == null) {
            instance = new StockTrading();
        }
        return instance;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList = new ArrayList<Role>();
//        roleList.add(new SystemAdminRole());
//        return roleList;
//    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

//    public boolean checkIfUserIsUnique(String userName) {
//        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
//            return false;
//        }
//        for (Network network : networkList) {
//
//        }
//        return true;
//    }
}
