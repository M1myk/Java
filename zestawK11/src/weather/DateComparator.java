package weather;

import java.util.Comparator;

public class DateComparator implements Comparator<WeatherForecast> {
    public DateComparator() {}
    @Override
    public int compare(WeatherForecast o1, WeatherForecast o2) {
        return CharSequence.compare(o2.getData(), o1.getData());
    }


}
