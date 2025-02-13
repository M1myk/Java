public class Box<T> {
    T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static <T> boolean isEqual(T obj1, T obj2)
    {
        return obj1.equals(obj2);
    }


}
