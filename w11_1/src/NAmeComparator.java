import java.util.Comparator;

public class NAmeComparator implements Comparator<Person> {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "NAmeComparator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2)
    {
        int base = o1.getAge() - o2.getAge();
        if (base != 0)
            return o1.getAge() - o2.getAge();

        return 0;
    }
}
