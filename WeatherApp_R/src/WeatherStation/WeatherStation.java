package WeatherStation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author BERTL
 */
public class WeatherStation {
    protected String name;
    protected List<Measurement> measurements;
    
    public WeatherStation(String name) {
        this.name = name; //warum hier kein new?
        this.measurements = new LinkedList<Measurement>(); // und hier schon?
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

    protected void addMeasurement(String time, float temperature, float humidity) {
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

    public Measurement maxTemperatureMeasurement() { // public Measurement = hier werden die Daten gespeichert oder?
        Measurement max = null;

        for (Measurement measurement : this.measurements) {
            if (max == null || max.getTemperature() < measurement.getTemperature()) { //erklärung pls
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

    public float avgTemperature() { // hier float weil nix gespeichert wird (in List Measurement) sondern nur Rückgabe avgTemp? Korrekt?
        float sum = 0;

        for (Measurement measurement : this.measurements) {
            sum += measurement.getTemperature();
        }
        return sum / countMeasurements();
    }

    protected int countMeasurements() {
        return this.getMeasurements().size();
    }

}
