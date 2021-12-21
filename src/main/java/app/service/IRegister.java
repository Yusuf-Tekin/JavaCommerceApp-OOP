/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.service;

import app.core.Result;
import app.entities.User;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface IRegister {
    
    public Result RegisterService(User user);
    public ArrayList<User> getAllUsers();
    
    
}
