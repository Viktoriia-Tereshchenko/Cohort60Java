package homework_26;

public class Banana extends Fruit{

    private String exportCountry;

    public Banana(String name, double weight, String color) {
        super(name, weight, color);
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }
}
