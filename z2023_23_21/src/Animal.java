public class  Animal {
    private String name;
    private int age;

    public Animal(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ']';
    }

    public static <T extends Animal> T findMax(T element1, T element2)
    {
        return element1.getAge() > element2.getAge() ? element1 : element2;
    }
}
