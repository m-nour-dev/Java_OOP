/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructors;

import java.util.Scanner;

/**
 *
 * @author muhammed nur
 */
public class Main {
    public static void main(String args[])
    {
        //Product p1 = new Product("phone","5G",5000,39,10);
        //Product p2 = new Product(p1);
        //p1.display();
        //System.out.println("\n");
        //p2.display();
        
        //Create a scanner object to read input
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the name of product");
        String name = in.nextLine();
      
        System.out.println("Please enter the description of product");
        String des = in.nextLine();
        
        System.out.println("Please enter the price of product");
        float pri = in.nextFloat();
        
        System.out.println("Please enter the quntity of product");
        int quan = in.nextInt();
        
        System.out.println("Please enter the discount of product");
        float dis = in.nextFloat();
        
        //System.out.println("Please enter the color of product");
        //String col = in.nextLine();
        
        Product p3 = new Product(name,des,pri,quan,dis);
        p3.display();
        
                
    }
}









