package LLD.ObservationPattern.WeatherDataExampleOptimized;

public interface iSubject {
    public void registerObserver(iObserver observer);
    public void removeObserver(iObserver observer);
    public void notifyObserver();
}
