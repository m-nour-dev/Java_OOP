/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author muhammed nur
 */
public class Main {
    
    static void interfaceMethod(SelfDrivable s)
    {
        s.drive();
    }
            
    
    public static void main(String []args)
    {        
        
        /*nonreusable shape
        CarV1 c1 = new CarV1();
        c1.drive();

        CarV2 c2 = new CaeV2();
        c2.drive();

        */

        //reusable shape ( polymorphism) 1
        /*
        SelfDrivable c1 = new CarV1();
        c1.drive();
        
        SelfDrivable c2= new CarV2();
        c2.drive();
        */
        
        
        /*
        //reusable shape ( polymorphism) 2
        interfaceMethod(new CarV1());
        interfaceMethod(new CarV2());
        */
        
        /*
        default keyword -> to be able to write methods with body
        
        @Functionalinterface -> the interface that has only one method
        
        marker interface -> the interface that has not any methods 
        
        generic interface -> <T>
        
        */
        
        
    }
    
}
