package homework_32.task1;

public class Pair <T>{

    private T value1;
    private T value2;

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst()  {
        return value1;
    }

    public T getSecond() {
        return value2;
    }

    public void setFirst(T value) {
        this.value1 = value;
    }

    public void setSecond(T value) {
        this.value2 = value;
    }

    public void swap() {
        T temp = value1;
        value1 = value2;
        value2 = temp;
    }

    // для проверок
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append("value1 = ").append(value1);
        sb.append(", value2 = ").append(value2).append("}");
        return sb.toString();
    }
}
