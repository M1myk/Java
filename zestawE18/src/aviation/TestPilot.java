package aviation;

public class TestPilot {
    public static void main(String[] args)
    {
        double[] hours = {6,9,2,7,1};

        Pilot pilot1 = new Pilot("Markian", hours);

        try
        {
            Pilot pilot2 = (Pilot) pilot1.clone();
            pilot2.setFlightHours(3,10);
            System.out.println(pilot1);
            System.out.println(pilot2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
