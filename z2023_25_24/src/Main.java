public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Eagle", 27);
        Bird bird2 = new Bird("Pantera", 26);
        Eagle bird3 = new Eagle("Eagle", 26, 14);
        Eagle bird4 = new Eagle("Eagle", 20, 15);

        Triple<Bird> comparing = new Triple<>(bird4, bird1, bird3);
        System.out.println(comparing);


        System.out.println(Triple.findMin(comparing));

    }
}