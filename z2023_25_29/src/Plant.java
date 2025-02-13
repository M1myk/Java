public class Plant {
    private String rodzaj;

    Plant(String rodzaj) {this.rodzaj = rodzaj;}

    public String getRodzaj() {return rodzaj;}

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "rodzaj='" + rodzaj + '\'' +
                '}';
    }
}
