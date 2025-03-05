package homework_27.components;

public class Storage extends Component{

    private String type;
    private int capacity;

    public Storage(String brand, String model, String type, int capacity) {
        super(brand, model);
        this.type = type;
        this.capacity = capacity;
    }

    public String info() {
        //return String.format("Storage{ type = %s, capacity = %s }",type, capacity);
        return String.format("{type = %s, capacity = %s}",type, capacity);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
