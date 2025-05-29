/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author muhammed nur
 */
public class Employee {
    
    // protected class members to be able to access to super class members from subclass ...
    // (in java from any where in the same package)
    protected String name;
    protected String emailAddress;
    protected String phone;
    protected int yearOfBirth;
    
    
    public Employee()
    {
        System.out.println("hey there! this is the no par. con. of employee (supper) class");
    }

    public Employee(String name, String emailAddress, String phone, int yearOfBirth) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
}