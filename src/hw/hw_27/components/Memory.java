package hw.hw_27.components;

import homework_27.components.Component;

public class Memory extends Component {
    private  final  int size;

    public Memory(String brand, String model, int size) {
        super(brand, model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
