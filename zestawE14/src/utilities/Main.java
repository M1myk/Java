package utilities;

import university.Student;

public class Main {
    public static void main(String[] args)
    {
        Person person1 = new Person("Dmytro", 19);
        Person person2 = new Person("Dmytro", 20);
        Person person3 = new Person("Dmytro", 20);
        Person person4 = new Person("Dmytro", 20);
        Person person5 = new Person("Dmytro", 20);

        Person[] persons = {person1, person2, person3, person4, person5};

        System.out.println(countLessThanOrEqual(persons, person3));
    }

    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] tab, T element)
    {
        int count = -1;
        for (T t : tab) {
            if (t.compareTo(element) <= 0) {
                count++;
            }
        }
        return count;
    }
}
