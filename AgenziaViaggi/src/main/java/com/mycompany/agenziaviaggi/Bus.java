/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenziaviaggi;

/**
 *
 * @author isaac
 */
public class Bus
{
    private String licensePlate;
    private String language;
    
    public Bus(String l)
    {
        licensePlate = "BU" + Math.random()*100 + "HJ";
        language = l;
    }
}
