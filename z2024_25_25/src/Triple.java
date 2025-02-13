public class Triple<T> {
    private T a;
    private T b;
    private T c;

    public Triple(T a, T b, T c)
    {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }

    public static Bird findMin(Triple<? extends Bird> triple)
    {
        if(triple.getA().equals(triple.getB().equals(triple.getC())))
        {
            return null;
        }
        if(triple.getA().compareTo(triple.getB()) < 0 && triple.getA().compareTo(triple.getC()) < 0)
        {
            return triple.getA();

        }
        else if(triple.getB().compareTo(triple.getA()) < 0 && triple.getB().compareTo(triple.getC()) < 0)
        {
            return triple.getB();
        }
        else
        {
            return triple.getC();
        }
    }
}
