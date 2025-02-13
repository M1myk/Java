public class Tree extends Plant implements Comparable<Tree>{
    private int height;

    public Tree(int height)
    {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Tree o) {
        return Integer.compare(height, o.height);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }
}
