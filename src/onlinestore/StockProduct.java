/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

/**
 *
 * @author Simanta
 */
public class StockProduct {
    private String ProductName;
    private int Stock;
    
    public StockProduct(String a,int b){
        ProductName = a;
        Stock = b;
    }
    
    public int getStock(){
        return Stock;
    }
    public String getProductName(){
        return ProductName;
    }
}
