package transport;

public class TestBusRoute {
    public static void main(String[] args)
    {
        BusRoute busRoute1 = new BusRoute("A11", "Gutkowo", "Olsztyn");
        BusRoute busRoute2 = new BusRoute("A-B15", "Warszawa", "Krakow");

        busRoute1.printDetails();
        System.out.println("--------------------------");
        busRoute2.printDetails();
        System.out.println(busRoute1.isLongRoute());
        System.out.println(busRoute2.isLongRoute());
    }
}
