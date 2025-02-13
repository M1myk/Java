import com.sun.source.util.Trees;

public class Main {
    public static void main(String[] args)
    {

        Tree[] trees = {
                new Tree("Dzewo", 28.8),
                new Tree("Dzewo", 21.2),
                new Tree("Dzewo", 21),
                new Tree("Dzewo", 25),
                new Tree("Dzewo", 29.8)};

        Pair<Tree> result = new Pair<>(null, null);

        Pair.findMinMax(trees, result);
        System.out.println(result);
    }
}