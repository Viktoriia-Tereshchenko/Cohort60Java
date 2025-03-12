package lesson_32;

public class TypeErasure <E>{
    private E/*Object*/ value;

    public TypeErasure(E/*Object*/ value) {
        this.value = value;
    }

    // приведение типов
    public E/*Integer*/ getValue() {
        return /*(Integer)*/value;
    }

    public void setValue(E/*Object*/  value) {
        this.value = value;
    }

    // Нельзя создавать перегруженный метод, отличающейся только типами параметров
    public void method(TypeErasure<Integer> typeErasure) {
        System.out.println(typeErasure);
    }
//    public void method(TypeErasure<String> typeErasure) {
//        System.out.println(typeErasure);
//    }

    // Нельзя создавать объекты типа <E> !!!


    public static void main(String[] args) {
        TypeErasure<Integer> t = new TypeErasure<>(5);
    }
}
