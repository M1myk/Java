public class Proccesor {
    private double frequency;
    private int cores;
    private String manufacturer;

    public Proccesor(double frequency, int cores, String manufacturer) {
        setFrequency(frequency);
        setCores(cores);
        setManufacturer(manufacturer);
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
