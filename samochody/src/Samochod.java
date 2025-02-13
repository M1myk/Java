public class Samochod {
    public String marka;
    public String model;
    public int rok;
    public String opony;
    public int speed;

    public Samochod(String marka, String model, int rok, String opony, int speed)
    {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.opony = opony;
        this.speed = speed;
    }

    public boolean accelerate(int value)
    {
        System.out.println("Stara predkosc: " + speed);

        if(value > 0 )
        {
            speed = speed + value;
            System.out.println("Nowa predkosc: " + speed );
            return true;
        }
        System.out.println("Predkosc nie zostala zmieniona");
        return false;

    }

    public boolean decelerate(int value)
    {
        System.out.println("Stara predkosc: " + speed);
        if(speed - value > 0)
        {
            speed = speed - value;
            System.out.println("Nowa predkosc: " + speed );
            return true;
        }
        System.out.println("Predkosc nie zostala zmieniona");
        return false;

    }

    private String engineFailure()
    {
        return "kurwa rozjebali";
    }

    public void getEngineFailure()
    {
        System.out.println(engineFailure());
    }




    public String getMarka()
    {
        return marka;
    }

    public String getModel()
    {
        return model;
    }

    public int getRok()
    {
        return rok;
    }

    public String getOpony()
    {
        return opony;
    }

    public int getDpeed()
    {
        return speed;
    }
}
