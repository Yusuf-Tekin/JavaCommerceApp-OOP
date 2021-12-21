/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.service;

import app.core.Result;
import app.entities.User;
import app.fakeApi.FakeApi;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Register implements IRegister{

    FakeApi api;
    
    public Register(FakeApi api){
        this.api = api;
    }
    
    @Override
    public synchronized Result RegisterService(User user) {
        return api.SaveUser(user);
    }

    @Override
    public ArrayList<User> getAllUsers() {
        return api.allUsers();
    }

    
}
