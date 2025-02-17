package art;

import java.util.ArrayList;

public class ArtGallery {
    private String name;
    private static ArtGallery instance;

    private ArtGallery(String name)
    {
        this.name = name;
    }


    public static ArtGallery getInstance(String name) {
        if(instance == null)
        {
            instance = new ArtGallery(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ArtGallery{" +
                "name='" + name + '\'' +
                '}';
    }
}
