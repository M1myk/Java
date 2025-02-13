//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] tab1 = {1,2,3,4,5,6,7,8,9,10};



        for(int i = 0; i < tab1.length; i++)
        {
            System.out.print(tab1[i]+" ");
        }
        swap(tab1, 2, 8);
        System.out.println();
        for(int i = 0; i < tab1.length; i++)
        {
            System.out.print(tab1[i]+" ");
        }

        GenericQueue<Integer> q = new GenericQueue<>();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);

        System.out.println(q);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q);


    }

    public static <T> void swap(T[] tab, int a, int b)
    {
        T pom = tab[b];
        tab[b] = tab[a];
        tab[a] = pom;
    }


}