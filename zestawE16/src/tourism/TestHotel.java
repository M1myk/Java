package tourism;

public class TestHotel {
    public static void main(String[] args)
    {
        Hotel hotel1 = new Hotel("Galicja", 120);
        Hotel hotel2 = new Hotel("Galicja", -10);

        try
        {
            Hotel hotel3 = (Hotel) hotel1.clone();
            hotel3.setCapacity(100);

            System.out.println(hotel3);



        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }



        System.out.println(hotel1);
        System.out.println(hotel2);

    }
}
