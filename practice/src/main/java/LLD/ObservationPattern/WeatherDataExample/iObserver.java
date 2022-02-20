package LLD.ObservationPattern.WeatherDataExample;

public interface iObserver {
    public void update(float temp , float humidity , float pressure);
}
