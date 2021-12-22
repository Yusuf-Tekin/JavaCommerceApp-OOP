/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.service;

import app.core.Result;
import app.entities.Product;
import app.entities.User;

/**
 *
 * @author Administrator
 */
public interface IProductService {
    
    public Result addProduct(Product product);
    public Result updateProduct(Product product,int productId);
    public Result deleteProduct(int productId);
    
    public Result buyProduct(Product product,User user);
    
    
}
