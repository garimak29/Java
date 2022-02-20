package LLD.ObservationPattern.WeatherDataExampleOptimized;

import java.util.ArrayList;

public class WeatherData implements iSubject {
    private ArrayList observers;
    private float temp;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(iObserver observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(iObserver observer) {
        if (observers.indexOf(observer) >= 0)
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i =0;i<observers.size();i++){
            iObserver observer = (iObserver) observers.get(i);
            observer.update();
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

   public void setMeasurement(float temp , float humidity , float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
   }
}
