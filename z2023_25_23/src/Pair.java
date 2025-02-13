public class Pair<T> {
    public T first;
    public T second;

    public Pair() {}



    public Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static Animal findMax(Pair<? extends Animal> pair1)
    {
       Animal first = pair1.first;
       Animal second = pair1.second;

       return first.getAge() > second.getAge() ? first : second;
    }
}
