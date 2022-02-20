package LLD.ObservationPattern.WeatherDataExample;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
    //    new CurrentConditionDisplay(weatherData);
        weatherData.registerObserver(new CurrentConditionDisplay(weatherData));
        // basically if u do not register the observer when the object is created , then its methods will also not called
        // so for static display , u can see that the update method is not called as its is not registered as the observer
       // weatherData.registerObserver(new StaticDisplay(weatherData));
       weatherData.registerObserver(new StaticDisplay(weatherData));
        weatherData.registerObserver(new HeatIndexDisplay(weatherData));
        weatherData.setMeasurement(80 , 65 , 30.6f);
      //  weatherData.setMeasurement(89 , 65 , 30.6f);
    }
}
