/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.service;

import app.core.Result;

/**
 *
 * @author Administrator
 */
public interface ILogin {
    
    public Result LoginService(String username,String password);
    public Result isLoggedInAUser(String username);
    
}
