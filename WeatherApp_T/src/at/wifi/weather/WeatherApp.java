/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.weather;

/**
 *
 * @author Thomas
 */
public class WeatherApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // WeatherStation anlegen
        WeatherStation station = new WeatherStation("WIFI Linz");
        
        // Messungen hinzufügen
        station.addMeasurement("2021-07-22 08:00:00", 14.0f, 30);
        station.addMeasurement("2021-07-22 09:00:00", 15.0f, 30);
        station.addMeasurement("2021-07-22 10:00:00", 16.0f, 32);
        station.addMeasurement("2021-07-22 11:00:00", 17.0f, 32);
        station.addMeasurement("2021-07-22 12:00:00", 19.0f, 34);
        station.addMeasurement("2021-07-22 13:00:00", 22.0f, 34);
        station.addMeasurement("2021-07-22 14:00:00", 24.0f, 34);
        station.addMeasurement("2021-07-22 15:00:00", 25.0f, 34);
        station.addMeasurement("2021-07-22 16:00:00", 24.5f, 34);
        station.addMeasurement("2021-07-22 17:00:00", 23.0f, 34);
        station.addMeasurement("2021-07-22 18:00:00", 22.5f, 38);
        station.addMeasurement("2021-07-22 19:00:00", 21.0f, 38);
        station.addMeasurement("2021-07-22 20:00:00", 20.5f, 38);
        
        // Messungen mit Fehlern hinzufügen
        station.addMeasurement("2021-07-22 21:00:00", 20.5f, 380);
        station.addMeasurement("2021-07-22 22:00:00", 120.5f, 380);
        
        // Ausgabe der WeatherStation
        System.out.println(station);
        
        // Messung mit niedrigster Temperatur ermitteln und ausgeben
        System.out.println("\nMessung mit niedrigster Temperatur:");
        Measurement min = station.minTemperatureMeasurement();
        System.out.println(min);
        
        // Messung mit höchster Temperatur ermitteln und ausgeben
        System.out.println("\nMessung mit höchster Temperatur:");
        Measurement max = station.maxTemperatureMeasurement();
        System.out.println(max);
        
        // Durchschnittstemperatur ermitteln und ausgeben
        float avgTemp = station.avgTemperature();
        System.out.println("\nDurchschnittstemperatur: " + avgTemp);
        
        // Anzahl an Messungen in der WeatherStation ermitteln und ausgeben
        int countMeasurements = station.countMeasurements();
        System.out.println("\nAnzahl Messungen: " + countMeasurements);
    }
    
}
