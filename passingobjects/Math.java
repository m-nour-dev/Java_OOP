/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passingobjects;

/**
 *
 * @author muhammed nur
 */
public class Math {
    
    int val1;
    int val2;
    
    //no arguments constructor to prevent errors while declaring obj that will...
    //carry of the result of operation ant will return to main function
    Math(){};
    
    //parameterize constructor
    Math(int val1,int val2)
    {
        this.val1 = val1;
        this.val2 = val2;
        
    }
    
    static Math add(Math n1,Math n2)//type 1 to passing objects
    {
        Math n3  = new Math();//carry the result of operation
        n3.val1 = n1.val1 + n2.val1;
        n3.val2 = n1.val2 + n2.val2;
        return n3;
    }
    
    Math subtraction(Math n)//type 2 to passing objects
    {
        Math n3  = new Math();//carry the result of operation
        n3.val1 = this.val1 - n.val1;
        n3.val2 = this.val2 - n.val2;
        return n3;
    }
    
}