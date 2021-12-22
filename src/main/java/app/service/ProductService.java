/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.service;

import app.core.Result;
import app.entities.Product;
import app.entities.User;
import app.fakeApi.FakeApi;

/**
 *
 * @author Administrator
 */
public class ProductService implements IProductService{

    
    FakeApi api;
    public ProductService(FakeApi api){
        this.api = api;
    }
    
    
    @Override
    public Result addProduct(Product product) {
        return api.SaveProduct(product);
    }

    @Override
    public Result updateProduct(Product product, int productId) {
        return api.UpdateProduct(product, productId);
    }

    @Override
    public Result deleteProduct(int productId) {
        return deleteProduct(productId);
    }

    @Override
    public Result buyProduct(Product product, User user) {
        if(product.getPrice() > user.getMoney()){
            return new Result("Bakiye Yeteriz", false);
        }
        else{
            user.setMoney((int) (user.getMoney() - product.getPrice()));
            System.out.println("Kalan Bakiye: " + user.getMoney());
            return new Result(product.getProductName() + " ürünü satın alındı.",true);
        }
    }
    
}
