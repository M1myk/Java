public class  Animal {
    private String name;


    public Animal(String name)
    {
        setName(name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Animal[" +
                "name: '" + name + '\'' +

                ']';
    }

}

class AnimalsAvarage
{
    public static void  findMinMax(Dog[] dogs, Pair<?super Dog> result)
    {
        if(dogs.length != 0)
        {
            Dog min = dogs[0];
            Dog max = dogs[0];

            for(var elem : dogs)
            {
                if(elem.getAge() > max.getAge())
                {
                    max = elem;
                }
                if(elem.getAge() < min.getAge())
                {
                    min = elem;
                }
            }
            result.first = min;
            result.second = max;
        }
        else
        {
            System.out.println("--------");
        }
    }
}
