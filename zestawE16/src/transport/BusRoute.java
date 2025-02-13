package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if(routeNumber == null)
        {
            throw new IllegalArgumentException("Route number cannot be null");
        }
    }
    public boolean isLongRoute()
    {
        if(routeNumber.length() > 4)
        {
            return true;
        }

        return false;
    }

    public void printDetails()
    {
        System.out.println("Route number: " + routeNumber + "\nStart location: " + startLocation + "\nEnd location: " + endLocation);

    }

}
