public class Triple <T>{
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {this.first = first;this.second = second;this.third = third;}

    public T getFirst() {return first;}
    public T getSecond() {return second;}
    public T getThird() {return third;}
    public void setFirst(T first) {this.first = first;}
    public void setSecond(T second) {this.second = second;}
    public void setThird(T third) {this.third = third;}

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }


    public static Bird findMin(Triple<? extends Bird> birds)
    {
        Bird min = birds.getFirst();

        if(birds.getSecond().compareTo(min) < 0)
        {
            min = birds.getSecond();
        }
        if(birds.getThird().compareTo(min) < 0)
        {
            min = birds.getThird();
        }
        return min;
    }
}
