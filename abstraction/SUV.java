/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author muhammed nur
 */
public class SUV extends Car{
    
    int numberOfWindows;

    public SUV(float height, float weight, int numberOfWheels , int numberOfWidows) {
        super(height, weight, numberOfWheels);
        this.numberOfWindows = numberOfWidows;
        
    }
    
    

    @Override
    void autopilot() {
        System.out.println(" SUV autopilot ");
    }

    @Override
    void streamingServices() {
        System.out.println(" SUV streaming services ");
    }

    @Override
    void parkingSensors() {
        System.out.println(" SUV parking sensors");
    }
    
    
}
