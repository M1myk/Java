import java.util.ArrayList;
import java.util.List;

public class Teacher implements Cloneable{
    private String name;
    private List<Integer> oceny ;

    public Teacher(String name, List<Integer> oceny){this.name = name; this.oceny = new ArrayList<>(oceny);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOceny(int index, int ocena) {
        if(this.oceny.get(index) == null || index < 0 || index >= this.oceny.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else
        {
            this.oceny.set(index, ocena);
        }

    }

    public List<Integer> getOceny() {
        return oceny;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", oceny=" + oceny +
                '}';
    }
}
