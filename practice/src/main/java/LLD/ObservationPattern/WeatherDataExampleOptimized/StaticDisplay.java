package LLD.ObservationPattern.WeatherDataExampleOptimized;

public class StaticDisplay implements iObserver, iDisplayElement {
    float temp ;
    float pressure;
    WeatherData weatherData;
    public StaticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("This is static display");
        System.out.println("Current Condition :"+ temp +" F degree and "+pressure+ " pressure");
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.pressure = weatherData.getHumidity();
        display();
    }
}
