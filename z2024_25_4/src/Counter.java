import java.util.ArrayList;

public class Counter<T> {
    private ArrayList<T> lista = new ArrayList<>();

    public Counter() {}

    public void add(T element)
    {
        lista.add(element);
    }

    public int getCount()
    {
        return lista.size();
    }


}
