package LLD.ObservationPattern.WeatherDataExampleJavaBuildInFunction;

import LLD.ObservationPattern.WeatherDataExample.iDisplayElement;
import LLD.ObservationPattern.WeatherDataExample.iObserver;
import LLD.ObservationPattern.WeatherDataExample.iSubject;

import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {

    private float temp;
    private float humidity;
    private iSubject weatherData;

    public CurrentConditionDisplay (iSubject weatherData ){
        this.weatherData = weatherData;
    }



    @Override
    public void update(Observable o, Object arg) {

    }
}
