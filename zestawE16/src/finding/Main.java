package finding;

import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");

        System.out.println(findValueByKey(map, 4));
        System.out.println(findValueByKey(map, null));


    }

    public static <K, V> V findValueByKey(HashMap<K, V> table, K key)
    {

        if(key == null || table == null || table.isEmpty())
        {
            return null;
        }
        return table.get(key);
    }
}
