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
public class AddMoney {
    
    static public Result AddMoney(User user,int money){
        if(money < 10){
            return new Result("Minimum 10 birim para yüklenebilir.", false);
        }
        else{
            if(user.isIsConfirm()){
                user.setMoney(user.getMoney() + money);
                return new Result(String.format("Hesabınıza %d birim para yüklenmiştir.",money),true);
            }
            else{
                return new Result("Para yükleyebilmek için hesabınızın onaylanması gerekmektedir.",false);
            }
        }
    }
    
}
