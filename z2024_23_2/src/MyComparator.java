import java.util.Comparator;

public interface MyComparator {
    public default int compare(int a, int b)
    {
        if(a<b)
        {
            return -1;
        }
        else if(a > b)
        {
            return 1;
        }
        return 0;
    };

}
