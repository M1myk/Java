public abstract class WorkTool {
    protected String name;
    protected int productionYear;
    public abstract void use();

    public WorkTool(String name, int productionYear)
    {
        this.name = name;
        this.productionYear = productionYear;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "WorkTool{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }


}
