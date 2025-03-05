package homework_27.components;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Storage storage) {
        this.storage = storage;
        this.processor = new Processor("Intel", "Core i5", 2.6, 4);
        this.memory = new Memory("Corsair", "ValueSelect");
    }

    public String toString() {

        StringBuilder sb = new StringBuilder("Computer { ");
        sb.append("processor=").append(processor).append(processor.info());
        sb.append(", memory=").append(memory);
        sb.append(", storage=").append(storage).append(storage.info()).append(" }");

        return sb.toString();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
