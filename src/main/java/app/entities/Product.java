/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.entities;

/**
 *
 * @author Administrator
 */
public class Product {
    private int id;
    private String productName;
    private int productCategoryId;
    private float price;
    private String productImage;

    public Product(String productName, int productCategoryId, float price, String productImage) {
        this.id = (int) Math.random()*7483;
        this.productName = productName;
        this.productCategoryId = productCategoryId;
        this.price = price;
        this.productImage = productImage;
    }
   
    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    


}
