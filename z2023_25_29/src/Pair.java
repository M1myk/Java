public class Pair <T>{
    private T first;
    private T second;

    public Pair(T first, T second) {this.first = first;this.second = second;}

    public T getFirst() {return first;}
    public T getSecond() {return second;}
    public void setFirst(T first) {this.first = first;}
    public void setSecond(T second) {this.second = second;}

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void findMinMax(Tree[] trees, Pair<? super Tree> result)
    {
        if(trees.length == 0)
        {
            return;
        }

        Tree min = trees[0];
        Tree max = trees[0];

        for(int i = 1; i < trees.length; i++)
        {
            if(trees[i].getHeight() < min.getHeight())
            {
                min = trees[i];
            }

            if(trees[i].getHeight() > max.getHeight())
            {
                max = trees[i];
            }
        }
        result.first = min;
        result.second = max;
    }
}
