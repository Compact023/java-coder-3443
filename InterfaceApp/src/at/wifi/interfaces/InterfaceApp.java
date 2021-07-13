/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class InterfaceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Transportable> transporter = new ArrayList<Transportable>();
        
        transporter.add(new Desk(100f, 60f, 40f, 1.2f));
        transporter.add(new Sheep("Dolly", 60f, 1.5f, 0.6f, 1.1f, "Shropshire"));
        
        float totalWeight = 0.0f;
        for (Transportable item : transporter) {
            System.out.println(item);
            totalWeight += item.weight();
        }
        System.out.println("Gesamtgewicht: " + totalWeight);
    }
    
}
