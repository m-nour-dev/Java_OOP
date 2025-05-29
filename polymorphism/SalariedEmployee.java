/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author muhammed nur
 */
public class SalariedEmployee extends Employee {
    
    float bonus;

    public SalariedEmployee(float bonus, String name, String email, String department, String addres, float salary) {
        super(name, email, department, addres, salary);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public float getSalary()
    {
        return super.getSalary() + bonus;
        //( return salary + bonus) is correct if salary's acscees modifire be protected
    }
    
    
    
    
}
