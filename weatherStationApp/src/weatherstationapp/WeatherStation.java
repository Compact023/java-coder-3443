/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstationapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author admin
 */
public class WeatherStation {

    private String location;
    private ArrayList<Measurement> measurements;
    
    public WeatherStation(String location) {
        this.location = location;
        this.measurements = new ArrayList<Measurement>();
    }

    public WeatherStation(String location, ArrayList<Measurement> measurements) {
        this.location = location;
        this.measurements = measurements;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMeasurements(Measurement measurements) {
        this.measurements.add(measurements);
    }

    public void addMeasurement(String time, float temperature, float humidity) throws ParseException{
        SimpleDateFormat formatter5=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date timeInDate = formatter5.parse(time);
        Measurement newMeasurement = new Measurement(timeInDate, temperature, humidity);
        if (newMeasurement.getTemperature() >= -80 && newMeasurement.getTemperature() <= 80) {
            if (newMeasurement.getHumidity() >= 0 && newMeasurement.getHumidity() <= 100) {
                System.out.println("Measurement was added!");
                this.measurements.add(newMeasurement);
            } else {
                System.err.println("Humidity isn't in a valid range! (0-100)");
            }
        } else {
            System.err.println("Temperature and/or Humidity isn't in a valid range! (Temperature:-80°C - +80°C /Humidity:0-100)");
        }
    }
    
    public Measurement maxTemperatureMeasurement(){
        float maxTemp = -80;
        Measurement maxMeasurement = new Measurement();
        for(Measurement measurement : this.measurements){
            float temp = measurement.getTemperature();
            if (temp >= maxTemp){
               maxTemp = temp;
               maxMeasurement = measurement;
            }
        }
        return maxMeasurement;
    }
    
    public Measurement minTemperatureMeasurement(){
        float minTemp = 80;
        Measurement minMeasurement = new Measurement();
        for(Measurement measurement : this.measurements){
            float temp = measurement.getTemperature();
            if (temp <= minTemp){
               minTemp = temp;
               minMeasurement = measurement;
            }
        }
        return minMeasurement;
    }
    
    public int countMeasurements(){
        int i =0;
        for(Measurement measurement : this.measurements){
            i++;
        }
        return i;
    }
    
    public float avgTemperature(){
        float avgTemp = 0;
        for(Measurement measurement : this.measurements){
            avgTemp += measurement.getTemperature();
        }
        
        return avgTemp / countMeasurements();
    }
    

    @Override
    public String toString() {
        return "WheaterStation{" + "location=" + location + ", measurements=" + countMeasurements() + '}';
    }

}
