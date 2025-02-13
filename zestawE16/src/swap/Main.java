package swap;

public class Main {
    public static void main(String[] args)
    {
        VideoGames game1 = new VideoGames("CS2", "Valve" , 8.2F);
        VideoGames game2 = new VideoGames("Fortnite", "Epic Games" , 7.1F);
        VideoGames game3 = new VideoGames("Pubg", "Nie wiem" , 5.8F);
        VideoGames game4 = new VideoGames("Minecraft", "Mojang" , 9.6F);

        VideoGames[] games = {game1, game2, game3, game4};
        for(VideoGames game : games)
            System.out.println(game);
        System.out.println("----------------------");

        swapElements(games, 0, 3);
        for(VideoGames game : games)
            System.out.println(game);


    }
    public static <T> void swapElements(T[] tab, int a, int b)
    {
        T temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }
}
