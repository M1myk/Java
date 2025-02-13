package weather;

public class WeatherForecast {
    private int id;
    private String data;
    private double temperature;

    public WeatherForecast(int id, String data, double temperature)
    {
        this.id = id;
        this.data = data;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public double getTemperature() {
        return temperature;
    }




    @Override
    public String toString() {
        return "WeatherForecast{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
