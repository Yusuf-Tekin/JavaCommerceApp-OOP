/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.business;

import app.core.Result;
import app.entities.User;

/**
 *
 * @author Administrator
 */
public class UserAccountConfirm {
    
    
    static public Result AccountConfirm(User user) {
        user.setIsConfirm(true);
        return new Result("hesap Onaylandı.",true);
    }
}
