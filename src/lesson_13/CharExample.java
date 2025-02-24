package lesson_13;

public class CharExample {

    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита (символ, соответствующий коду 65 в десятичной СС)
        char a2 = 0x41; // Присваиваю число в 16-формате без ведущих нулей. Что соответствует той же букве А
        // a2 = 0x0041;
        char a3 = '\u0041'; // Еще один способ задать код в 16-ном формате
        char x = '\u15EE';

        // В 16-й системе счисления (СС) используются: 0..9 ABCDEF

        // коды хранятся в UNICODE !

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("x: " + x);
        System.out.println("====================");

        char letter = 'A';
        letter++;  // Увеличиваю код символа, который храниться в переменной
        System.out.println("letter: " + letter);

        char digit = 48;
        System.out.println("digit: " + digit);

        digit += 5;  // digit = digit + 5
        System.out.println("digit: " + digit);

        /*
        0...9 -> соответствуют кодам 48...57
        A...Z -> соответствуют кодам 65...90
        a...z -> соответствуют кодам 97...122
         */

        //digit = digit + 3;  // ошибка
        digit = (char) (digit + 3);
        byte b1 = 120;
        //b1 = b1 + 1;  // ошибка
        b1 = (byte) (b1 + 1);

        char x1 = 12853;
        System.out.println("x1: " + x1);

        // Чтобы получить код символа в 10-й СС нужно привести тип char к типу int
        System.out.println("int из char даст 10-й код символа: " + (int) digit);
        System.out.println(0 + digit);

    }
}
