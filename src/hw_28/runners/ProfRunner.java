package hw_28.runners;

public class ProfRunner extends AmateurRunner {

    {
        typeRunner = "Спортсмен-профи";
    }

    public ProfRunner() {
        super(25, 5);
    }

    public ProfRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
}
