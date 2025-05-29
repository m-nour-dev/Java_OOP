/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author muhammed nur
 */
public class CarV2 implements SelfDrivable,Movable{
    
    private int x,y;
    private int numberOfPassenger;
    
    public CarV2(){}
    
    public CarV2(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void distination(String d) {
        System.out.println("distination " +d);
    }

    @Override
    public void drive() {
        System.out.println("drive v2");
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }
    
    
}
