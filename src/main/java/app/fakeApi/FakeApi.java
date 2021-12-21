/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.fakeApi;

import app.core.Result;
import app.entities.User;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FakeApi implements IFakeApi{

    private ArrayList<User> users;
    
    public FakeApi(){
        users = new ArrayList();
    }
    
    
    @Override
    public Result SaveUser(User user) {
        boolean SaveUserResult = true;
        for(User u:users){
            if(u.getUsername().equals(user.getUsername() ) || u.getEmail().equals(user.getEmail())){
                SaveUserResult = false;
                break;
            }
        }
        
        if(SaveUserResult){
            users.add(user);
        }
        return new Result(SaveUserResult);
    }

    @Override
    public Result UpdateUser(User user, int id) {
        try{
            for(User u:users) {
                if(u.getId() == id) {
                    u.setEmail(user.getEmail());
                    u.setUsername(user.getUsername());
                    break;
                }
            }
            
            return new Result("Bilgileriniz başarıyla güncellendi.", true);
        }
        catch(Exception ex){
            return new Result("Güncelleme sırasında bir hata oluştu.",false);
        }
    }

    @Override
    public Result DeleteUser(int id) {
        try{
            for(User u:users) {
                if(u.getId() == id){
                    users.remove(users.indexOf(u));
                }
            }
            return new Result("Hesabınız kalıcı olarak silindi.",true);
        }catch(Exception ex) {
            return new Result("Bir hata oluştu.Hesap silinemedi.",false);
        }
    }

    @Override
    public Result LoginRequest(String username, String password) {
        
        boolean LoginRequestResult = false;
        for(User user:this.users){
            if(user.getUsername().equals(username)){
                LoginRequestResult = password.equals(user.getPassword());
                user.setIsLoggedIn(true);
                break;
            }
        }
        
        return new Result(LoginRequestResult);
    }

    @Override
    public Result UserLoggedInControl(String username) {
        
        boolean UserLoggedIn = false;
        
        for(User user:users){
            if(user.getUsername().equals(username)){
                UserLoggedIn = user.isIsLoggedIn();
                break;
            }
        }
        return new Result(UserLoggedIn);
    }

    @Override
    public ArrayList<User> allUsers() {
        return users;
    }
    
    
    
    
}
