package homework_32.task3;

public class NumericPair <T extends Number> {

    private T value1;
    private T value2;

    public NumericPair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double sum() {
        if (value1 == null || value2 == null) return -1.7E+308; // обработка ошибки

        return value1.doubleValue() + value2.doubleValue();
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NumericPair{");
        sb.append("value1 = ").append(value1);
        sb.append(", value2 = ").append(value2).append("}");
        return sb.toString();
    }

}
