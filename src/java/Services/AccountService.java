/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.User;

/**
 *
 * @author heetk
 */
public class AccountService {
    
    public User login(String userName, String password) {
        if((userName.equals("abe") || userName.equals("barb")) && password.equals("password")) {
            return new User(userName, password);
        } else {
            return null;
        }
    }
}
