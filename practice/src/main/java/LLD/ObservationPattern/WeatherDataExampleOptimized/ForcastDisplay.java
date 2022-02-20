package LLD.ObservationPattern.WeatherDataExampleOptimized;

public class ForcastDisplay implements iObserver, iDisplayElement{
    WeatherData weatherData;
    float currentPressure = 29.8F;
    float lastPressure;
    public ForcastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("This is the forcast display");
        System.out.println("Current pressure is "+currentPressure+" and the last pressure was "+lastPressure);
    }

    @Override
    public void update() {

        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
