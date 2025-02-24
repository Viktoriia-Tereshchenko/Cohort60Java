package lesson_14;

public class StrinEquals {
    public static void main(String[] args) {

        int x = 10;

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        // ВАЖНО !
        // Оператор == сравнивает значения, которые хранятся в переменных

        boolean b1 = str1 == str2;
        System.out.println("str1 == str2 : " + b1);    // true
        System.out.println("str1 == str3 : " + (str1 == str3));    // false
        System.out.println("str1 == str4 : " + (str1 == str4));    // false
        System.out.println("str2 == str4 : " + (str2 == str4));    // false

        System.out.println("\n===============\n");

        // ВАЖНО!
        // Для сравнения строк по их значению мы ДОЛЖНЫ использовать метод equals()

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean b2 = str1.equals(str2);
        System.out.println("\nstr1.equals(str2): " + b2);
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        System.out.println("str2.equals(str4): " + str2.equals(str4));


        // Мы можем сравнивать значения игнорируя регистр букв
        // метод .equalsIgnoreCase()

        // java равно по значению Java
        System.out.println("\n\"java\".equalsIgnoreCase(\"JAVA\"): " + str1.equalsIgnoreCase(str3));  // true

    }
}
