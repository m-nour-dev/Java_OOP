/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author muhammed nur
 */
public class Developer extends Employee {
    
    String projectName ;
    
    public Developer()
    {
        System.out.println("hey there! this is the no par. con. of developer class");
    }
    
    public Developer(String name, String emailAddress, String phone, int yearOfBirth,String projectName)
    {
        super(name,emailAddress ,phone ,yearOfBirth);
        this.projectName = projectName;
    }
    
}