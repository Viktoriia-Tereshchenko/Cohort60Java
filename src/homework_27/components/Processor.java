package homework_27.components;

import java.time.Clock;

public class Processor extends Component{

    private double clockSpeed;
    private int cores;

    public Processor(String brand, String model, double clockSpeed, int cores) {
        super(brand, model);
        this.clockSpeed = clockSpeed;
        this.cores = cores;
    }

    public String info() {
        //return String.format("Processor{ clockSpeed=%.2fGHz, cores=%d }", clockSpeed, cores);
        return String.format("{clockSpeed=%.2fGHz, cores=%d}", clockSpeed, cores);
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public int getCores() {
        return cores;
    }
}
