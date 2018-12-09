/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;
import Business.Enterprice.Enterprise;
import Business.Network.Network;
import Interface.SystemAdminWorkArea.EnterpriceCredentials;
import Utility.Constant;
import Utility.Constant.UserType;
import sun.security.krb5.internal.EncAPRepPart;
/**
 *
 * @author Waqar
 */
public class UserAccount {

    String userName;
    String password;
    String name;
    UserType Type;
    
    public UserAccount()
    {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getType() {
        return Type;
    }

    public void setType(UserType Type) {
        this.Type = Type;
    }
    
}
