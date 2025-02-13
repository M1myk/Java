public class Main {


    public static <T extends Bird> T findMin(Triple<? extends Bird> triple) {

        T first = (T)triple.getA();
        T second = (T)triple.getB();
        T third = (T)triple.getC();
       if(first.compareTo(second) == 0 &&  second.compareTo(third) == 0)
       {
           return null;
       }

       if(first.compareTo(second) < 0 && first.compareTo(third) < 0)
       {
           return first;
       }
       else if(second.compareTo(first) < 0 && second.compareTo(third) < 0)
       {
           return second;
       }
       else
       {
           return third;
       }


    }

    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Eagleeeee", 50);
        Bird kolibri1 = new Bird("Kolibri");
        Eagle eagle2 = new Eagle("Eagle", 40);
        Bird solowej1 = new Bird("Solowe");
        Eagle eagle3 = new Eagle("Eagle", 30);



        Triple<Bird> min = new Triple<>(kolibri1, eagle1, solowej1);
        Bird miin = findMin(min);
        System.out.println(miin);


    }


}