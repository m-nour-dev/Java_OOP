/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructors;

/**
 *
 * @author muhammed nur
 */
public class Product {
    
    //private class members.
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;
    
    
    //public class members :)
    
    //No Arguments Constructor
    public Product()
    {
        this.name = " No Name ";
        this.description = " No Description ";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount =0;
    }
    
    //5 Arguments Parameterized Constructor
    public Product(String n ,String des , float pri , int quan , float dis)
    {
        this.name = n;
        this.description = des;
        this.price = pri;
        this.quantity = quan;
        this.discount =dis;
    }
    
    
    // 6  Arguments Parameterized Constructor
    public Product(String n ,String des , float pri , int quan , float dis,String c)
    {
        this(n,des,pri,quan,dis);
        this.color = c;
        
    }
    
    
    // Copy Constructor
    public Product(Product p1)
    {
        this(p1.name,p1.description,p1.price,p1.quantity,p1.discount,p1.color);
    }
    
    
    //printing objeckts attributes
    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Description :" + description);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Discount : " + discount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
