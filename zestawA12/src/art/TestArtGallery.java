package art;

public class TestArtGallery {
    public static void main(String[] args)
    {
        ArtGallery gallery1 = ArtGallery.getInstance("Galeria Klasyczna");
        System.out.println(gallery1);

        ArtGallery gallery2 = ArtGallery.getInstance("Galeria Nowoczesna");
        System.out.println(gallery2);

        System.out.println(gallery1.equals(gallery2));

        System.out.println(gallery1.getName());
        System.out.println(gallery2.getName());

    }
}
