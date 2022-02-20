package LLD.ObservationPattern.WeatherDataExample;

public class CurrentConditionDisplay implements iObserver , iDisplayElement{

    private float temp;
    private float humidity;
    private iSubject weatherData;

    public CurrentConditionDisplay (iSubject weatherData ){
        this.weatherData = weatherData;
    }
    @Override
    public void display() {
        System.out.println("This is current condition display");
        System.out.println("Current Condition :"+ temp +" F degree and "+humidity+ " humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
