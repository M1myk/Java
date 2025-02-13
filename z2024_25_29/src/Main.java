public class Main {
    public static void main(String[] args) {

        Tree[] trees = new Tree[4];

        Tree tree1 = new Tree(49);
        Tree tree2 = new Tree(52);
        Tree tree3 = new Tree(61);
        Tree tree4 = new Tree(58);

        trees[0] = tree1;
        trees[1] = tree2;
        trees[2] = tree3;
        trees[3] = tree4;

        Pair result = new Pair<>();

        System.out.println(findMinMaxHeight(trees, result));

    }

    public static <T extends Comparable<T>> Pair findMinMaxHeight(Tree[] tab, Pair<? super Tree> result)
    {
        Tree min = tab[0];
        Tree max = tab[0];

        for(Tree element : tab)
        {
            if(element.compareTo(min) < 0)
            {
                min = element;
            }
            if(element.compareTo(max) > 0)
            {
                max = element;
            }
        }
        result.setFirst(min);
        result.setSecond(max);

        return  result;

    }
 }