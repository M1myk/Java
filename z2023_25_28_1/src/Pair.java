public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
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


    public static void findMinMax(Dog[] dogs, Pair<?super Dog> result)
    {
        Dog min = dogs[0];
        Dog max = dogs[1];

        for(Dog d : dogs)
        {
            if(d.getAge() > max.getAge())
            {
                max = d;
            }
            if(d.getAge() < min.getAge())
            {
                min = d;
            }
        }
        result.first = min;
        result.second = max;
    }
}
