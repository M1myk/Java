import java.util.ArrayList;

public class GenericQueue<T> {

    ArrayList<T> queue = new ArrayList<>();



    public void enqueue(T element)
    {
        queue.add(element);
    }

    public T dequeue()
    {
        T element = queue.getLast();
        queue.removeLast();
        return element;

    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "queue=" + queue +
                '}';
    }
}
