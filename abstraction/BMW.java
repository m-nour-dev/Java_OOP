/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author muhammed nur
 */
public abstract class BMW extends Car{

    public BMW(float height, float weight, int numberOfWheels) {
        super(height, weight, numberOfWheels);
    }
    
    
    @Override
    void autopilot()
    {
        System.out.println(" BMW autopilot ");
    }
    

}
