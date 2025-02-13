public class Car {

    public static <T> boolean compareobjects(Car obj1, Car obj2)
    {
        if(obj1.getClass() == obj2.getClass())
        {
            return true;
        }
        return false;
    }
}
