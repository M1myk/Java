package games;

public class TestGames {
    public static void main(String[] args)
    {
        double[] ratings = {3,7,2,7,8};
        double[] ratings1 = {4,9,1,7,9};
        ComputerGame game1 = new ComputerGame("CS2", "Valve", ratings);
        ComputerGame game2 = new ComputerGame("CS2", "Valve", ratings1);

        System.out.println(game1);
        System.out.println(game2);

        System.out.println(game1.equals(game2));

        game1.addRating(4.8);
        game1.deleteRating(7);
        System.out.println(game1);

        System.out.println(game1.hashCode());
    }
}
