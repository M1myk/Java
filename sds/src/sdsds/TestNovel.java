package sdsds;

public class TestNovel {
    public static void main(String[] args)
    {
        double[] ratings1 = {3,8,3,9,1};
        double[] ratings2 = {4,7,3,5,2};
        Novel novel1 = new Novel("aaa", "bbb", ratings1);
        Novel novel2 = new Novel("ccc", "ddd", ratings2);

        System.out.println(novel1);
        System.out.println(novel2);
        novel1.addRating(11);
        novel1.removeRating(2);

        System.out.println(novel1);

        System.out.println(novel1.equals(novel2));
    }
}
