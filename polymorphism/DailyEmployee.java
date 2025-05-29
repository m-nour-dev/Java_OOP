/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author muhammed nur
 */
public class DailyEmployee extends Employee {
    
    private float workDayPrice;
    private int dailyRate;

    public DailyEmployee(float workDayPrice, int dailyRate, String name, String email, String department, String addres, float salary) {
        super(name, email, department, addres, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
    
    
    @Override
    public float getSalary()
    {
        return workDayPrice*dailyRate;
    }
}
