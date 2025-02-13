//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] ratings = {3.8,4.1,9.7,6.4,8.1};
        MusicAlbum muzyka1 = new MusicAlbum("Lalaland", "Homer", ratings);

        System.out.println(muzyka1);

        MusicAlbum muzyka2 = new MusicAlbum("Lalaland", "Adolf", ratings);
        System.out.println(muzyka2);

        System.out.println(muzyka1.equals(muzyka2));

        RockAlbum muzyka3 = new RockAlbum("Lalaland", "Adolf", "Hard Rock",ratings);
        System.out.println(muzyka3);

        RockAlbum muzyka4 = new RockAlbum("Lalaland", "Homer", "Hard Rock",ratings);
        System.out.println(muzyka4);






    }
}