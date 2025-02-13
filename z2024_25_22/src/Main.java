public class Main {
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar();
        Car car2 = new Car();
        ElectricCar car3 = new ElectricCar();


        System.out.println(compareObjects(car1, car2));
        System.out.println(compareObjects(car1, car3));

    }
    public static <T extends Car> boolean compareObjects(T obj1, T obj2)
    {
        if(obj1.getClass().equals(obj2.getClass()))
        {
            return true;
        }
        return false;
    }
}