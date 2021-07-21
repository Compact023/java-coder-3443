/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.weather;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Thomas
 */
public class WeatherStation {
    private String name;
    private List<Measurement> measurements;

    public WeatherStation(String name) {
        this.name = name;
        this.measurements = new LinkedList<Measurement>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Measurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    @Override
    public String toString() {
        return "WeatherStation{" + "name=" + name + ", measurements=" + measurements.size() + '}';
    }
    
    public void addMeasurement(String time, float temperature, float humidity) {
        if (temperature > 80 || temperature < -80) {
            System.out.println("Ungültige Temperatur - muss zwischen -80 und +80 °Celsius liegen.");
        } else if (humidity > 100 || humidity < 0) {
            System.out.println("Ungültige Luftfeuchtigkeit - muss zwischen 0 und 100 liegen.");
        } else {
            Date measurementTime = null;
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                measurementTime = formatter.parse(time);
            } catch (ParseException ex) {
                // ToDo: log exception
            }
            
            this.measurements.add(new Measurement(measurementTime, temperature, humidity));
        }
    }
    
    public Measurement maxTemperatureMeasurement() {
        Measurement max = null;
        
        for (Measurement measurement : this.measurements) {
            if (max == null || max.getTemperature() < measurement.getTemperature()) {
                max = measurement;
            }
        }
        
        return max;
    }
    
    public Measurement minTemperatureMeasurement() {
        Measurement min = null;
        
        for (Measurement measurement : this.measurements) {
            if (min == null || min.getTemperature() > measurement.getTemperature()) {
                min = measurement;
            }
        }
        
        return min;
    }
    
    public float avgTemperature() {
        float sum = 0;
        
        for (Measurement measurement : this.measurements) {
            sum += measurement.getTemperature();
        }
        
        return sum / this.countMeasurements();
    }
    
    public int countMeasurements() {
        return this.getMeasurements().size();
    }
}
