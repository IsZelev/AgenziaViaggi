/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenziaviaggi;

/**
 *
 * @author isaac
 */
public class Bus implements Runnable
{
    private String licensePlate;
    private String language;
    private int nPeople;
    
    public Bus(String l, int np)
    {
        licensePlate = "BU" + Math.random()*1000 + "HJ";
        language = l;
        nPeople = np;
    }
    
    public void run()
    { 
        System.out.println("Il bus " + language + " sta partendo");
        
    }
}
