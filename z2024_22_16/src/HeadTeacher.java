public class HeadTeacher extends Teacher implements Cloneable {
    private double bonus;

    public HeadTeacher(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "HeadTeacher{" +
                "bonus=" + bonus +
                '}';
    }
}
