package algorithm;

import utilities.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(2, "C");
        map.put(4, "D");


        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Person, String> peopleMap = new HashMap<>();
        peopleMap.put(new Person("Alice", 1), "Developer");
        peopleMap.put(new Person("Bob", 2), "Designer");
        peopleMap.put(new Person("Alice", 1), "Manager");

        System.out.println(countUniqueKeys(map));
        System.out.println(countUniqueKeys(peopleMap));

    }

    public static <K, V> int  countUniqueKeys(HashMap<K, V> map)
    {
        return map.keySet().size();
    }
}
