/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenziaviaggi;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class AgenziaViaggi
{
    private ArrayList<Camping> camps = new ArrayList<>();

    public void main(String[] args)
    {
        System.out.println("Organizzazione dei viaggi organizzati");
        CampFR camping_FR = new CampFR();
        camps.add(camping_FR);
        CampSP camping_SP = new CampSP();
        camps.add(camping_SP);
        CampDE camping_DE = new CampDE();
        camps.add(camping_DE);
        
        for(Camping camp : camps)
        {
            String lang = camp.getLanguage();
            Bus bus = new Bus(lang);
            bus.run();
        }
        
    }
}
