/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.fakeApi;

import app.core.Result;
import app.entities.Product;
import app.entities.User;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface IFakeApi {
    
    public Result SaveUser(User user);
    public Result UpdateUser(User user,int id);
    public Result DeleteUser(int id);
    
    
    public Result LoginRequest(String username,String password);
    public Result UserLoggedInControl(String username);
    public ArrayList<User> allUsers();
    
    
    public Result SaveProduct(Product product);
    public Result UpdateProduct(Product product,int productId);
    public Result DeleteProduct(int productId);
    
    public ArrayList<Product> allProducts();
    
    
}
