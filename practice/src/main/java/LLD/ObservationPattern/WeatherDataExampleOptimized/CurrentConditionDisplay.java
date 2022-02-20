package LLD.ObservationPattern.WeatherDataExampleOptimized;

public class CurrentConditionDisplay implements iObserver, iDisplayElement {

    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay (WeatherData weatherData ){
        this.weatherData = weatherData;
    }
    @Override
    public void display() {
        System.out.println("This is current condition display");
        System.out.println("Current Condition :"+ temp +" F degree and "+humidity+ " humidity");
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
