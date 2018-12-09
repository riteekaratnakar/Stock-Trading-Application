/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;
import Utility.Constant.UserType;

/**
 *
 * @author Waqar
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userList;

    public UserAccountDirectory() {
        this.userList = new ArrayList<UserAccount>();

    }

    public ArrayList<UserAccount> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<UserAccount> userList) {
        this.userList = userList;
    }

    public void createUserAccount(String userName, String password, String name, UserType type) {

        UserAccount user = new UserAccount();
        user.userName = userName;
        user.password = password;
        user.name = name;
        user.Type = type;
        
        this.userList.add(user);
    }

}
