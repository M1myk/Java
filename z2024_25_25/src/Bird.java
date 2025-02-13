public class Bird implements Comparable<Bird>{
    private String type;

    public Bird(String type)
    {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                '}';
    }


    @Override
    public int compareTo(Bird o) {
        return this.type.length() - o.type.length();
    }
}
