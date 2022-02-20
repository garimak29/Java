package LLD.ObservationPattern.WeatherDataExample;

public class StaticDisplay implements iObserver , iDisplayElement{
    float temp ;
    float pressure;
    iSubject weatherData;
    public StaticDisplay(iSubject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("This is static display");
        System.out.println("Current Condition :"+ temp +" F degree and "+pressure+ " pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure = humidity;
        display();
    }
}
