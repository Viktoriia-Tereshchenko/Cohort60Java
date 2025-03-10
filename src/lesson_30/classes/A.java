package lesson_30.classes;

public class A extends C {
    public static void main(String[] args) {

        A a = new A();
        a.b();
    }
}


class B {
    void b(){
        System.out.println("B");
    }
}


class C {
    void c(){
        System.out.println("C");
    }

    void b(){
        System.out.println("B from C class");
    }
}
