/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.business;

import app.entities.User;

/**
 *
 * @author Administrator
 */
public class UserAccountIsConfirmed {
    
    static public boolean isConfirmedControl(User user){
        return user.isIsConfirm();
    }
    
}
