public class Tree extends Plant {
    private double height;

    public Tree(String rodzaj, double height) {
        super(rodzaj);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }
}
