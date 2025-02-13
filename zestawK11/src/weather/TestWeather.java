package weather;

import java.lang.reflect.Array;
import java.util.*;

public class TestWeather {
    public static void main(String[] args) {
        WeatherForecast weather1 = new WeatherForecast(5, "15-02-2024", 23.7);
        WeatherForecast weather2 = new WeatherForecast(5, "17-02-2024", 21.7);
        WeatherForecast weather3 = new WeatherForecast(5, "13-02-2024", 24.7);
        WeatherForecast weather4 = new WeatherForecast(5, "20-02-2024", 23.7);
        WeatherForecast weather5 = new WeatherForecast(5, "11-02-2024", 24.7);

        List<WeatherForecast> weathers = new ArrayList<WeatherForecast>();
        weathers.add(weather1);
        weathers.add(weather2);
        weathers.add(weather3);
        weathers.add(weather4);
        weathers.add(weather5);

        for(WeatherForecast weather : weathers)
        {
            System.out.println(weather);
        }
        System.out.println();



        weathers.sort(new TemperatureComparator().thenComparing(new DateComparator()));
        for(WeatherForecast weather : weathers)
        {
            System.out.println(weather);
        }


    }
}
