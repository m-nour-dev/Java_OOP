/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author muhammed nur
 */
public class BMWAli extends BMW {

    public BMWAli(float height, float weight, int numberOfWheels) {
        super(height, weight, numberOfWheels);
    }
    
    @Override
    void autopilot()
    {
        super.autopilot();
    }
    
    @Override
    void streamingServices() 
    {
        System.out.println(" BMW streaming services ");
    }

    @Override
    void parkingSensors() 
    {
        System.out.println(" BMW parking sensors");
    }
    
}
