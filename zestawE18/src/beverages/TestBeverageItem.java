package beverages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestBeverageItem {
    public static void main(String[] args)
    {
        BeverageItem item1 = new BeverageItem("paczek", 20, 4.8);
        BeverageItem item2 = new BeverageItem("paczek", 20, 4.1);
        BeverageItem item3 = new BeverageItem("paczek", 20, 5.9);
        BeverageItem item4 = new BeverageItem("paczek", 20, 4.1);

        List<BeverageItem> items = new ArrayList<BeverageItem>();

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        for(BeverageItem item : items)
        {
            System.out.println(item);
        }

        Collections.sort(items);
        System.out.println("---------------------");

        for(BeverageItem item : items)
        {
            System.out.println(item);
        }


    }
}
