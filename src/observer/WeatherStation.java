package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        //여기에 다른 디스플레이들을 추가해 update받을 수 있음

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
