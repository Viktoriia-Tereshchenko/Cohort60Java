package homework_44.task3;
/*
Task 3 Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e
 */

public class Task3 {
    public static void main(String[] args) {

        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));

        System.out.println(StrUtil.getFirstUniqueChar("qqqwwwweeeee7    4545rr"));
        System.out.println(StrUtil.getFirstUniqueChar("1eeeuuuuu55555///119"));
        System.out.println(StrUtil.getFirstUniqueChar("**  @ 4545rr"));
        System.out.println(StrUtil.getFirstUniqueChar(""));
        System.out.println(StrUtil.getFirstUniqueChar("123"));
    }
}
