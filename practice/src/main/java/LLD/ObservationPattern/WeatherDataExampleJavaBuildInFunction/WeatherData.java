
package LLD.ObservationPattern.WeatherDataExampleJavaBuildInFunction;

import LLD.ObservationPattern.WeatherDataExample.iSubject;

import java.util.ArrayList;

public class WeatherData implements iSubject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }


    @Override
    public void registerObserver(LLD.ObservationPattern.WeatherDataExample.iObserver observer) {

    }

    @Override
    public void removeObserver(LLD.ObservationPattern.WeatherDataExample.iObserver observer) {

    }

    @Override
    public void notifyObserver() {
        for(int i =0;i<observers.size();i++){
            iObserver observer = (iObserver) observers.get(i);
            observer.update(temp , humidity, pressure);
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
