package WeatherStation;

import java.util.Date;

/**
 *
 * @author BERTL
 */
public class Measurement {
    protected Date time;
    protected float temperature;
    protected float humidity;

    public Measurement(float temperature, float humidity) {
        this.time = new Date();
        this.temperature = temperature;
        this.humidity = humidity;
    }
        
    public Measurement(Date time, float temperature, float humidity) {
        this.time = time;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Measurement{" + "time=" + time + ", temperature=" + temperature + ", humidity=" + humidity + '}';
    }
 
}

