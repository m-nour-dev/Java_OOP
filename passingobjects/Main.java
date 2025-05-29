/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passingobjects;

/**
 *
 * @author muhammed nur
 */
public class Main {
    
    public static void main(String []args)
    {
        
        Math n1 = new Math(2,2);
        Math n2 = new Math(7,3);
        
        //Math n3 = new Math();type1
        //Math n4= new Math();type1
        
        Math n3 = Math.add(n1, n2);//type2
        System.out.println("n1.val1 + n2.val1= " + n3.val1);
        System.out.println("n1.val2 + n2.val2= " + n3.val2);
        
        Math n4=n1.subtraction(n2);//type2
        System.out.println("n1.val1 - n2.val1= " + n4.val1);
        System.out.println("n1.val2 - n2.val2= " + n4.val2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
